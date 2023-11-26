package hunre.it.student.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hunre.it.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	List<Student> findByTensinhvienAndNamnhaphocLessThanEqual(String tensinhvien, int namnhaphoc);

}
