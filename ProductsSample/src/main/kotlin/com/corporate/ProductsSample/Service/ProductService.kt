package com.corporate.ProductsSample.Service

import com.corporate.ProductsSample.Models.Product
import com.corporate.ProductsSample.Repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class ProductService(val db: ProductRepository) {
    fun findProducts(): List<Product> = db.findProducts()

    fun findProductById(id: String): Product = db.findProductById(id)

    fun post(message: Product){
        db.save(message)
    }
}