//package com.example.kiosk
//
//class Test {
//}
//
//class Test2(name: String) {
//    var nickname = name
//}
//
//class D(val name: String) {
//
//    var age: Int = 20
//    var height: Int = 500
//
//
////        컴파일 에러!
////    constructor(name: String, age: Int) {
////        this.age = age
////    }
//
////        conflicting overloads
////    constructor(name: String) : this(name) {
////    }
//
//    constructor(name: String, age: Int) : this(name){
//
//    }
//
//    constructor(name: String, age: Int, height: Int) : this(name) {
//        this.height = height
//    }
//}
//
//fun test123(){
//    var test = Test()
//}
//
//class Test3 {
//
//    var name: String
//
//    constructor(name:String){
//        this.name = name
//    }
//    constructor(name:Int){
//        this.name = "부 생성자"
//    }
//}
//
//data class TestData(val name:String) {
//
//
//}
//
//
//fun main(){
//    var test1 = Test()
//    test1.name = ""
//    println(test1.name)
//}
//
//fun method() {
//    println("메소드")
//}
//
//fun method2(input: String): String {
//    return input
//}