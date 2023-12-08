package com.example.kiosk.product.drinks

import com.example.kiosk.domain.Option
import com.example.kiosk.domain.Product
import com.example.kiosk.menu.Drinks

class ShackMadeLemonade: Product, Drinks, Option {
    override var name = "Shack-made Lemonade"
    override var detail = "매장에서 직접 만드는 상큼한 레몬에이드"
    override var price = 3.9
    override var option = mutableMapOf<String, Double>()

    constructor()

    constructor(product: Product, optionStr: String, price: Double) : super() {
        this.name = product.name + "($optionStr)"
        this.detail = product.detail
        this.price = price
    }
}