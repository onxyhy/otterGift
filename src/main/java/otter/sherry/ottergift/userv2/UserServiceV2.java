package otter.sherry.ottergift.userv2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import otter.sherry.ottergift.user.UserEntity;
import otter.sherry.ottergift.user.UserRepository;

@Service
public class UserServiceV2 {
    @Autowired
    UserRepositoryV2 userRepositoryV2;


   public UserEntityV2 usermakeId(UserEntityV2 userEntityV2) {
        userEntityV2 = userRepositoryV2.save(userEntityV2);
        return userEntityV2;
    }

    public UserEntityV2 getUserInfo(Long userId) {
       return userRepositoryV2.findById(userId).get();
    }
}