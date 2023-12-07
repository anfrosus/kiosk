package com.example.kiosk.product.burgers

import com.example.kiosk.domain.Option
import com.example.kiosk.domain.Product
import com.example.kiosk.menu.Burgers

class ShackBurger: Product, Burgers(), Option {
    override var name = "ShackBurger"
    override var detail = "토마토, 양상추, 쉑소스가 토핑된 치즈버거"
    override var price = 6.9

    override var option = mutableMapOf<String, Double>()

}