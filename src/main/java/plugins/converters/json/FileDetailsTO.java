package plugins.converters.json;

/**
 * The Class FileDetailsTO.
 * 
 * @author Eedanna K
 */
public class FileDetailsTO {

	/** The file name. */
	private String fileName;

	/** The file size. */
	private String fileSize;

	/** The file type. */
	private String fileType;

	/**
	 * Gets the file name.
	 *
	 * @return the file name
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * Sets the file name.
	 *
	 * @param fileName
	 *            the new file name
	 */
	public void setFileName(final String fileName) {
		this.fileName = fileName;
	}

	/**
	 * Gets the file size.
	 *
	 * @return the file size
	 */
	public String getFileSize() {
		return fileSize;
	}

	/**
	 * Sets the file size.
	 *
	 * @param fileSize
	 *            the new file size
	 */
	public void setFileSize(final String fileSize) {
		this.fileSize = fileSize;
	}

	/**
	 * Gets the file type.
	 *
	 * @return the file type
	 */
	public String getFileType() {
		return fileType;
	}

	/**
	 * Sets the file type.
	 *
	 * @param fileType
	 *            the new file type
	 */
	public void setFileType(final String fileType) {
		this.fileType = fileType;
	}

}
