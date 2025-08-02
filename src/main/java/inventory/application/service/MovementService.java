package inventory.application.service;

import inventory.application.port.in.IMovementsUseCases;
import inventory.domain.model.movements.MovementModel;

import java.time.LocalDateTime;
import java.util.List;

public class MovementService implements IMovementsUseCases {
    @Override
    public MovementModel createSale(MovementModel sale) {
        return null;
    }

    @Override
    public MovementModel createBuy(MovementModel buy) {
        return null;
    }

    @Override
    public List<MovementModel> findByCreatedDateBetween(LocalDateTime startDay, LocalDateTime endDay) {
        return List.of();
    }
}
