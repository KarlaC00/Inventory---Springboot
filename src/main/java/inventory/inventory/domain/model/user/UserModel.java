package inventory.inventory.domain.model.user;

import inventory.inventory.domain.model.enums.Status;
import inventory.inventory.domain.model.enums.TypeIdentification;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserModel {
    private Long id;
    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private String identificationNumber;
    private String password;
    private Status status;
    private TypeIdentification typeidentification;
    private LocalDateTime lastLogin;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    private boolean isAnAdmin;

    private InventoryGroup inventoryGroup;
    private RoleModel roleModel;
}
