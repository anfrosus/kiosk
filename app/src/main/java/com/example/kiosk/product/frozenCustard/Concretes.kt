package com.example.kiosk.product.frozenCustard

import com.example.kiosk.domain.Product
import com.example.kiosk.menu.FrozenCustard

class Concretes: Product, FrozenCustard() {
    override var name = "Concretes"
    override var detail = "쉐이크쉑의 쫀득한 커스터드와 다양한 믹스-인의 조합"
    override var price = 5.9
}