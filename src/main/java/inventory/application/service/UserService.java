package inventory.application.service;

import inventory.application.port.in.IUserUseCases;
import inventory.domain.model.user.UserModel;

import java.util.List;

public class UserService implements IUserUseCases {
    @Override
    public UserModel createAdminUser(UserModel userModel) {
        return null;
    }

    @Override
    public UserModel createSubUser(UserModel userModel) {
        return null;
    }

    @Override
    public void disableAdminUser(Long userId) {

    }

    @Override
    public void disableSubUser(Long userId) {

    }

    @Override
    public UserModel updateUser(Long userId, UserModel userModel) {
        return null;
    }

    @Override
    public List<UserModel> getSubUsers(Long adminUserId) {
        return List.of();
    }
}
