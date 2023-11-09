package com.pinsoft.budgettrackerbe.webApiControllers;

import com.pinsoft.budgettrackerbe.business.abstracts.IncomeService;
import com.pinsoft.budgettrackerbe.business.requests.CreateIncomeRequest;
import com.pinsoft.budgettrackerbe.business.requests.UpdateIncomeRequest;
import com.pinsoft.budgettrackerbe.business.responses.GetAllIncomeResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/incomes")
@AllArgsConstructor
public class IncomeController {

    private IncomeService incomeService;

    @GetMapping("/getAll")
    public List<GetAllIncomeResponse> getAll() {
        return incomeService.getAll();
    }

    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody CreateIncomeRequest createIncomeRequest) {
        this.incomeService.add(createIncomeRequest);
    }

    @PutMapping("/update")
    public void update(@RequestBody UpdateIncomeRequest updateIncomeRequest) {
        this.incomeService.update(updateIncomeRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        this.incomeService.delete(id);
    }
}