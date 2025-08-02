package inventory.infrastructure.rest.dto.user;

import inventory.domain.model.enums.RolePermission;

import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleCreateDTORequest {
    private String roleName;
    private Set<RolePermission> rolePermissions;
}
