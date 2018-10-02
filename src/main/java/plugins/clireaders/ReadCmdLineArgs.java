package plugins.clireaders;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 * The Class ReadCmdLineArgs.
 * 
 * @author Eedanna K
 */
public class ReadCmdLineArgs {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {

		final Options options = generateOptions();
		final CommandLine commandLine = generateCommandLine(options, args);
		final String username = commandLine.getOptionValue("username");
		final String password = commandLine.getOptionValue("password");
		System.out.println("User Name is :: " + username);
		System.out.println("Password is :: " + password);
	}

	/**
	 * Generate command line.
	 *
	 * @param options
	 *            the options
	 * @param commandLineArguments
	 *            the command line arguments
	 * @return the command line
	 */
	private static CommandLine generateCommandLine(final Options options, final String[] commandLineArguments) {
		final CommandLineParser cmdLineParser = new DefaultParser();
		CommandLine commandLine = null;
		try {
			commandLine = cmdLineParser.parse(options, commandLineArguments);
		} catch (ParseException parseException) {
			System.out.println("ERROR: Unable to parse command-line arguments " + Arrays.toString(commandLineArguments)
					+ " due to: " + parseException);
			try {
				printUsage(options);
				printHelp(options);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		return commandLine;
	}

	/**
	 * Generate options.
	 *
	 * @return the options
	 */
	private static Options generateOptions() {
		final Option usernameOption = Option.builder("username").required(false).hasArg(true).desc("username").build();
		final Option passwordOption = Option.builder("password").required().hasArg(true)
				.desc("password should be encrypted before sending.").build();
		final Options options = new Options();
		options.addOption(usernameOption);
		options.addOption(passwordOption);
		return options;
	}

	/**
	 * Prints the usage.
	 *
	 * @param options
	 *            the options
	 * @throws FileNotFoundException
	 *             the file not found exception
	 */
	private static void printUsage(final Options options) throws FileNotFoundException {
		final HelpFormatter formatter = new HelpFormatter();
		final String syntax = "Main";
		System.out.println("\n=====");
		System.out.println("USAGE");
		System.out.println("=====");
		final PrintWriter pw = new PrintWriter(syntax);
		formatter.printUsage(pw, 80, syntax, options);
		pw.flush();
	}

	/**
	 * Prints the help.
	 *
	 * @param options
	 *            the options
	 */
	private static void printHelp(final Options options) {
		final HelpFormatter formatter = new HelpFormatter();
		final String syntax = "Main";
		final String usageHeader = "Example of Using Apache Commons CLI";
		final String usageFooter = "See http://marxsoftware.blogspot.com/ for further details.";
		System.out.println("\n====");
		System.out.println("HELP");
		System.out.println("====");
		formatter.printHelp(syntax, usageHeader, options, usageFooter);
	}

}
