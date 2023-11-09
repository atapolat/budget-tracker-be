package com.pinsoft.budgettrackerbe.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllIncomeResponse {
    private int id;
    private String incomeName;
    private long amount;
    private Date date;
}
