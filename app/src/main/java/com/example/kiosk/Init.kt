package com.example.kiosk

import android.os.Handler
import android.os.Looper
import com.example.kiosk.menu.Beer
import com.example.kiosk.menu.Burgers
import com.example.kiosk.menu.Drinks
import com.example.kiosk.menu.FrozenCustard
import com.example.kiosk.product.beer.MagpieBrewingCo
import com.example.kiosk.product.beer.ShackMeisterAle
import com.example.kiosk.product.burgers.CheeseBurger
import com.example.kiosk.product.burgers.ShackStack
import com.example.kiosk.product.burgers.ShackBurger
import com.example.kiosk.product.burgers.ShroomBurger
import com.example.kiosk.product.drinks.FiftyFifty
import com.example.kiosk.product.drinks.FreshBrewedIcedTea
import com.example.kiosk.product.drinks.ShackMadeLemonade
import com.example.kiosk.product.frozenCustard.Concretes
import com.example.kiosk.product.frozenCustard.ShackOfTheWeek
import java.lang.NumberFormatException

class Init() {

    private var menuList = arrayListOf<Menu>()

    private var productList = arrayListOf<ArrayList<Product>>()

    private var burgerList = arrayListOf<Product>()
    private var drinkList = arrayListOf<Product>()
    private var beerList = arrayListOf<Product>()
    private var frozenCustardList = arrayListOf<Product>()

    private var totalList = arrayListOf<Product>()
    private var totalPrice = 0.0

    private var orderNum = 1

    init {

        menuList.add(Burgers())
        menuList.add(FrozenCustard())
        menuList.add(Drinks())
        menuList.add(Beer())
        burgerList.add(ShackBurger())
        burgerList.add(ShroomBurger())
        burgerList.add(CheeseBurger())
        burgerList.add(ShackStack())
        frozenCustardList.add(ShackOfTheWeek())
        frozenCustardList.add(Concretes())
        drinkList.add(ShackMadeLemonade())
        drinkList.add(FreshBrewedIcedTea())
        drinkList.add(FiftyFifty())
        beerList.add(ShackMeisterAle())
        beerList.add(MagpieBrewingCo())

        productList.add(burgerList)
        productList.add(frozenCustardList)
        productList.add(drinkList)
        productList.add(beerList)
    }

    fun kiosk() {

        displayMenu()
        selectMenu(Order())

    }

    private fun selectMenu(order: Order) {
        var selectedNum = validateInput(0, menuList.size + 2)
        when (selectedNum) {
            //토탈 확인
            0 -> {
                checkTotal(order)
            }
            //주문 확인
            5 -> {
                checkOrder(order)
            }
            //주문 취소
            6 -> {
                cancelOrder(order)
            }
            //상품 선택
            else -> {
                displayProduct(selectedNum)
                selectProduct(selectedNum, order)
            }
        }
    }

    private fun checkTotal(order: Order) {
        println("[ 총 판매상품 목록 현황\n현재까지 총 판매된 상품 목록은 아래와 같습니다.\n")
        for(product in totalList){
            println(String.format("%-25s", product.name)
                    + String.format("%-10s","| W ${product.price} "))
        }
        println("[ 총 판매금액 현황 ]\n" +
                "현재까지 총 판매된 금액은 [ W $totalPrice ] 입니다.")
        println("\n1. 돌아가기")

        if (validateInput(1, 1) == 1){
            displayMenu()
            selectMenu(order)
        }
    }

    private fun updateTotal(order: Order){
        totalList.addAll(order.orderList)
        for (product in order.orderList) {
            totalPrice += product.price
        }
    }

    private fun cancelOrder(order: Order) {
        println("진행하던 주문을 취소하시겠습니까?\n 1. 확인     2.취소")
        if (validateInput(1, 2) == 1) {
            println("진행하던 주문이 취소되었습니다.\n\n")
            displayMenu()
            selectMenu(Order())
        }else {
            println("주문을 계속 진행해 주세요")
            selectMenu(order)
        }

    }

