package otter.sherry.ottergift.service;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ServiceEntity {
    @Id
    int serviceId;
    int userId;
    String serviceName;
    String serviceDescription;
    String serviceType;
    String serviceDate;
    String imageAdd;
    boolean serviceStatus;
}
