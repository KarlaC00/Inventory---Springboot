package inventory.inventory.user.domain.port.in;

import inventory.inventory.user.domain.model.UserModel;
import inventory.inventory.user.domain.model.enums.RolePermission;

public interface IUserService {
    UserModel getUser();
    RolePermission createClient();
}
