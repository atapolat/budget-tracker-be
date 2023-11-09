package com.pinsoft.budgettrackerbe.business.abstracts;

import com.pinsoft.budgettrackerbe.business.requests.CreateExpenseRequest;
import com.pinsoft.budgettrackerbe.business.requests.UpdateExpenseRequest;
import com.pinsoft.budgettrackerbe.business.responses.GetAllExpensesResponse;

import java.util.List;

public interface ExpenseService {
    List<GetAllExpensesResponse> getAll();
    void add (CreateExpenseRequest createExpenseRequest);
    void update (UpdateExpenseRequest updateExpenseRequest);
    void delete (int id);
}
