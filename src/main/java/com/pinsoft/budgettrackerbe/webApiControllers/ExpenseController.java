package com.pinsoft.budgettrackerbe.webApiControllers;

import com.pinsoft.budgettrackerbe.business.abstracts.ExpenseService;
import com.pinsoft.budgettrackerbe.business.requests.CreateExpenseRequest;
import com.pinsoft.budgettrackerbe.business.requests.UpdateExpenseRequest;
import com.pinsoft.budgettrackerbe.business.responses.GetAllExpensesResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
@AllArgsConstructor
public class ExpenseController {

    private ExpenseService expenseService;

    @GetMapping("/getAll")
    public List<GetAllExpensesResponse> getAll() {
        return expenseService.getAll();
    }

    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody CreateExpenseRequest createExpenseRequest) {
        this.expenseService.add(createExpenseRequest);
    }

    @PutMapping("/update")
    public void update (@RequestBody UpdateExpenseRequest updateExpenseRequest) {
        this.expenseService.update(updateExpenseRequest);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable int id) {
        this.expenseService.delete(id);
    }
}
