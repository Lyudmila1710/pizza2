import kotlin.system.exitProcess
fun main() {
    val pizzaPeter = PizzaPeter(
        175.0, 241.5,
        167.5, 215.0
    )
    val pizzaMoscow = PizzaMoscow(
        215.0, 250.5,
        180.5, 240.0
    )
    val pizzaVologda = PizzaVologda (
        200.0, 123.8,
        276.0, 342.0
    )
    var currentPizzaCity: PizzaCity
    while (true) {
        println("Добрый день! Выберите город")
        println("1. Москва\n 2. Санкт-Петербург\n3. Вологда\n\n0. Выход из программы")

        currentPizzaCity = when (readln()) {
            "1" -> pizzaMoscow
            "2" -> pizzaPeter
            "3" -> pizzaVologda
            "0" -> break
            else -> {
                println("ERROR")
                continue
            }
        }
        println("Выберите пиццу:")
        println("1. Неаполитанская пицца\n2. Римская пицца\n3. Сицилийская пицца\n4. Тирольская пицца\n\n0. Показать статистику")

        when (readln()) {
            "1" -> {
                currentPizzaCity.neapolitanPizzaSale()
                selectAddService(currentPizzaCity)
            }
            "2" -> {
                currentPizzaCity.romanPizzaSale()
                selectAddService(currentPizzaCity)
            }
            "3" -> {
                currentPizzaCity.sicilianPizzaSale()
                selectAddService(currentPizzaCity)
            }
            "4" -> {
                currentPizzaCity.tyroleanPizzaSale()
                selectAddService(currentPizzaCity)
            }
            "0" ->  currentPizzaCity.showStatistics(getCityName(currentPizzaCity))
            else -> {
                println("ERROR")
                exitProcess(1)
            }
        }
    }
}

fun getCityName(currentPizzaCity: PizzaCity): String {
    return when (currentPizzaCity) {
        is PizzaMoscow -> "Moscow"
        is PizzaPeter -> "Peter"
        is PizzaVologda -> "Vologda"
        else -> "Unknown"
    }
}

fun selectAddService(currentPizzaCity: PizzaCity ){
    when(currentPizzaCity){
        is PizzaVologda -> {
            currentPizzaCity.showCheckPhoto()
            currentPizzaCity.SouseSale()
        }
        is PizzaMoscow -> currentPizzaCity.showCheckPhoto()

    }

}