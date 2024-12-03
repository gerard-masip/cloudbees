package com.cloudbees.assessment.controller;

import com.cloudbees.assessment.controller.input.PurchaseInput;
import com.cloudbees.assessment.entity.Ticket;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    @PostMapping("/purchase")
    public void purchaseTicket(PurchaseInput purchaseInput) {

    }

}
