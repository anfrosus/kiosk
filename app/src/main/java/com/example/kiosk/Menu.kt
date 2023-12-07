package com.example.kiosk

interface Menu {
    var category:String
    var description:String

    fun display() {
        println(String.format("%-20s", this.category) + "| ${this.description}")
    }
}