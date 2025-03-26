package otter.sherry.ottergift.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller("/manager")
public class ManagerController {
    @Autowired
    ManagerService managerService;
    @PostMapping("")
    public void managerRegister(@RequestBody ManagerEntity managerEntity) {
        managerService.managerRegister(managerEntity);
   }
}
