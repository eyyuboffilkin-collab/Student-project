package az.company.springbootproject;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name= "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String studentNumber;
}

