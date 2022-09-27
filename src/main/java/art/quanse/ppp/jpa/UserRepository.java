package art.quanse.ppp.jpa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @version 1.0
 * @date 2021-10-11
 * @author shuan
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByUsername(String username);
	
}
