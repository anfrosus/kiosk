package com.example.kiosk.product.frozenCustard

import com.example.kiosk.Product
import com.example.kiosk.menu.FrozenCustard

class ShackOfTheWeek: Product, FrozenCustard() {
    override var name = "Shake of the Week"
    override var detail = "특별한 커스터드 플레이버"
    override var price = 6.5
}