package inventory.inventory.domain.model.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryGroup {
    private Long id;
    private String groupName;
    private String groupDescription;
    private LocalDateTime createdDate;
}
