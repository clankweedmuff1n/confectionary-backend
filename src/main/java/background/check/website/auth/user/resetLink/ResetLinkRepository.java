package background.check.website.auth.user.resetLink;

import background.check.website.auth.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ResetLinkRepository extends JpaRepository<ResetLink, Integer> {
    Optional<ResetLink> findByUser(User user);
    Optional<ResetLink> findByLink(String link);
}