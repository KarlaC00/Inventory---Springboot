package inventory.infrastructure.persistence.entity.movemens;

import inventory.infrastructure.persistence.entity.product.ProductEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailMovementEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long detailId;

    private int quantity;

    @Column(name = "unit_price")
    private BigDecimal unitPrice;

    @ManyToOne
    @JoinColumn(name = "movement_id")
    private MovementEntity movement;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity product;

}

