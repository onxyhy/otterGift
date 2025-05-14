package otter.sherry.ottergift.cs;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.stereotype.Controller;
import otter.sherry.ottergift.user.UserEntity;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class CSEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int serviceId;
    @Column(nullable = false)
    String serviceName;
    String serviceDescription;
    String serviceType;
    String serviceDate;
    String imageAdd;
    boolean serviceStatus;
    @ManyToOne
    @JoinColumn(name ="userId")
    UserEntity user;
}
