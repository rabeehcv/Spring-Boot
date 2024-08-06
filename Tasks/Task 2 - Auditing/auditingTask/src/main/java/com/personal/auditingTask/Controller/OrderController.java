package com.personal.auditingTask.Controller;

import com.personal.auditingTask.Entity.Orders;
import com.personal.auditingTask.Model.ResponseModel;
import com.personal.auditingTask.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("/create")
    public ResponseModel addOrder(@RequestBody Orders order){
        return orderService.addOrder(order);
    }
    @PatchMapping("/update")
    public ResponseModel updateOrder(@RequestBody Orders order){
        return orderService.updateOrder(order);
    }
}
