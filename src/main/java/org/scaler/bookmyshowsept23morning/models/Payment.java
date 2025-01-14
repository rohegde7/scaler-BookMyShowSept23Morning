package org.scaler.bookmyshowsept23morning.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Payment extends BaseModel {
    private int amount;
    private String refNumber;
    private Date paymentDate;
    private PaymentStatus status;
    private PaymentGateway paymentGateway;
    private PaymentMode paymentMode;
    private Booking booking;
}
