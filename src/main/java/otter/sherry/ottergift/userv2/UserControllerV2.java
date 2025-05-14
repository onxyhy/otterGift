package otter.sherry.ottergift.userv2;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserControllerV2 {
    @Autowired
    UserServiceV2 userServiceV2;

    @GetMapping("/userv2/{userId}")
    public UserEntityV2 getUser(@PathVariable("userId") Long userId) {
        UserEntityV2 userEntityV2 =  userServiceV2.getUserInfo(userId);
        return userEntityV2;

    }

    @PostMapping("/userv2")
    public UserEntityV2 createUser(@RequestBody UserEntityV2 userEntityV2) {
        userEntityV2 =  userServiceV2.usermakeId(userEntityV2);
        return userEntityV2;
    }

}
