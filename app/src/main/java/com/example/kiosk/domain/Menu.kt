package com.example.kiosk.domain

interface Menu {
    var category:String
    var description:String

    fun display() {
        println(String.format("%-20s", this.category) + "| ${this.description}")
    }
}