package com.example.kiosk.product.drinks

import com.example.kiosk.Option
import com.example.kiosk.Product
import com.example.kiosk.menu.Drinks

class FiftyFifty: Product, Drinks(), Option {
    override var name = "Fifty/Fifty"
    override var detail = "레몬에이드와 아이스티의 만남"
    override var price = 3.5
    override var option: MutableMap<String, Double>
        get() = TODO("Not yet implemented")
        set(value) {}
}