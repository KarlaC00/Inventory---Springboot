package inventory.application.port.out;

import inventory.domain.model.thirdparty.ThirdPartyModel;

import java.util.List;
import java.util.Optional;

public interface ThirdPartyRepository {
    ThirdPartyModel save(ThirdPartyModel thirdPartyModel);
    List<ThirdPartyModel> findAllThirdParty();
    Optional<ThirdPartyModel> findByIdentificationNumber(String identificationNumber);

}
