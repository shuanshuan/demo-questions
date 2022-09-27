package art.quanse.ppp.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("ss")
@RestController
public class SsRest {

	@Autowired
	UserRepository springUserRepository;

	@RequestMapping("d1")
	public User d1() {
		return springUserRepository.findById(1L).get();
	}
	
	@RequestMapping("d2")
	public User d2(String username) {
		return springUserRepository.findByUsername(username).get();
	}
}
