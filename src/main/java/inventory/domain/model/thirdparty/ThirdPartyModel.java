package inventory.domain.model.thirdparty;

import inventory.domain.model.enums.Status;
import inventory.domain.model.enums.TypeIdentification;
import inventory.domain.model.enums.TypeThirdParty;

public class ThirdPartyModel {
    private Long thirdPartyId;
    private String thirdPartyName;
    private String email;
    private String identificationNumber;
    private TypeThirdParty typeThirdParty;

    private TypeIdentification typeIdentification;
    private Status thirdPartyStatus;
}
