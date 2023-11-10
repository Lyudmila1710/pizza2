import kotlin.math.round

abstract class PizzaCity (
    val neapolitanPizzaPrice: Double,
    val romanPizzaPrice: Double,
    val sicilianPizzaPrice: Double,
    val tyroleanPizzaPrice: Double
){
    var neapolitanPizzaCount = 0
    var romanPizzaCount = 0
    var sicilianPizzaCount = 0
    var tyroleanPizzaCount = 0
    var checkPhotoCount = 0
    var drinkCount = 0
    var souseCarryCount = 0
    var souseKisloCount = 0

    abstract fun neapolitanPizzaSale()
    abstract fun romanPizzaSale()
    abstract fun sicilianPizzaSale()
    abstract fun tyroleanPizzaSale()

    fun showStatistics(city: String){
        var revenue = 0

        println("Продано сицилийской пиццы: $sicilianPizzaCount")
        println("Продано неаполитанской пиццы: $neapolitanPizzaCount")
        println("Продано сримской пиццы: $romanPizzaCount")
        println("Продано тирольской пиццы: $tyroleanPizzaCount")
        when(city){

            "Moscow"-> {

                println("Показано чеков: $checkPhotoCount")
                println("Сумма скидок: ${checkPhotoCount * 50} ")
                println("Процентное соотношение сколько людей показывают фотографию чека, а сколько – нет: " +
                        String.format("%.3f",checkPhotoCount.toDouble()/(sicilianPizzaCount+neapolitanPizzaCount+
                                romanPizzaCount+tyroleanPizzaCount).toDouble())
                )
                revenue -= checkPhotoCount * 50
            }
            "Peter"-> {
                println("Продано кофе: $drinkCount")
                println("Выручка за кофе: ${drinkCount * 200} ")
                println("Процентное соотношение сколько людей берут кофе, а сколько – нет: " +
                        String.format("%.3f",drinkCount.toDouble()/(sicilianPizzaCount+neapolitanPizzaCount+
                                romanPizzaCount+tyroleanPizzaCount).toDouble())
                )
                revenue = drinkCount * 200
            }
            "Vologda"->{
                println("Показано чеков: $checkPhotoCount")
                println("Сумма скидок: ${checkPhotoCount * 50} ")
                println("Продано кисло-сладкого соуса: $souseKisloCount")
                println("Выручка за кисло-сладкий соус: ${souseKisloCount * 60} ")
                println("Продано соуса Карри: $souseCarryCount")
                println("Выручка за соус Карри: ${souseCarryCount * 40} ")
                println("Продано кофе: $drinkCount")
                println("Выручка за кофе: ${drinkCount * 200} ")
                println("Процентное соотношение сколько людей показывают фотографию чека, а сколько – нет: " +
                        String.format("%.3f",checkPhotoCount.toDouble()/(sicilianPizzaCount+neapolitanPizzaCount+
                                romanPizzaCount+tyroleanPizzaCount).toDouble())
                )
                println("Процентное соотношение сколько людей берут кофе, а сколько – нет: " +
                        String.format("%.3f",drinkCount.toDouble()/(sicilianPizzaCount+neapolitanPizzaCount+
                                romanPizzaCount+tyroleanPizzaCount).toDouble())
                )
                revenue = souseCarryCount * 40 + souseKisloCount * 60 + drinkCount * 200 -checkPhotoCount * 50

            }
        }

        val money = neapolitanPizzaCount * neapolitanPizzaPrice + romanPizzaCount * romanPizzaPrice +
                sicilianPizzaCount * sicilianPizzaPrice +  tyroleanPizzaCount * tyroleanPizzaPrice + revenue
        println("Всего заработано денег: $money")
    }


    }
