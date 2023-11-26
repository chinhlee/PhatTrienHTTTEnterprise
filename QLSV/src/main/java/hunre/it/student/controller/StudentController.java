package hunre.it.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import hunre.it.student.entity.Student;
import hunre.it.student.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService service;

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/student_register")
	public String studentRegister() {
		return "studentRegister";
	}

	@GetMapping("/available_student")
	public ModelAndView getAllStudent() {
		List<Student> list = service.getAllStudent();
		return new ModelAndView("studentList", "student", list);
	}

	@PostMapping("/save")
	public String addStudent(@ModelAttribute Student b) {
		service.save(b);
		return "redirect:/available_student";
	}

	@RequestMapping("/editStudent/{id}")
	public String editStudent(@PathVariable("id") int id, Model model) {
		Student b = service.getStudentById(id);
		model.addAttribute("student", b);
		return "studentEdit";
	}

	@RequestMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		service.deleteById(id);
		return "redirect:/available_student";
	}
	@GetMapping("/student_search")
	public String searchStudent(@RequestParam("tensinhvien") String tensinhvien, @RequestParam("namnhaphoc") int namnhaphoc,
			Model model) {
		List<Student> studentList = service.findByTenSinhVienAndNamNhapHoc(tensinhvien, namnhaphoc);
		model.addAttribute("student", studentList);
		return "studentSearch"; // Trả về trang kết quả
	}

}
