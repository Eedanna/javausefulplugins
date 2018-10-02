package plugins.converters.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Employees")
public class Employees {
  private List<Employee> employee;

  @XmlElement(name="Employee")
  public List<Employee> getEmployee() {
      return employee;
  }

  public void setEmployee(List<Employee> employeeList) {
      this.employee = employeeList;
  }
}