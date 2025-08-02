package inventory.infrastructure.rest.dto.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductCreateDTORequest {
    private String productName;
    private String productDescription;
    private BigDecimal productPrice;
    private int productQuantity;
    private String subcategoryName;
    private Long subCategoryId;
}
