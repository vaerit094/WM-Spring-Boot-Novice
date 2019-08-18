package springboot.camp.noviceproject.example.service;

import java.util.List;

import springboot.camp.noviceproject.domain.Employee;

public interface ExampleService {

	public List<Employee> findAllEmployeeList();

	public Employee findEmployeeByEmployeeId(Integer employeeId);

}
