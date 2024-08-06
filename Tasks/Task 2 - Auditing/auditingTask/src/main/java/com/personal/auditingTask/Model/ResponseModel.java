package com.personal.auditingTask.Model;

import com.personal.auditingTask.Entity.Orders;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class ResponseModel {
    private String message;
    private Orders order;
}
