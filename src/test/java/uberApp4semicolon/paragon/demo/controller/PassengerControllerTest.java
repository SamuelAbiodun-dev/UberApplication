package uberApp4semicolon.paragon.demo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import uberApp4semicolon.paragon.demo.data.dto.Requests.RegisterPassengerRequest;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@ExtendWith(MockitoExtension.class)
class PassengerControllerTest {
    @Autowired
    private MockMvc mockMvc;
    private ObjectMapper objectMapper=new ObjectMapper();
    @BeforeEach
    void setUp() {
    }
    @Test
    public void testRegisterPassenger() {
        RegisterPassengerRequest request= RegisterPassengerRequest.builder()
                .name("Sam")
                .email("Samuel@gmail.com")
                .password("samuel")
                .build();
        try {
            mockMvc.perform(
                    post("/api/v1/passenger")
                    .content(objectMapper.writeValueAsString(request))
                    .contentType(MediaType.APPLICATION_JSON_VALUE))
                    .andExpect(status().is(HttpStatus.CREATED.value()))
                    .andDo(print());
        } catch (Exception expection) {
            throw new RuntimeException(expection);
        }
    }
}