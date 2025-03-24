package otter.sherry.ottergift.service;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import otter.sherry.ottergift.Users.UsersEntity;

@Entity
public class ServiceEntity {
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

    UsersEntity user;
}
