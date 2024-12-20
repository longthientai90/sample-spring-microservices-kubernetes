package loveit1990.top.services.department.repository;

import loveit1990.top.services.department.model.Department;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DepartmentRepository extends CrudRepository<Department, String> {

    List<Department> findByOrganizationId(String organizationId);

}
