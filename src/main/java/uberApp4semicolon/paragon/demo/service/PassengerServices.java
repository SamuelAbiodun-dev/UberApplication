package uberApp4semicolon.paragon.demo.service;

import uberApp4semicolon.paragon.demo.data.dto.Requests.RegisterPassengerRequest;
import uberApp4semicolon.paragon.demo.data.dto.Responses.RegisterPassengerResponse;

public interface PassengerServices {
    RegisterPassengerResponse register(RegisterPassengerRequest registerRequest);

}
