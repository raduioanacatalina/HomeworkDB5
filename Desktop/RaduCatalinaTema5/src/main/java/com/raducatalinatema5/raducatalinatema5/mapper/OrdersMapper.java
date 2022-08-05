package com.raducatalinatema5.raducatalinatema5.mapper;

import com.raducatalinatema5.raducatalinatema5.model.Orders;
import com.raducatalinatema5.raducatalinatema5.dto.OrdersDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrdersMapper {
    OrdersDTO toOrdersDTO(Orders order);
}
