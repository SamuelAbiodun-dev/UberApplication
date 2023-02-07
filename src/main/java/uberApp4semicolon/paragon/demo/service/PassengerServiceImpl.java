package uberApp4semicolon.paragon.demo.service;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import uberApp4semicolon.paragon.demo.data.dto.Requests.RegisterPassengerRequest;
import uberApp4semicolon.paragon.demo.data.dto.Responses.RegisterPassengerResponse;
import uberApp4semicolon.paragon.demo.data.models.AppUser;
import uberApp4semicolon.paragon.demo.data.models.ParaMapper;
import uberApp4semicolon.paragon.demo.data.models.Passenger;
import uberApp4semicolon.paragon.demo.data.respositories.PassengerRepositories;

import java.time.LocalDateTime;

@Service
//@AllArgsConstructor
//@Slf4j
public class PassengerServiceImpl implements PassengerServices{
    @Autowired
   private final PassengerRepositories passengerRepositories;

    public PassengerServiceImpl(PassengerRepositories passengerRepositories) {
        this.passengerRepositories = passengerRepositories;
    }
    @Override
    public RegisterPassengerResponse register(RegisterPassengerRequest registerRequest) {
        AppUser appUser = ParaMapper.map(registerRequest);
        appUser.setCreatedAt(LocalDateTime.now());
       Passenger passenger = new Passenger();
       passenger.setUserDetails(appUser);
       Passenger savedPassenger= passengerRepositories.save(passenger);
        return getRegisterPassengerResponse(savedPassenger);
    }
    private static RegisterPassengerResponse getRegisterPassengerResponse(Passenger savedPassenger) {
        RegisterPassengerResponse registerPassengerResponse = new RegisterPassengerResponse();
        registerPassengerResponse.setId(savedPassenger.getId());
        registerPassengerResponse.setCode(HttpStatus.CREATED.value());
        registerPassengerResponse.setSuccess(true);
        registerPassengerResponse.setMessage("User Registration successful!");
        return registerPassengerResponse;
    }
}
