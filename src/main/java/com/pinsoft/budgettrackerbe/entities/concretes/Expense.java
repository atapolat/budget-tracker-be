package com.pinsoft.budgettrackerbe.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name = "expenses")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "expenseName")
    private String ExpenseName;

    @Column(name = "amount")
    private int amount;

    @Column(name = "date")
    private Date date;
}
