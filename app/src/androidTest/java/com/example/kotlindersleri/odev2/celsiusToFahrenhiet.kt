package com.example.kotlindersleri.odev2


fun celsiusToFahrenheit(celsius: Double): Double {
    // Verilen formülü kullanarak dönüşümü yapıyoruz.
    val fahrenheit = celsius * 1.8 + 32
    // Hesaplanan Fahrenheit değerini geri döndürüyoruz.
    return fahrenheit
}

fun main() {
    val celsius = 25.0
    val fahrenheit = celsiusToFahrenheit(celsius)

    println("$celsius Celsius = $fahrenheit Fahrenheit")
}