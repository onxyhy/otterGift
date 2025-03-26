package otter.sherry.ottergift.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("")
    public void userRegister(@RequestBody UserEntity userEntity){
        userService.userRegister(userEntity);
    }
}
// /user로 post 요청이 온 상황
//근데 고객은 나한테 어떤 데이터를 주느냐 ? usersEntity 내용을 담은 data를 준다.
//그러면 그 데이터는 = {userNickName,id,userPassword,userBirthday}
/*{
    "id" : "onyx",
    "userNickName" : "슈슈",
    "userPassword" : "2222",
    "userBirthday" : "2001.12.25"
}*/
