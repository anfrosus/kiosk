package com.example.kiosk.product.drinks

import com.example.kiosk.Product
import com.example.kiosk.menu.Drinks

class FreshBrewedIcedTea: Product, Drinks() {
    override var name = "Fresh Brewed Iced Tea"
    override var detail = "직접 유기농 홍차를 우려낸 아이스티"
    override var price = 3.4
}