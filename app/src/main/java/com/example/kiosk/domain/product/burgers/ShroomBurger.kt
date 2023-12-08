package com.example.kiosk.domain.product.burgers

import com.example.kiosk.domain.Product
import com.example.kiosk.domain.menu.Burgers

class ShroomBurger: Product, Burgers() {
    override var name = "ShroomBurger"
    override var detail = "몬스터 치즈와 체다 치즈로 속을 채우고 바삭하게 튀겨낸 포토벨로 버섯 패티에 양상추, 토마토, 쉑소스를 올린 베지테리안 버거"
    override var price = 9.4
}