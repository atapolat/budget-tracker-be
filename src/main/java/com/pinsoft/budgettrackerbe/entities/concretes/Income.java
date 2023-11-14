package com.pinsoft.budgettrackerbe.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name = "incomes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Income {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "incomeName")
    private String incomeName;

    @Column(name = "amount")
    private int amount;

    @Column(name = "date")
    private Date date;
}
