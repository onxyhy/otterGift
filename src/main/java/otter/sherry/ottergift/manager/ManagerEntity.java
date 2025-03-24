package otter.sherry.ottergift.manager;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class ManagerEntity {

    @Id
    int managerId;
    String managerName;
    Date managerfirstDateOfWork;
    int age;
    boolean gender;
}
