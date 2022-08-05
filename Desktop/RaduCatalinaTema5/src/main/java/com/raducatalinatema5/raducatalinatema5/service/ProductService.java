package com.raducatalinatema5.raducatalinatema5.service;

import com.raducatalinatema5.raducatalinatema5.model.Product;
import com.raducatalinatema5.raducatalinatema5.dto.ProductDTO;
import com.raducatalinatema5.raducatalinatema5.mapper.ProductMapper;
import com.raducatalinatema5.raducatalinatema5.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    List<Product> list = new ArrayList<>();

    public List<ProductDTO> getAllProducts() {
        return productRepository.findAll().stream()
                .map(productMapper::toProductDTO)
                .collect(Collectors.toList());
    }

    public Product getById(Integer id) {
        return productRepository.findById(id).get();
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public void deleteById(Integer id) {
        productRepository.deleteById(id);
    }

    public Product update(Integer id,Product product) {

        Product aux = productRepository.findById(id).get();
        aux.setName(product.getName());
        aux.setPrice(product.getPrice());
        return productRepository.save(aux);
    }

}
