package plugins.converters.xml;

import javax.xml.bind.annotation.XmlElement;

public class Employee {

	private String department;

	private String name;

	@XmlElement
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
