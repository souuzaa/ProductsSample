package com.corporate.ProductsSample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProductsSampleApplication

fun main(args: Array<String>) {
	runApplication<ProductsSampleApplication>(*args)
}