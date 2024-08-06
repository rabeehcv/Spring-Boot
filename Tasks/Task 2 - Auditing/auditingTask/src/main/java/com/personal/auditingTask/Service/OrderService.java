package com.personal.auditingTask.Service;

import com.personal.auditingTask.Entity.Orders;
import com.personal.auditingTask.Model.ResponseModel;
import com.personal.auditingTask.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;
    public ResponseModel addOrder(Orders order){
        ResponseModel responseModel = new ResponseModel();
        orderRepository.save(order);
        responseModel.setMessage("Order Created");
        responseModel.setOrder(order);
        return responseModel;
    }
    public ResponseModel updateOrder(Orders order){
        ResponseModel responseModel = new ResponseModel();
        orderRepository.save(order);
        responseModel.setMessage("Order Updated");
        responseModel.setOrder(order);
        return responseModel;
    }
}
