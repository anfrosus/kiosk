package com.example.kiosk.domain.product.burgers

import android.os.Parcel
import android.os.Parcelable
import com.example.kiosk.domain.Option
import com.example.kiosk.domain.Product
import com.example.kiosk.domain.menu.Burgers

class ShackBurger: Product, Burgers(), Option {
    override var name = "ShackBurger"
    override var detail = "토마토, 양상추, 쉑소스가 토핑된 치즈버거"
    override var price = 6.9
    override var option = mutableMapOf<String, Double>()

    fun copy(product: Product, optionStr: String, price: Double): ShackBurger{
        this.name = product.name + " ($optionStr)"
        this.price = price
        return ShackBurger()
    }

}