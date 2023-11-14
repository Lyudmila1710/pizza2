import kotlin.math.round

abstract class PizzaCity (
    val neapolitanPizzaPrice: Double,
    val romanPizzaPrice: Double,
    val sicilianPizzaPrice: Double,
    val tyroleanPizzaPrice: Double,

){
    var neapolitanPizzaCount = 0
    var romanPizzaCount = 0
    var sicilianPizzaCount = 0
    var tyroleanPizzaCount = 0
    var checkPhotoCount = 0
    var drinkCount = 0
    var souseCarryCount = 0
    var souseKisloCount = 0
    var cofeeneapol = 0
    var cofeeroman = 0
    var cofeesicili = 0
    var cofeetyrolean = 0



    abstract fun neapolitanPizzaSale()
    abstract fun romanPizzaSale()
    abstract fun sicilianPizzaSale()
    abstract fun tyroleanPizzaSale()

    fun showStatistics(city: String){
        var revenue = 0


        println("Продано Сицилийской пиццы: $sicilianPizzaCount")
        println("Продано Неаполитанской пиццы: $neapolitanPizzaCount")
        println("Продано Римской пиццы: $romanPizzaCount")
        println("Продано Тирольской пиццы: $tyroleanPizzaCount")
        when(city){

            "Moscow"-> {

                println("Показано чеков: $checkPhotoCount")
                println("Сумма скидок: ${checkPhotoCount * 50} ")
                println("Процентное соотношение сколько людей показывают фотографию чека, а сколько – нет: ${round((checkPhotoCount.toDouble()/(sicilianPizzaCount+neapolitanPizzaCount+
                        romanPizzaCount+tyroleanPizzaCount).toDouble()) * 100)} %"
                )
                revenue -= checkPhotoCount * 50
            }
            "Peter"-> {


                drinkCount=cofeeneapol+cofeetyrolean+cofeeroman+cofeesicili
                println("Всего продано кофе: $drinkCount")
                println("Продано кофе к Неаполитанской пицце: $cofeeneapol в процентном соотношении: ${round((cofeeneapol.toDouble() / drinkCount) * 100)} % ")
                println("Продано кофе к Сицилийской пицце: $cofeesicili в процентном соотношении: ${round((cofeesicili.toDouble() / drinkCount) * 100)} %")
                println("Продано кофе к Римской пицце: $cofeeroman в процентном соотношении: ${round((cofeeroman.toDouble() / drinkCount) * 100)} %")
                println("Продано кофе к Тирольской пицце: $cofeetyrolean в процентном соотношении: ${round((cofeetyrolean.toDouble() / drinkCount) * 100)} %")
                println("Больше всего кофе было продано к : ${findBestSellingCoffee()}")
                println("Выручка за кофе: ${drinkCount * 200} ")
                println("Процентное соотношение сколько людей берут кофе, а сколько – нет:     ${round((drinkCount.toDouble()/(sicilianPizzaCount+neapolitanPizzaCount+
                        romanPizzaCount+tyroleanPizzaCount).toDouble()) * 100)}%"
                )
                revenue = drinkCount * 200
            }
            "Vologda"->{
                drinkCount=cofeeneapol+cofeetyrolean+cofeeroman+cofeesicili
                println("Показано чеков: $checkPhotoCount")
                println("Сумма скидок: ${checkPhotoCount * 50} ")
                println("Продано кисло-сладкого соуса: $souseKisloCount")
                println("Выручка за кисло-сладкий соус: ${souseKisloCount * 60} ")
                println("Продано соуса Карри: $souseCarryCount")
                println("Выручка за соус Карри: ${souseCarryCount * 40} ")
                println("Продано кофе: $drinkCount")
                println("Продано кофе к Неаполитанской пицце: $cofeeneapol в процентном соотношении: ${round((cofeeneapol.toDouble() / drinkCount) * 100)} % ")
                println("Продано кофе к Сицилийской пицце: $cofeesicili в процентном соотношении: ${round((cofeesicili.toDouble() / drinkCount) * 100)} %")
                println("Продано кофе к Римской пицце: $cofeeroman в процентном соотношении: ${round((cofeeroman.toDouble() / drinkCount) * 100)} %")
                println("Продано кофе к Тирольской пицце: $cofeetyrolean в процентном соотношении: ${round((cofeetyrolean.toDouble() / drinkCount) * 100)} %")
                println("Больше всего кофе было продано к : ${findBestSellingCoffee()}")
                println("Выручка за кофе: ${drinkCount * 200} ")
                println("Процентное соотношение сколько людей показывают фотографию чека, а сколько – нет: ${round((checkPhotoCount.toDouble()/(sicilianPizzaCount+neapolitanPizzaCount+
                                romanPizzaCount+tyroleanPizzaCount).toDouble())*100)} %"
                )
                        println("Процентное соотношение сколько людей берут кофе, а сколько – нет:     ${round((drinkCount.toDouble()/(sicilianPizzaCount+neapolitanPizzaCount+
                        romanPizzaCount+tyroleanPizzaCount).toDouble()) * 100)}%"
                )
                revenue = souseCarryCount * 40 + souseKisloCount * 60 + drinkCount * 200 -checkPhotoCount * 50

            }
        }

        val money = neapolitanPizzaCount * neapolitanPizzaPrice + romanPizzaCount * romanPizzaPrice +
                sicilianPizzaCount * sicilianPizzaPrice +  tyroleanPizzaCount * tyroleanPizzaPrice + revenue
        println("Всего заработано денег: $money")
    }
    fun findBestSellingCoffee(): String {
        val coffeeMap = mapOf(
            "Неаполитанскй пицце" to cofeeneapol,
            "Римской пицце" to cofeeroman,
            "Сицилийской пицце" to cofeesicili,
            "Тирольской пицце" to cofeetyrolean
        )
        val bestSellingPizza = coffeeMap.maxBy { it.value }.key
      return bestSellingPizza
    }

    }
