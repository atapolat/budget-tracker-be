package com.pinsoft.budgettrackerbe.business.abstracts;

import com.pinsoft.budgettrackerbe.business.requests.CreateIncomeRequest;
import com.pinsoft.budgettrackerbe.business.requests.UpdateIncomeRequest;
import com.pinsoft.budgettrackerbe.business.responses.GetAllExpensesResponse;
import com.pinsoft.budgettrackerbe.business.responses.GetAllIncomeResponse;

import java.util.List;

public interface IncomeService {
    List<GetAllIncomeResponse> getAll();
    void add (CreateIncomeRequest createIncomeRequest);
    void update (UpdateIncomeRequest updateIncomeRequest);
    void delete (int id);
}
