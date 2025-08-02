package inventory.infrastructure.rest.dto.user;

import inventory.domain.model.enums.Status;
import inventory.domain.model.enums.TypeIdentification;

public class UserCreateDTORequest {

    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Status userStatus;
    private TypeIdentification typeIdentification;
}
