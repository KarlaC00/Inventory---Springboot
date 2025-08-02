package inventory.infrastructure.persistence.entity.user;

import inventory.domain.model.enums.RolePermission;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "role_name")
    private String roleName;

    @ElementCollection(targetClass = RolePermission.class)
    @CollectionTable(name = "role_permission", joinColumns = @JoinColumn(name = "role_id" ) )
    @Enumerated(EnumType.STRING)
    private Set<RolePermission> rolePermissions;

    @OneToMany(mappedBy = "roleEntity")
    private List<UserEntity> userEntity;
}
