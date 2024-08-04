package project.todo_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.todo_management.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
