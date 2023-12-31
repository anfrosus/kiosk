package com.example.kiosk.domain.product.drinks

import com.example.kiosk.domain.Option
import com.example.kiosk.domain.Product
import com.example.kiosk.domain.menu.Drinks

class ShackMadeLemonade: Product, Drinks(), Option {
    override var name = "Shack-made Lemonade"
    override var detail = "매장에서 직접 만드는 상큼한 레몬에이드"
    override var price = 3.9
    override var option = mutableMapOf<String, Double>()

}