package project.todo_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.todo_management.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
