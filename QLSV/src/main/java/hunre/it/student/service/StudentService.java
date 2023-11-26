package hunre.it.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hunre.it.student.entity.Student;
import hunre.it.student.repositories.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository bRepo;

	public void save(Student b) {
		bRepo.save(b);
	}

	public List<Student> getAllStudent() {
		return bRepo.findAll();
	}

	public Student getStudentById(long id) {
		return bRepo.findById(id).get();
	}

	public void deleteById(long id) {
		bRepo.deleteById(id);
	}

	public List<Student> findByTenSinhVienAndNamNhapHoc(String tensinhvien, int namnhaphoc) {
		// TODO Auto-generated method stub
		return bRepo.findByTensinhvienAndNamnhaphocLessThanEqual(tensinhvien, namnhaphoc);
	}

}
