package plugins.converters.json;

import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * The Class ConvertJSONToObject.
 * 
 * @author Eedanna K
 */
public class ConvertJSONToObject {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		final String jsonInput = "{\"fileName\":\"Test File\",\"fileSize\":\"10KB\",\"fileType\":\"jpeg\"}";
		FileDetailsTO fileDetailsTO;
		try {
			fileDetailsTO = (FileDetailsTO) getObjectFromJsonString(jsonInput, FileDetailsTO.class);
			System.out.println(
					"File Name : " + fileDetailsTO.getFileName() + ";\nFile Size :" + fileDetailsTO.getFileSize()
							+ ";\nFile Type :" + fileDetailsTO.getFileType());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Gets the object from json string.
	 *
	 * @param <T> the generic type
	 * @param jsonString the json string
	 * @param classType the class type
	 * @return the object from json string
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static <T> T getObjectFromJsonString(final String jsonString, final Class<T> classType) throws IOException {
		final ObjectMapper mapper = new ObjectMapper();
		mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
		return mapper.readValue(jsonString, classType);
	}

}
