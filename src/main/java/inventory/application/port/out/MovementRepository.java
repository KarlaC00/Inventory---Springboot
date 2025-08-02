package inventory.application.port.out;

import inventory.domain.model.enums.TypeAction;
import inventory.domain.model.movements.MovementModel;

import java.time.LocalDateTime;
import java.util.List;

public interface MovementRepository {
    MovementModel save(MovementModel movement);
    List<MovementModel> findAll();
    List<MovementModel> findByTypeAction(TypeAction typeAction);
    List<MovementModel> findByCreatedDateBetween(LocalDateTime startDay,LocalDateTime endDay);
}
