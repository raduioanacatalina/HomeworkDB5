package com.raducatalinatema5.raducatalinatema5.service;

import com.raducatalinatema5.raducatalinatema5.dto.OrdersDTO;
import com.raducatalinatema5.raducatalinatema5.mapper.OrdersMapper;
import com.raducatalinatema5.raducatalinatema5.model.Orders;
import com.raducatalinatema5.raducatalinatema5.repository.OrdersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrdersService {
    private final OrdersRepository ordersRepository;
    private final OrdersMapper ordersMapper;

    List<Orders> list = new ArrayList<>();

    public List<OrdersDTO> getAllOrders() {
        return ordersRepository.findAll().stream()
                .map(ordersMapper::toOrdersDTO)
                .collect(Collectors.toList());
    }

    public Orders getById(Integer id) {
        return ordersRepository.findById(id).get();
    }

    public Orders save(Orders orders) {
        return ordersRepository.save(orders);
    }

    public void deleteById(Integer id) {
        ordersRepository.deleteById(id);
    }

    public Orders update(Integer id,Orders orders) {

        Orders aux = ordersRepository.findById(id).get();
        aux.setComments(orders.getComments());
        aux.setStatus(orders.getStatus());
        return ordersRepository.save(aux);
    }
}
