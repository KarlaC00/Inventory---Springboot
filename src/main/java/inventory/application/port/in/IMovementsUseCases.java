package inventory.application.port.in;

import inventory.domain.model.movements.MovementModel;

import java.time.LocalDateTime;
import java.util.List;

public interface IMovementsUseCases {
    MovementModel createSale(MovementModel sale);
    MovementModel createBuy(MovementModel buy);
    List<MovementModel> findByCreatedDateBetween(LocalDateTime startDay, LocalDateTime endDay);
}
