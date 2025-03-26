package otter.sherry.ottergift.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {
    @Autowired
    ManagerRepository managerRepository;

    public void managerRegister(ManagerEntity managerEntity) {
        managerRepository.save(managerEntity);
    }

}
