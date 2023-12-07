package com.example.kiosk.product.burgers

import com.example.kiosk.Option
import com.example.kiosk.Product
import com.example.kiosk.menu.Burgers

class ShackBurger: Product, Burgers(), Option {
    override var name = "ShackBurger"
    override var detail = "토마토, 양상추, 쉑소스가 토핑된 치즈버거"
    override var price = 6.9

    override var option: MutableMap<String, Double>
        get() = TODO("Not yet implemented")
        set(value) {}
}