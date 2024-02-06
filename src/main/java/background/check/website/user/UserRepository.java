package background.check.website.user;

import background.check.website.confirmLink.ConfirmLink;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository <User, Integer>{

    Optional<User> findByEmail(String email);
    Optional<User> findByLink(ConfirmLink link);
}