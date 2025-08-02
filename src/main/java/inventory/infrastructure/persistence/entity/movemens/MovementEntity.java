package inventory.infrastructure.persistence.entity.movemens;

import inventory.domain.model.enums.TypeAction;
import inventory.infrastructure.persistence.entity.thirdparty.ThirdPartyEntity;
import inventory.infrastructure.persistence.entity.user.InventoryGroupEntity;
import inventory.infrastructure.persistence.entity.user.UserEntity;
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
public class MovementEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movementId;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Enumerated(EnumType.STRING)
    @Column(name = "type_action")
    private TypeAction typeAction;

    @ManyToOne
    @JoinColumn(name = "inventory_group_id")
    private InventoryGroupEntity inventoryGroup;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity createdBy;

    @ManyToOne
    @JoinColumn(name = "third_party_id")
    private ThirdPartyEntity thirdParty;

    @OneToMany(mappedBy = "movement")
    private List<DetailMovementEntity> movements;
}
