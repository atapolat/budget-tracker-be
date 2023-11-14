package com.pinsoft.budgettrackerbe.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllExpensesResponse {
    private int id;
    private String expenseName;
    private int amount;
    private Date date;
}
