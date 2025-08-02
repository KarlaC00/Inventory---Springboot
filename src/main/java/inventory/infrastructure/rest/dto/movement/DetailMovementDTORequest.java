package inventory.infrastructure.rest.dto.movement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailMovementDTORequest {
    private Long productId;
    private int quantity;
    private BigDecimal unitPrice;
}
