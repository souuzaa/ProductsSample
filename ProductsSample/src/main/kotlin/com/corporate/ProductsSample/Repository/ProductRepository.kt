package com.corporate.ProductsSample.Repository

import com.corporate.ProductsSample.Models.Product
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface ProductRepository : CrudRepository<Product, String> {
    @Query("select * from product")
    fun findProducts(): List<Product>
}