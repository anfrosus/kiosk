package com.example.kiosk.domain.product.burgers

import com.example.kiosk.domain.Product
import com.example.kiosk.domain.menu.Burgers

class ShackStack: Product, Burgers() {
    override var name = "Shack Stack"
    override var detail = "슈룸 버거와 쉑버거의 맛을 한번에 즐길 수 있는 메뉴"
    override var price = 12.4
}