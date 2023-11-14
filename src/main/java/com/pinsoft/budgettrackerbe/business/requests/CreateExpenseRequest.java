package com.pinsoft.budgettrackerbe.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateExpenseRequest {
    private String expenseName;
    private int amount;
    private Date date;
}
