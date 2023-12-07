package com.example.kiosk.product.beer

import com.example.kiosk.domain.Option
import com.example.kiosk.domain.Product
import com.example.kiosk.menu.Beer

class MagpieBrewingCo: Product, Beer(), Option {
    override var name = "Magpie Brewing Co."
    override var detail = "시워언한 mgpie brewing 맥주"
    override var price = 6.8

    override var option = mutableMapOf<String, Double>()
}