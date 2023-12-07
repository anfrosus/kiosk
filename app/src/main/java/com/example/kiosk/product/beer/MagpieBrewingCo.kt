package com.example.kiosk.product.beer

import com.example.kiosk.Option
import com.example.kiosk.Product
import com.example.kiosk.menu.Beer

class MagpieBrewingCo: Product, Beer(), Option {
    override var name = "Magpie Brewing Co."
    override var detail = "시워언한 mgpie brewing 맥주"
    override var price = 6.8

    override var option: MutableMap<String, Double>
        get() = TODO("Not yet implemented")
        set(value) {}
}