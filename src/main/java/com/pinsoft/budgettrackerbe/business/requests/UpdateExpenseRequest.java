package com.pinsoft.budgettrackerbe.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateExpenseRequest {
    private String expenseName;
    private long amount;
    private Date date;
}
