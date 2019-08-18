package springboot.camp.noviceproject.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_department")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "department_id", length = 11, nullable = false)
	private Integer departmentId;

	@Column(name = "department_name", length = 250, nullable = false)
	private String departmentName;

	@OneToMany(mappedBy = "departmentId", cascade = CascadeType.ALL)
	private List<Employee> employees;

	public Department() {

	}

	public Department(Integer departmentId, String departmentName, List<Employee> employees) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.employees = employees;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}
