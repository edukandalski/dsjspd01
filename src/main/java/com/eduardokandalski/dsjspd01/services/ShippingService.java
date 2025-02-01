package com.eduardokandalski.dsjspd01.services;

import com.eduardokandalski.dsjspd01.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        double basicValue = order.getBasic();
        if (basicValue < 100.0) {
            return 20.0;
        } else if (basicValue >= 100.0 && basicValue < 200.0) {
            return 12.0;
        }
        return 0.0;
    }
}
