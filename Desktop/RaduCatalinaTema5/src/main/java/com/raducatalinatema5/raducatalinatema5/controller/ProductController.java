package com.raducatalinatema5.raducatalinatema5.controller;

import com.raducatalinatema5.raducatalinatema5.dto.ProductDTO;
import com.raducatalinatema5.raducatalinatema5.model.Product;
import com.raducatalinatema5.raducatalinatema5.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/all")
    public List<ProductDTO> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("{id}")
    public Product getById(@PathVariable Integer id) {
        return productService.getById(id);
    }

    @PostMapping
    public Product save(@RequestBody Product product){
        return productService.save(product);
    }

    @PutMapping("{id}")
    public Product update(@PathVariable Integer id,@RequestBody Product product)
    {
        return productService.update(id,product);
    }
    @DeleteMapping("{id}")
    public void deleteProduct(@PathVariable Integer id) {
        productService.deleteById(id);
    }
}
