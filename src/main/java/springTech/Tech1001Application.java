package springTech;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Tech1001Application {
@Autowired
	private StudentRepo repository;

@GetMapping("/")
public String home() {
	return "hiiiii";
}
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {
		return repository.save(student);
	}
	@GetMapping("/students")
	public List<Student> getStudent()
	{
		return repository.findAll();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Tech1001Application.class, args);
	}

}
