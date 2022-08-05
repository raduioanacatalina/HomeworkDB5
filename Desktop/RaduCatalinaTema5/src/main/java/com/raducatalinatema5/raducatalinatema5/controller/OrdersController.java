package com.raducatalinatema5.raducatalinatema5.controller;

import com.raducatalinatema5.raducatalinatema5.dto.OrdersDTO;
import com.raducatalinatema5.raducatalinatema5.model.Orders;
import com.raducatalinatema5.raducatalinatema5.service.OrdersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("orders")
@RequiredArgsConstructor
public class OrdersController {

    private final OrdersService ordersService;

    @GetMapping("/all")
    public List<OrdersDTO> getAllOrders() {
        return ordersService.getAllOrders();
    }

    @GetMapping("{id}")
    public Orders getById(@PathVariable Integer id) {
        return ordersService.getById(id);
    }

    @PostMapping
    public Orders save(@RequestBody Orders orders){
        return ordersService.save(orders);
    }

    @PutMapping("{id}")
    public Orders update(@PathVariable Integer id,@RequestBody Orders orders)
    {
        return ordersService.update(id,orders);
    }
    @DeleteMapping("{id}")
    public void deleteOrders(@PathVariable Integer id) {
        ordersService.deleteById(id);
    }
}
