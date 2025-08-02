package inventory.domain.model.user;

import inventory.domain.model.movements.MovementModel;
import inventory.domain.model.product.ProductModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryGroupModel {
    private Long id;
    private String groupName;
    private LocalDateTime createdDate;
    private List<UserModel> users;
    private List<ProductModel> products;
    private List<MovementModel> movements;
}
