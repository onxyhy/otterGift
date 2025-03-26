package otter.sherry.ottergift.cs;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import otter.sherry.ottergift.user.UserEntity;

@Entity
public class CSEntity {
    @Id
    int serviceId;
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
