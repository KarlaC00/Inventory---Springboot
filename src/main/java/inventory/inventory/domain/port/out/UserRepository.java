package inventory.inventory.domain.port.out;

import inventory.inventory.domain.model.user.UserModel;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    UserModel save(UserModel user);
    Optional<UserModel> findByUsername(String username);
    List<UserModel> findAllSubUsersByAdminUsername(String adminUsername);
}
