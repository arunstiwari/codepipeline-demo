package com.javatechie.aws.cicd.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

@SpringBootTest
public class OrderDaoTest {
    @Autowired
    private OrderDao orderDao;
    @Test
    public void getOrders() {
        List<Order> orders = orderDao.getOrders();
        Assertions.assertEquals(4,orders.size());
    }
}
