package inventory.infrastructure.persistence.entity.product;

import inventory.domain.model.enums.Status;
import inventory.infrastructure.persistence.entity.movemens.DetailMovementEntity;
import inventory.infrastructure.persistence.entity.user.InventoryGroupEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_description")
    private String productDescription;
    @Column(name = "product_price")
    private BigDecimal productPrice;
    @Column(name = "product_quantity")
    private int productQuantity;
    @Enumerated(EnumType.STRING)
    private Status productStatus;

    @ManyToOne
    @JoinColumn(name = "subcategory_id")
    private SubcategoryEntity subcategory;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private InventoryGroupEntity inventoryGroup;

    @OneToMany(mappedBy = "product")
    private List<DetailMovementEntity> detailMovements;


}
