package uberApp4semicolon.paragon.demo.data.dto.Responses;

import jdk.jfr.StackTrace;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RegisterPassengerResponse {
    private Long Id;
    private String message;
    private int code;
    private boolean isSuccess;
}
