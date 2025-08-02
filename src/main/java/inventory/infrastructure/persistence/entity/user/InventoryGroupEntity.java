package inventory.infrastructure.persistence.entity.user;

import inventory.infrastructure.persistence.entity.movemens.MovementEntity;
import inventory.infrastructure.persistence.entity.product.ProductEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryGroupEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "group_name")
    private String groupName;
    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @OneToMany(mappedBy = "inventoryGroup")
    private List<UserEntity> users;
    @OneToMany(mappedBy = "inventoryGroup")
    private List<ProductEntity> products;
    @OneToMany(mappedBy = "inventoryGroup")
    private List<MovementEntity> movements;
}
