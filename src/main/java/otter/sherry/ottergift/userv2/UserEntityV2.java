package otter.sherry.ottergift.userv2;

import jakarta.persistence.*;
import lombok.*;
import otter.sherry.ottergift.order.OrderEntity;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserEntityV2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    private int userType;
    private String userNickName;
    private String id;
    private String userPassword;
    private Date userBirthday;
    private Date userRegistrationDate;
    private Date userPurchaseDate;
}
