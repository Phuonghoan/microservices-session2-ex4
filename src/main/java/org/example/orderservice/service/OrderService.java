package org.example.orderservice.service;

import lombok.RequiredArgsConstructor;
import org.example.orderservice.entity.Order;
import org.example.orderservice.exception.ResourceNotFoundException;
import org.example.orderservice.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository repository;

    public Order getOrderById(Long id){

        return repository
                .findById(id)

                .orElseThrow(

                        () ->
                                new ResourceNotFoundException(
                                        "Order với ID "
                                                + id
                                                + " không tồn tại trên hệ thống!"
                                )

                );


    }

}
