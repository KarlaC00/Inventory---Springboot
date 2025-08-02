package inventory.application.port.out;

import inventory.domain.model.user.RoleModel;
import inventory.domain.model.user.UserModel;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    UserModel save(UserModel user);
    Optional<UserModel> findByUsername(String username);
    List<UserModel> findByRole (RoleModel role);
    List<UserModel> findAllSubUsersByAdminUsername(String adminUsername);
}
