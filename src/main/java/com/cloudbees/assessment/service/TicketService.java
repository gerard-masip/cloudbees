package com.cloudbees.assessment.service;

import com.cloudbees.assessment.controller.input.PurchaseInput;
import com.cloudbees.assessment.entity.Ticket;
import com.cloudbees.assessment.entity.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class TicketService {

    //By reading the assessment specs I assume just one train. Avoiding non requested complexity.
    @Autowired
    Train train;

    HashMap<String, Ticket> tickets = new HashMap<>();

    public void purchaseTicket(PurchaseInput purchaseInput) throws Exception {
        if ((purchaseInput.getOrigin().equals(train.getOrigin()) && (purchaseInput.getDestination().equals(train.getDestination())))) {

        }
        else {
            throw new Exception("No origin/destination available");
        }


    }
}
