package com.corporate.ProductsSample.Controllers

import com.corporate.ProductsSample.Models.Product
import com.corporate.ProductsSample.Service.ProductService
import org.springframework.web.bind.annotation.*

@RestController
class ProductController(val service: ProductService) {
    @GetMapping
    fun index(): List<Product> = service.findProducts();

    @GetMapping("/product/{id}")
    fun getById(@PathVariable id: String) = service.findProductById(id);

    @PostMapping
    fun post(@RequestBody message: Product) {
        service.post(message)
    }
}