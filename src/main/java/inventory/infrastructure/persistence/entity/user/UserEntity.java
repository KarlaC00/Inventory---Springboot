package inventory.infrastructure.persistence.entity.user;

import inventory.domain.model.enums.Status;
import inventory.domain.model.enums.TypeIdentification;
import inventory.infrastructure.persistence.entity.movemens.MovementEntity;
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
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, name = "username")
    private String username;
    @Column(name = "first_name")
    private String firstname;
    @Column(name = "last_name")
    private String lastname;
    @Column(name = "email")
    private String email;
    @Column(name = "identification_number", unique = true)
    private String identificationNumber;
    @Column(name = "password")
    private String password;
    @Enumerated(EnumType.STRING)
    private Status userStatus;
    @Enumerated(EnumType.STRING)
    private TypeIdentification typeIdentification;
    @Column(name = "last_login")
    private LocalDateTime lastLogin;
    @Column(name = "create_at")
    private LocalDateTime createAt;
    @Column(name = "update_at")
    private LocalDateTime updateAt;
    @Column(name = "is_an_admin")
    private boolean isAnAdmin;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private InventoryGroupEntity inventoryGroup;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private RoleEntity roleEntity;

    @OneToMany(mappedBy = "createdBy")
    private List<MovementEntity> createdMovements;
}
