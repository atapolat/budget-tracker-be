package com.pinsoft.budgettrackerbe.business.concretes;

import com.pinsoft.budgettrackerbe.business.abstracts.ExpenseService;
import com.pinsoft.budgettrackerbe.business.requests.CreateExpenseRequest;
import com.pinsoft.budgettrackerbe.business.requests.UpdateExpenseRequest;
import com.pinsoft.budgettrackerbe.business.responses.GetAllExpensesResponse;
import com.pinsoft.budgettrackerbe.entities.concretes.Expense;
import com.pinsoft.budgettrackerbe.mappers.ModelMapperService;
import com.pinsoft.budgettrackerbe.repositories.ExpenseRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ExpenseManager implements ExpenseService {
    private ExpenseRepository expenseRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllExpensesResponse> getAll() {
        List<Expense> expenses = null;
        List<GetAllExpensesResponse> expensesResponse = expenses.stream()
                .map(expense -> this.modelMapperService.forResponse()
                        .map(expense, GetAllExpensesResponse.class)).collect(Collectors.toList());
        return expensesResponse;
    }

    @Override
    public void add(CreateExpenseRequest createExpenseRequest) {
        Expense expense = this.modelMapperService.forRequest().map(createExpenseRequest, Expense.class);
        this.expenseRepository.save(expense);
    }

    @Override
    public void update(UpdateExpenseRequest updateExpenseRequest) {
        Expense expense = this.modelMapperService.forRequest().map(updateExpenseRequest, Expense.class);
        this.expenseRepository.save(expense);
    }

    @Override
    public void delete(int id) {
        this.expenseRepository.deleteById(id);
    }
}
