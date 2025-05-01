package otter.sherry.ottergift.cs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cs")
public class CSController {
    @Autowired
    CSService csService;

    @PostMapping("")
    public void csRegister(@RequestBody CSEntity csEntity) {
        csService.CSRegister(csEntity);
   }
    //문의 1개 조회

    //문의 전부 조회

}
