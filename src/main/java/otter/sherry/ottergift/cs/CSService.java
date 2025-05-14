package otter.sherry.ottergift.cs;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import otter.sherry.ottergift.user.UserEntity;
import otter.sherry.ottergift.user.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CSService {
    @Autowired
    CSRepository csRepository;
    @Autowired
    UserRepository userRepository;

    public Optional<CSEntity> findById(Long serviceId) {
        return csRepository.findById(serviceId);
    }
    public List<CSEntity> getAllInquiries() {
        return csRepository.findAll();
    }
    public void CSRegister(Long userId, CSEntity csEntity) {
        UserEntity user = userRepository.findById(userId)
                        .orElseThrow(null);
        csEntity.setUser(user);
        csRepository.save(csEntity);
    }
}
