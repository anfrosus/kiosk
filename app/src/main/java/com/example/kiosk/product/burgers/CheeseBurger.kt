package com.example.kiosk.product.burgers

import com.example.kiosk.Option
import com.example.kiosk.Product
import com.example.kiosk.menu.Burgers

class CheeseBurger: Product, Burgers(), Option {
    override var name = "Cheeseburger"
    override var detail = "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"
    override var price = 6.9

    override var option: MutableMap<String, Double>
        get() = TODO("Not yet implemented")
        set(value) {}
}