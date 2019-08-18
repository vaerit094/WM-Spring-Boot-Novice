package springboot.camp.noviceproject.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springboot.camp.noviceproject.domain.Employee;
import springboot.camp.noviceproject.example.service.ExampleService;

@RestController
public class ExampleController {

	@Autowired
	ExampleService exampleService;

	@GetMapping("/get-example-list")
	@ResponseBody
	public List<Employee> getAllEmployee() {
		return exampleService.findAllEmployeeList();
	}

	@GetMapping("/get-example")
	public ResponseEntity<Employee> getEmployeeById(@RequestParam Integer id) {
		Employee employee = exampleService.findEmployeeByEmployeeId(id);
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}

}
