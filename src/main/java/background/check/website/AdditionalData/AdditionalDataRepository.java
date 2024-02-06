package background.check.website.AdditionalData;

import background.check.website.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdditionalDataRepository extends JpaRepository<AdditionalData, Integer> {
    Optional<AdditionalData> findByUser(User user);
}
