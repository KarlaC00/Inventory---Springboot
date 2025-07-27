package inventory.inventory.domain.port.in;

import inventory.inventory.domain.model.user.UserModel;
import inventory.inventory.domain.model.enums.RolePermission;

import java.util.List;

public interface IUserService {
    UserModel createAdminUser(UserModel userModel);
    UserModel createSubUser(UserModel userModel);
    void disableAdminUser(UserModel user);
    void disableSubUser(UserModel user);
    UserModel updateUser(UserModel user);
    List<UserModel> getSubUsers(UserModel adminUsername);
}
