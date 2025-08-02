package inventory.domain.model.user;

import inventory.domain.model.enums.RolePermission;
import inventory.infrastructure.persistence.entity.user.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleModel {
    private Long id;
    private String roleName;
    private Set<RolePermission> rolePermission;
    private List<UserEntity> userEntity;
}
