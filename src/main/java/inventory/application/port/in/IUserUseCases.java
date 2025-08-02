package inventory.application.port.in;

import inventory.domain.model.user.UserModel;

import java.util.List;

public interface IUserUseCases {
    UserModel createAdminUser(UserModel userModel);
    UserModel createSubUser(UserModel userModel);
    void disableAdminUser(Long userId);
    void disableSubUser(Long userId);
    UserModel updateUser(Long userId, UserModel userModel);
    List<UserModel> getSubUsers(Long  adminUserId);
}
