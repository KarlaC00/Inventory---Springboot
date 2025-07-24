package inventory.inventory.domain.model.user;

import inventory.inventory.domain.model.enums.RolePermission;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleModel {
    private Long id;
    private String roleName;
    private Set<RolePermission> rolePermission;
}
