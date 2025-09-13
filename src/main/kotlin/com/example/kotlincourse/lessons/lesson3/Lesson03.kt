package org.example.lessons.homework3

const val PI = 3.14
class lesson3  {

    lateinit var phoneNumber: String

    val lazyValue: String by lazy {
        "It is lazy string"
    }

    companion object {
        const val PI = 3.14
    }

    val name: String = "alice"
    var age: Int = 30


    fun example()  {
        speed
    }

    var score: Int = 10
    // ? обозначает nullable переменной
    var speed: Double? = 10.1

    var count: Int = 0
        get() {
            return if (field > 100) field else 0
        }
        set(value) {
            if (value >= 0) field = value
        }
}
