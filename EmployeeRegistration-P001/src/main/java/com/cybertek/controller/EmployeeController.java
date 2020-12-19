package com.cybertek.controller;

import com.cybertek.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {


    @GetMapping("/register")
    public String addEmployee(Model model){
        model.addAttribute("employee", new Employee());
        List<String> stateList= Arrays.asList("state select...","Alabama","Alaska","Arizona","Arkansas","California",
                "Colorado", "Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana", "Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Carolina","North Dakota","Ohio","Oklahoma","Oregon","Pennsylvania", "Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming");
        model.addAttribute("statelist", stateList);
        return "/employee/employee-registration";
    }

    @PostMapping("/employeelist")
    public String postEmployeeInfo(@ModelAttribute("employee") Employee employee){
//        LocalDate ldate=LocalDate.parse(employee.getBirthday());
        employee.setAge(Period.between(LocalDate.parse(employee.getBirthday()), LocalDate.now()).getYears());
        System.out.println(employee.toString());
        return "/employee/employee-list-table";
    }


}
