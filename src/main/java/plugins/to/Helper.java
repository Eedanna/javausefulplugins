package plugins.to;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

/**
 * The Class Helper.
 */
public class Helper {

	/** The Constant MATCHES_FILE_NAME. */
	private static final String MATCHES_FILE_NAME = "/resources/matches.csv";

	/** The Constant DELIVERIES_FILE_NAME. */
	private static final String DELIVERIES_FILE_NAME = "/resources/deliveries.csv";

	/**
	 * Gets the matches data.
	 *
	 * @return the matches data
	 * @throws Exception
	 */
	public static List<Matches> getMatchesData() throws Exception {
		CSVReader reader = null;

		final List<Matches> matchesList = new ArrayList<Matches>();

		try {
			reader = new CSVReader(new FileReader(MATCHES_FILE_NAME));
			String[] line;
			while ((line = reader.readNext()) != null) {

				while ((line = reader.readNext()) != null) {

					final Matches matches = new Matches();

					matches.setMatchId(line[0]);
					matches.setSeason(line[1]);
					matches.setCity(line[2]);
					matches.setDate(new SimpleDateFormat("YYYY-MM-DD").parse(line[3]));
					matches.setTeam1(line[4]);
					matches.setTeam2(line[5]);
					matches.setToss_winner(line[6]);
					matches.setToss_decision(line[7]);
					matches.setResult(line[8]);
					matches.setWinner(line[9]);
					matchesList.add(matches);
				}
			}
		} catch (final IOException | ParseException e) {
			throw new Exception();
		} finally {
			reader.close();
		}
		return matchesList;
	}

	/**
	 * Gets the deliveries data.
	 *
	 * @return the deliveries data
	 * @throws Exception
	 */
	public static List<Deliveries> getDeliveriesData() throws Exception {

		CSVReader reader = null;

		final List<Deliveries> deliveriesList = new ArrayList<Deliveries>();

		try {
			reader = new CSVReader(new FileReader(DELIVERIES_FILE_NAME));
			String[] line;
			while ((line = reader.readNext()) != null) {

				while ((line = reader.readNext()) != null) {

					final Deliveries deliveries = new Deliveries();
					deliveries.setMatchId(line[0]);
					deliveries.setInning(line[1]);
					deliveries.setBattingTeam(line[2]);
					deliveries.setBowlingTeam(line[3]);
					deliveries.setOver(line[4]);
					deliveries.setBall(line[5]);
					deliveries.setBatsMan(line[6]);
					deliveries.setBowler(line[7]);
					deliveries.setWideRuns(line[8]);
					deliveries.setByeRuns(line[9]);
					deliveries.setLegBuy(line[10]);
					deliveries.setNoballRuns(line[11]);
					deliveries.setPenalityRuns(line[12]);
					deliveries.setBatsManRuns(line[13]);
					deliveries.setExtraRuns(line[14]);
					deliveries.setTotalRuns(line[15]);

					deliveriesList.add(deliveries);
				}
			}
		} catch (final Exception e) {
			throw new Exception();
		} finally {
			reader.close();
		}
		return deliveriesList;
	}

}
