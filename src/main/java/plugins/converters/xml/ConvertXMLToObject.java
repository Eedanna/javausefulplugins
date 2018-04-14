package plugins.converters.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ConvertXMLToObject {

	public static void main(String[] args) {

		JAXBContext context;
		try {
			context = JAXBContext.newInstance(Employees.class);
			final Unmarshaller unmarshaller = context.createUnmarshaller();
			final Employees employees = (Employees) unmarshaller.unmarshal(
					new File(ConvertXMLToObject.class.getClassLoader().getResource("xml/employees.xml").getFile()));

			for (final Employee e : employees.getEmployee()) {
				System.out.println("\n-------  Employee Details -------------------");
				System.out.println("Name : " + e.getName());
				System.out.println("Department : " + e.getDepartment());
			}
		} catch (JAXBException e1) {
			e1.printStackTrace();
		}

	}

}
