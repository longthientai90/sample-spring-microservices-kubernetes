package loveit1990.top.services.employee.repository;

import loveit1990.top.services.employee.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, String> {

    List<Employee> findByDepartmentId(String departmentId);

    List<Employee> findByOrganizationId(String organizationId);

}
