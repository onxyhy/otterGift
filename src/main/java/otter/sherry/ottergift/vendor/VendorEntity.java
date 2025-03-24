package otter.sherry.ottergift.vendor;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;
@Entity
public class VendorEntity {
    @Id
    int vendorId;
    int userId;
    String vendorName;
    String vendorEmail;
    String vendorPhone;
    String vendorAddress;
    String vendorCreditPercent;
    Date vendorTradingStartDate;
}
