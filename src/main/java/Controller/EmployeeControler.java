package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import repository.EmployeeRepository;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeControler {
    @Autowired

    private EmployeeRepository employeeRepository;

    @GetMapping({"/list","/"})
    public ModelAndView getAllEmployees() {
        ModelAndView mav = new ModelAndView("list-employees");
        mav.addObject("employees", employeeRepository.findAll());
        return mav;
    }
}