    private fun validateInput(minimum: Int,maximum: Int): Int {
        var num: Int
        while (true) {
            try {
                num = readlnOrNull()?.toInt() ?: -1
                break
            }catch (e: NumberFormatException){
                println("숫자를 입력해 주세요")
            }
        }

        if (num in minimum..maximum){
            return num
        } else {
            println("올바른 숫자를 입력해 주세요")
            return validateInput(minimum, maximum)
        }
    }

    private fun displayMenu() {
        println("\"SHAKESHAK BURGER에 오신걸 환영합니다.\"")
        println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n")
        println("[ SHAKESHAK MENU ]")
        for ((idx, menu) in menuList.withIndex()) {
            println(
                String.format("%-20s", "${idx + 1}. ${menu.category}")
                        + "| ${menu.description}"
            )
        }
        println("\n[ ORDER MENU ]")
        println(String.format("%-20s", "5. Order") + "| 장바구니를 확인 후 주문합니다.")
        println(String.format("%-20s", "6. Cancel") + "| 진행중인 주문을 취소합니다.")
    }

    private fun displayProduct(inputNum: Int) {
        var menuIdx = inputNum - 1
        for ((idx, product) in productList[menuIdx].withIndex()) {
            println(
                String.format("%-25s", "${idx + 1}. ${product.name}")
                        + String.format("%-10s","| W ${product.price} ")
                        + "| ${product.detail}"
            )
        }
    }

    private fun selectProduct(selectedNum: Int, order: Order){
        var idx = validateInput(1, productList[selectedNum-1].size) - 1
        var product = productList[selectedNum-1][idx]
        //ToDo: 옵션 존재한다면 바꿔주기
        println(
            String.format("%-25s", "${idx + 1}. ${product.name}")
                    + String.format("%-10s", "| W ${product.price} ")
                    + "| ${product.detail}"
        )
        println("위 메뉴를 장바구니에 추가하시겠습니까?\n 1. 확인     2.취소")

        addOrNot(product, order)
    }

    private fun addOrNot (product: Product, order: Order){
        if (validateInput(1, 2) == 1){
            order.orderList.add(product)
            //ToDo: orderMap 에 put
            putOrderMap(product, order)
            println("${product.name} 가 장바구니에 추가되었습니다.\n")
        }
        displayMenu()
        selectMenu(order)
    }

    private fun checkOrder(order: Order){
        var sum: Double = 0.0
        println("아래와 같이 주문 하시겠습니까?\n")
        println("[ Orders ]")
        for(product in order.orderMap){
            var price = product.key.price * product.value
            println(
                String.format("%-25s", product.key.name)
                        + String.format("%-10s","| W ${price} ")
                        + "| ${product.value}개 "
                        + "| ${product.key.detail}"
            )
            sum += price

        }

        println("\n[ Total ]\nW $sum")
        println("\n1. 주문     2.메뉴판")
        doOrder(order)
    }

    private fun doOrder(order: Order){
        if(validateInput(1, 2) == 1) {
            if(order.orderList.isNotEmpty()) {
                updateTotal(order)
                println("주문이 완료되었습니다!\n\n" +
                        "대기번호는 [ ${orderNum++} ] 번 입니다.\n" +
                        "(3초후 메뉴판으로 돌아갑니다.)\n")
                //ToDo: 3초 지연
//                customDelay(3000)
                displayMenu()
                selectMenu(Order())
            }else {
                println("장바구니에 상품이 존재하지 않습니다.")
                displayMenu()
                selectMenu(order)
            }
        }else {
            displayMenu()
            selectMenu(order)
        }
    }

    private fun putOrderMap(product: Product, order: Order) {
        if (order.orderMap.containsKey(product)) {
            var value = order.orderMap[product]!!
            order.orderMap[product] = ++value

        } else {
            order.orderMap[product] = 1
        }
    }


    fun customDelay(delayMillis: Long){
        Handler(Looper.getMainLooper()).postDelayed({
            // 실행 할 코드
        }, delayMillis)
    }
}