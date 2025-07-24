package inventory.inventory.user.domain.model;

import inventory.inventory.user.domain.model.enums.RolePermission;
import jakarta.persistence.Enumerated;

import java.util.Set;

public class RoleModel {
    private Long id;
    private String RoleName;
    @Enumerated
    private Set<RolePermission> rolePermission;
}
