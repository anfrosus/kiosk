package com.example.kiosk.product.burgers

import com.example.kiosk.domain.Option
import com.example.kiosk.domain.Product
import com.example.kiosk.menu.Burgers

class CheeseBurger: Product, Burgers(), Option {
    override var name = "Cheeseburger"
    override var detail = "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"
    override var price = 6.9

    override var option = mutableMapOf<String, Double>()}