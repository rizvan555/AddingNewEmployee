package com.rizvankarimov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/employee") // bu controllerin URL-nin önünde /employee yazilacaq
public class MyController {

    @RequestMapping("/")
    public String showFirstView(){
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model){
        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(@ModelAttribute("employee") Employee emp){

        String name = emp.getName();
        emp.setName("Mr." + name);

        String surname = emp.getSurname();
        emp.setSurname(surname + "!");

        double salary = emp.getSalary();
        emp.setSalary(salary * 2);

        return "show-emp-details-view";
    }
}
