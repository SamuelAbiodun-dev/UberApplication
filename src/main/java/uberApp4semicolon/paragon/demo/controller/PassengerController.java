package uberApp4semicolon.paragon.demo.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uberApp4semicolon.paragon.demo.data.dto.Requests.RegisterPassengerRequest;
import uberApp4semicolon.paragon.demo.data.dto.Responses.RegisterPassengerResponse;
import uberApp4semicolon.paragon.demo.service.PassengerServices;

@RestController
@RequestMapping ("/api/v1/passenger")
@AllArgsConstructor
public class PassengerController {
    private final PassengerServices passengerServices;


    @PostMapping
    public ResponseEntity<?> register(RegisterPassengerRequest registerPassengerRequest){
        RegisterPassengerResponse registerPassengerResponse = passengerServices.register(registerPassengerRequest);
        return ResponseEntity.status(registerPassengerResponse.getCode()).body(registerPassengerResponse);
    }

}
