package otter.sherry.ottergift.vendor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorService {
    @Autowired
    VendorRepository vendorRepository;

    public void vendorRegister(VendorEntity vendorEntity) {
        vendorRepository.save(vendorEntity);
    }
}
