package inventory.domain.model.user;

import inventory.domain.model.enums.Status;
import inventory.domain.model.enums.TypeIdentification;
import inventory.domain.model.movements.MovementModel;
import inventory.infrastructure.persistence.entity.movemens.MovementEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

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
    private TypeIdentification typeIdentification;

    private LocalDateTime lastLogin;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    private boolean isAnAdmin;
    private Status userStatus;

    private InventoryGroupModel inventoryGroupModel;
    private RoleModel roleModel;
    private List<MovementModel> createdMovement;
}
