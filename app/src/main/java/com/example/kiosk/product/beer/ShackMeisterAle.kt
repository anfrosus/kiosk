package com.example.kiosk.product.beer

import com.example.kiosk.domain.Product
import com.example.kiosk.menu.Beer

class ShackMeisterAle: Product, Beer() {
    override var name = "ShackMeisterAle"
    override var detail = "쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주"
    override var price = 9.8
}