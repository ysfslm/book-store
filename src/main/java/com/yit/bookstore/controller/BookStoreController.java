package com.yit.bookstore.controller;

import com.yit.bookstore.dto.BookOrderRequest;
import com.yit.bookstore.model.Order;
import com.yit.bookstore.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/bookstore")
public class BookStoreController {

    private final OrderService orderService;

    public BookStoreController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello");
    }

    @PostMapping
    public  ResponseEntity<Order> putAnOrder(@RequestBody BookOrderRequest bookOrderRequest) {
        Order order = orderService.putAnOrder(bookOrderRequest.getBookIdList(), bookOrderRequest.getUsername());

        return new ResponseEntity(order, HttpStatus.OK);
    }



}
