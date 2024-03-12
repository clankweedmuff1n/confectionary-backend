package background.check.website.auth.user.confirmLink;

import background.check.website.auth.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ConfirmLinkRepository extends JpaRepository<ConfirmLink, Integer> {
    Optional<ConfirmLink> findByUser(User user);
    Optional<ConfirmLink> findByLink(String link);
}