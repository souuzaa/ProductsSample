package com.corporate.ProductsSample.Models

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("PRODUCT")
data class Product (@Id val id: String?, val name: String, val price: Double)