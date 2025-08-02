package inventory.infrastructure.rest.dto.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubcategoryCreateDTORequest {
    private String subCategoryName;
    private Long categoryId;
}
