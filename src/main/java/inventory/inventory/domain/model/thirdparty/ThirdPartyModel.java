package inventory.inventory.domain.model.thirdparty;

import inventory.inventory.domain.model.enums.Status;
import inventory.inventory.domain.model.enums.TypeIdentification;

public class ThirdPartyModel {
    private Long thirdPartyId;
    private String thirdPartyName;
    private String email;
    private String identificationNumber;

    private TypeIdentification typeIdentification;
    private Status thirdPartyStatus;

}
