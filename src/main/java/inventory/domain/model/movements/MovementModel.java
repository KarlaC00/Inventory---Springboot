package inventory.domain.model.movements;

import inventory.domain.model.enums.TypeAction;
import inventory.domain.model.thirdparty.ThirdPartyModel;
import inventory.domain.model.user.InventoryGroupModel;
import inventory.domain.model.user.UserModel;
import inventory.infrastructure.persistence.entity.movemens.DetailMovementEntity;

import java.time.LocalDateTime;
import java.util.List;

public class MovementModel {
    private Long movementId;
    private LocalDateTime createdAt;
    private TypeAction typeAction;

    private InventoryGroupModel inventoryGroupModel;
    private UserModel createdBy;
    private ThirdPartyModel thirdPartyModel;
    private List<DetailMovementModel> details;
}
