package springboot.camp.noviceproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springboot.camp.noviceproject.domain.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
