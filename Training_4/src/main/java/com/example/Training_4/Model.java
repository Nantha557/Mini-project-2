package com.example.Training_4;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Model {
    @Id
    @GeneratedValue
    Long id;
    String Name;
    Integer Age;
    Number TotalMarks;

}
