package inventory.infrastructure.rest.dto.user;

import inventory.domain.model.enums.TypeIdentification;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateDTORequest {

    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private TypeIdentification typeIdentification;
    private String identificationNumber;
}
