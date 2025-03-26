package otter.sherry.ottergift.vendor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller("/vendor")
public class VendorController {
    @Autowired
    VendorService vendorService;
    @PostMapping("")
    public void serviceRegister(@RequestBody VendorEntity vendorEntity) {
        vendorService.vendorRegister(vendorEntity);
    }
}
