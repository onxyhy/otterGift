package otter.sherry.ottergift.Users;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;
@Entity
public class UsersEntity {

    @Id
    int userId;
    int userType;
    String userNickName;
    String userPassword;
    Date userBirthday;
    Date userRegistrationDate;
    Date userPurchaseDate;

}
