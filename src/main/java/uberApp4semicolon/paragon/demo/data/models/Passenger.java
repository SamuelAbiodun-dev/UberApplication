package uberApp4semicolon.paragon.demo.data.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String phoneNumber;
    @Enumerated(value = EnumType.STRING)
    private Gender gender;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private AppUser userDetails;

}
