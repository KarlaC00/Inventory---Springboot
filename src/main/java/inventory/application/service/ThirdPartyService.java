package inventory.application.service;

import inventory.application.port.in.IThirdPartyUseCases;
import inventory.domain.model.thirdparty.ThirdPartyModel;

import java.util.List;

public class ThirdPartyService implements IThirdPartyUseCases {
    @Override
    public ThirdPartyModel createThirdPartyModel(ThirdPartyModel thirdPartyModel) {
        return null;
    }

    @Override
    public ThirdPartyModel updateThirdPartyModel(Long thirdPartyId, ThirdPartyModel thirdPartyModel) {
        return null;
    }

    @Override
    public void disableThirdPartyModel(Long thirdPartyId) {

    }

    @Override
    public List<ThirdPartyModel> findAllThirdPartyModels() {
        return List.of();
    }
}
