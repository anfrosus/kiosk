package com.example.kiosk.domain

class Order {
    var orderList = arrayListOf<Product>()

    var orderMap = mutableMapOf<Product, Int>()

    fun countOrder(){
        for (product in orderList){
        }
    }

}