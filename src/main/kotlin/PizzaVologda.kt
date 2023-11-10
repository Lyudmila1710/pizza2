class PizzaVologda (
    neapolitanPizzaPrice: Double, romanPizzaPrice: Double,
    sicilianPizzaPrice: Double, tyroleanPizzaPrice: Double
) : PizzaCity(
    neapolitanPizzaPrice, romanPizzaPrice,
    sicilianPizzaPrice, tyroleanPizzaPrice
), Drink, CheckPhoto, Souse{
    override fun SouseSale() {
        print("Какой добавите соус?\n1.Карри\n2. Кисло-сладкий\n")
       if(readln()== "1") {
           souseCarryCount++
           print("Стоимость соуса - 40 рублей")}
        if(readln() =="2"){
            souseKisloCount++
            print("Стоимость соуса - 60 рублей")
        }
    }
    override fun drinkSale() {
        println("Вы будете кофе?")
        println("1. Да\n2. Нет")
        if (readln() == "1"){
            drinkCount++
            println("С вас 200 рублей")}
    }

    override fun showCheckPhoto() {
        println("У вас есть фотография чека?")
        println("1. Да\n2. Нет")
        if (readln()=="1") {
            checkPhotoCount++
            println("Вам будет скидка 50 рублей с покупки")
        }
    }
    override fun neapolitanPizzaSale() {
        neapolitanPizzaCount++
        println("Спасибо за покупку неаполитанской пиццы в ")
    }


    override fun romanPizzaSale() {
        romanPizzaCount++
        println("Спасибо за покупку римской пиццы в ")
    }

    override fun sicilianPizzaSale() {
        sicilianPizzaCount++
        println("Спасибо за покупку сицилийской пиццы в ")
    }

    override fun tyroleanPizzaSale() {
        tyroleanPizzaCount++
        println("Спасибо за покупку тирольской пиццы в ")
    }
}