package otter.sherry.ottergift.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    //앞으로 이거 쓰겠습니다.
    @Autowired
    UserRepository userRepository;

    public void userRegister(UserEntity userEntity) {
//        repository save which I dont know
        userRepository.save(userEntity);
    }
    public UserEntity getUserById(int userId) {
        return userRepository.findById(userId).get();
    }
    public UserEntity getUsersById() {
       return userRepository.findAll().get(0);
    }
}