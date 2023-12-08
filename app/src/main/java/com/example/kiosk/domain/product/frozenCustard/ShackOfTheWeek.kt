package com.example.kiosk.domain.product.frozenCustard

import com.example.kiosk.domain.Product
import com.example.kiosk.domain.menu.FrozenCustard

class ShackOfTheWeek: Product, FrozenCustard() {
    override var name = "Shake of the Week"
    override var detail = "특별한 커스터드 플레이버"
    override var price = 6.5
}