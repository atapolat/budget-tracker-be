package com.pinsoft.budgettrackerbe.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateIncomeRequest {
    private String incomeName;
    private int amount;
    private Date date;
}
