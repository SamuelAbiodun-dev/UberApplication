package uberApp4semicolon.paragon.demo.service;

import lombok.AllArgsConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import uberApp4semicolon.paragon.demo.data.dto.Requests.RegisterPassengerRequest;
import uberApp4semicolon.paragon.demo.data.dto.Responses.RegisterPassengerResponse;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PassengerServiceImplTest {
    @Autowired
    private PassengerServices passengerServices;
    @BeforeEach
    void setUp() {
    }
    @Test
    void registerTest(){
        RegisterPassengerRequest registerPassengerRequest = new RegisterPassengerRequest();
        registerPassengerRequest.setEmail("samuelabiodun324@gmail.com");
        registerPassengerRequest.setPassword("samuel");
        registerPassengerRequest.setName("Sam Abiodun");
        RegisterPassengerResponse registerPassengerResponse = passengerServices.register(registerPassengerRequest);
        assertThat(registerPassengerResponse).isNotNull();
        assertThat(registerPassengerResponse.getCode()).isEqualTo(HttpStatus.CREATED.value());
    }
}