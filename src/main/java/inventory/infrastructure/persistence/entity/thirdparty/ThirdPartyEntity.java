package inventory.infrastructure.persistence.entity.thirdparty;

import inventory.domain.model.enums.Status;
import inventory.domain.model.enums.TypeIdentification;
import inventory.domain.model.enums.TypeThirdParty;
import inventory.infrastructure.persistence.entity.movemens.MovementEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ThirdPartyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long thirdPartyId;
    @Column(name = "third_party_name")
    private String thirdPartyName;
    @Column(name = "email")
    private String email;
    @Column(name = "identification_number")
    private String identificationNumber;
    @Enumerated(EnumType.STRING)
    private TypeThirdParty typeThirdParty;
    @Enumerated(EnumType.STRING)
    private TypeIdentification typeIdentification;
    @Enumerated(EnumType.STRING)
    private Status thirdPartyStatus;

    @OneToMany(mappedBy = "thirdParty")
    private List<MovementEntity> movements;
}
