package com.corporate.ProductsSample.Repository

import com.corporate.ProductsSample.Models.Product
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param

interface ProductRepository : CrudRepository<Product, String> {
    @Query("select * from product")
    fun findProducts(): List<Product>

    @Query("select * from product where id = :id")
    fun findProductById(@Param("id") id : String): Product
}