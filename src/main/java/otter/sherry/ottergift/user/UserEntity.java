package otter.sherry.ottergift.user;

import jakarta.persistence.*;
import lombok.*;
import otter.sherry.ottergift.order.OrderEntity;
import otter.sherry.ottergift.cs.CSEntity;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserEntity {

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

    // ✅ User와 Order의 관계 (1:N)
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<OrderEntity> orders;
}
