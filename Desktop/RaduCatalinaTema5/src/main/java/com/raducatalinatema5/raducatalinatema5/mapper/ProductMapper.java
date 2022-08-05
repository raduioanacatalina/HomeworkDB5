package com.raducatalinatema5.raducatalinatema5.mapper;

import com.raducatalinatema5.raducatalinatema5.dto.ProductDTO;
import com.raducatalinatema5.raducatalinatema5.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductDTO toProductDTO(Product product);
}
