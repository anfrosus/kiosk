package com.example.kiosk

class Order {
    var orderList = arrayListOf<Product>()

    var orderMap = mutableMapOf<Product, Int>()

    fun countOrder(){
        for (product in orderList){
        }
    }

}