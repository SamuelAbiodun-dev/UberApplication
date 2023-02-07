package uberApp4semicolon.paragon.demo.data.models;

import lombok.NoArgsConstructor;
import uberApp4semicolon.paragon.demo.data.dto.Requests.RegisterPassengerRequest;

@NoArgsConstructor
public class ParaMapper {
    public static AppUser map(RegisterPassengerRequest registerPassengerRequest){
        AppUser appUser = new AppUser();
        appUser.setName(registerPassengerRequest.getName());
        appUser.setPassword(registerPassengerRequest.getPassword());
        appUser.setEmail(registerPassengerRequest.getEmail());
        return appUser;
    }
}
