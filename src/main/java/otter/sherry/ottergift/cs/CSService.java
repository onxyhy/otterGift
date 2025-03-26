package otter.sherry.ottergift.cs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CSService {
    @Autowired
    CSRepository csRepository;

    public void CSRegister(CSEntity csEntity) {
        csRepository.save(csEntity);
    }
}
