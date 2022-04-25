import java.util.*

fun main() {

    val startDiscount = 10_000
    val discount5 = 0.05
    val discountMeloman = 0.01
    var regularCustomer = false
    val scanner = Scanner(System.`in`)
    var discount = 0

    println("Введите сумму покупки")
    val input = scanner.nextDouble()
    val amount = (input * 100).toInt()
    println("Введите постоянный клиент или нет")
    val meloman = scanner.nextLine()

    regularCustomer = meloman == "да"

    if (amount <= 100_000 && regularCustomer == true) {
        discount = (amount - (amount * discountMeloman).toInt()) / 100
        println("Скидка 1 процент, сумма к оплате  $discount")

    } else if (amount >= 100_100 && amount <= 1_000_000 && regularCustomer == true) {
        discount = ((amount - startDiscount) - (amount * discountMeloman)).toInt() / 100
        println("Сумма скидки 100 рублей и дополнительная 1%, сумма к оплате $discount")

    } else if (amount >= 1_000_100 && regularCustomer == true) {
        val discount1 = (amount - (amount * discountMeloman).toInt()) / 100
        discount = (amount - (amount * discount5).toInt()) / 100 - discount1

        println("Скидка 5 процентов, сумма к оплате  $discount")

    } else if (amount >= 100_100 && amount <= 1_000_000) {
        discount = (amount - startDiscount) / 100
        println("Сумма скидки 100 рублей, сумма к оплате $discount")

    } else if (amount >= 1_000_100) {
        discount = (amount - (amount * discount5).toInt()) / 100
        println("Скидка 5 процентов, сумма к оплате  $discount")

    }
}