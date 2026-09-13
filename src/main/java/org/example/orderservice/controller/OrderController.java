package org.example.orderservice.controller;

import lombok.RequiredArgsConstructor;
import org.example.orderservice.entity.Order;
import org.example.orderservice.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @GetMapping("/{id}")
    public Order getOrder(
            @PathVariable Long id
    ){

        return service.getOrderById(id);

    }
}
