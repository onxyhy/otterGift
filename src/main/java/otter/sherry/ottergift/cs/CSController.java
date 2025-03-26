package otter.sherry.ottergift.cs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller("/service")
public class CSController {
    @Autowired
    CSService csService;
   @PostMapping("")
    public void service(@RequestBody CSEntity csEntity) {
        csService.CSRegister(csEntity);
   }
}
