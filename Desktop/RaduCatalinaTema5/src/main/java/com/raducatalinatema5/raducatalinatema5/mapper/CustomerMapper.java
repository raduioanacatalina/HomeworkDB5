package com.raducatalinatema5.raducatalinatema5.mapper;

import com.raducatalinatema5.raducatalinatema5.dto.CustomerDTO;
import com.raducatalinatema5.raducatalinatema5.model.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerDTO toCustomerDTO(Customer customer);
}
