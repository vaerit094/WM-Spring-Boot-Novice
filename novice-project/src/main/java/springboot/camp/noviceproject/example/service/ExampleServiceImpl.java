package springboot.camp.noviceproject.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.camp.noviceproject.domain.Employee;
import springboot.camp.noviceproject.repository.EmployeeRepository;

@Service
public class ExampleServiceImpl implements ExampleService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> findAllEmployeeList() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee findEmployeeByEmployeeId(Integer employeeId) {
		return employeeRepository.findByEmployeeId(employeeId);
	}

}
