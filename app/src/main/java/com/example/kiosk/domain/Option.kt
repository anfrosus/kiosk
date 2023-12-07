package com.example.kiosk.domain

interface Option {
    var option: MutableMap<String, Double>

    fun initializeOption(product: Product) {
        this.option = mutableMapOf<String, Double>()
        option["Single"] = product.price
        option["Double"] = product.price + 4.0
    }
}