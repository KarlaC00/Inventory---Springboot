package inventory.infrastructure.rest.dto.movement;

import inventory.domain.model.enums.TypeAction;
import inventory.domain.model.movements.DetailMovementModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovementCreateDTORequest {
    private TypeAction typeAction;
    private Long thirdPartyId;
    private List<DetailMovementModel> details;
}
