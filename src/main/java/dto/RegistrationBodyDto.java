
package dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class RegistrationBodyDto {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
}