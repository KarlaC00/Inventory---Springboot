package inventory.infrastructure.rest.dto.thirdparty;

import inventory.domain.model.enums.TypeIdentification;
import inventory.domain.model.enums.TypeThirdParty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ThirdPartyDTORequest {
    private String thirdPartyName;
    private String email;
    private TypeIdentification typeIdentification;
    private String identificationNumber;
    private TypeThirdParty typeThirdParty;
}
