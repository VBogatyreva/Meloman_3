fun main() {
    val amount = 500
    val discount1 = 100
    val discount2 = 0.95
    val discount3 = 0.99

    val status: Boolean?

    status = false

    if (status == true) {

        if (amount > 0 && amount < 1_000) {
            var summa = amount
            println("Статус покупателя: " + status + "\nИтоговая стоимость покупки: " + summa + " руб.")

        } else if (amount >= 1_001 && amount < 10_000) {
            var summa = ((amount - discount1) * discount3).toInt()
            println("Статус покупателя: " + status + "\nИтоговая стоимость покупки: " + summa + " руб.")

        } else if (amount >= 10_001) {
            var summa = ((amount * discount2) * discount3).toInt()
            println("Статус покупателя: " + status + "\nИтоговая стоимость покупки: " + summa + " руб.")

        }

    } else if (status == false) {
        if (amount > 0 && amount < 1_000) {
            var summa = amount
            println("Статус покупателя: " + status + "\nИтоговая стоимость покупки: " + summa + " руб.")

        } else if (amount >= 1_001 && amount < 10_000) {
            var summa = amount - discount1
            println("Статус покупателя: " + status + "\nИтоговая стоимость покупки: " + summa + " руб.")

        } else if (amount >= 10_001) {
            var summa = amount * discount2
            println("Статус покупателя: " + status + "\nИтоговая стоимость покупки: " + summa + " руб.")

        }
    }
}
