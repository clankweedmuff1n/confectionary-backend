package background.check.website.confirmLink;

import background.check.website.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ConfirmLinkRepository extends JpaRepository<ConfirmLink, Integer> {
    Optional<ConfirmLink> findByUser(User user);
    Optional<ConfirmLink> findByLink(String link);
}