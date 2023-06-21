package com.ozbekemlak.Emlak.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="house")
@Data
public class House {
    @Id
    private int id;
    private String title;
    private String description;
    private int price;
    private String location;


}
