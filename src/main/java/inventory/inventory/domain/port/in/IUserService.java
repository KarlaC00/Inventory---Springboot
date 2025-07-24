package inventory.inventory.domain.port.in;

import inventory.inventory.domain.model.user.UserModel;
import inventory.inventory.domain.model.enums.RolePermission;

public interface IUserService {
    UserModel getUser();
    RolePermission createClient();
}
