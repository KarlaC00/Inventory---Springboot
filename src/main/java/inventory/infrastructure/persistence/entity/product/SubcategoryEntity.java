package inventory.infrastructure.persistence.entity.product;

import inventory.domain.model.enums.Status;
import inventory.domain.model.product.SubcategoryModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubcategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subcategoryId;
    @Column(name = "subcategory_name")
    private String subcategoryName;
    @Enumerated(EnumType.STRING)
    private Status subcategoryStatus;

    @OneToMany(mappedBy = "subcategory")
    private List<ProductEntity> products;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;

}
