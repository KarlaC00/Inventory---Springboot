package inventory.application.port.in;

import inventory.domain.model.thirdparty.ThirdPartyModel;

import java.util.List;

public interface IThirdPartyUseCases {
    ThirdPartyModel createThirdPartyModel(ThirdPartyModel thirdPartyModel);
    ThirdPartyModel updateThirdPartyModel(Long thirdPartyId,ThirdPartyModel thirdPartyModel);
    void disableThirdPartyModel(Long thirdPartyId);
    List<ThirdPartyModel> findAllThirdPartyModels();
}
