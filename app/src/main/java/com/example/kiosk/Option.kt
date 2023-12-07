package com.example.kiosk

interface Option {
    var option: MutableMap<String, Double>

    fun displayOption(){
        println(option)
    }

    fun changedProduct(product: Product) {
        //
    }
}