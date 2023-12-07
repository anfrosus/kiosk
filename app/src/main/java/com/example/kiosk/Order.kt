package com.example.kiosk

class Order {
    var orderList = arrayListOf<Product>()

    fun addOrder(product: Product){
        this.orderList.add(product)
    }

}