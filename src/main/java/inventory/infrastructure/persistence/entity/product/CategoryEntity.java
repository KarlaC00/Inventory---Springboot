package inventory.infrastructure.persistence.entity.product;

import inventory.domain.model.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;
    @Column(name = "category_name")
    private String categoryName;
    @Enumerated(EnumType.STRING)
    private Status categoryStatus;

    @OneToMany(mappedBy = "category")
    private List<SubcategoryEntity> subcategories;

}
