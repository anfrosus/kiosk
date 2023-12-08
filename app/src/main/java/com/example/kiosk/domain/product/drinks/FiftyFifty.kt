package com.example.kiosk.domain.product.drinks

import com.example.kiosk.domain.Option
import com.example.kiosk.domain.Product
import com.example.kiosk.domain.menu.Drinks

class FiftyFifty: Product, Drinks(), Option {
    override var name = "Fifty/Fifty"
    override var detail = "레몬에이드와 아이스티의 만남"
    override var price = 3.5
    override var option = mutableMapOf<String, Double>()

}