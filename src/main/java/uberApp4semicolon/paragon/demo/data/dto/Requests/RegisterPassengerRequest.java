package uberApp4semicolon.paragon.demo.data.dto.Requests;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RegisterPassengerRequest {
    private String email;
    private String name;
    private String password;

}
