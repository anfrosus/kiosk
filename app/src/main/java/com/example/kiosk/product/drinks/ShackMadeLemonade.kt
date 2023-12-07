package com.example.kiosk.product.drinks

import com.example.kiosk.Option
import com.example.kiosk.Product
import com.example.kiosk.menu.Drinks

class ShackMadeLemonade: Product, Drinks(), Option {
    override var name = "Shack-made Lemonade"
    override var detail = "매장에서 직접 만드는 상큼한 레몬에이드"
    override var price = 3.9
    override var option: MutableMap<String, Double>
        get() = TODO("Not yet implemented")
        set(value) {}
}