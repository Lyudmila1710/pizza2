class PizzaVologda (
    neapolitanPizzaPrice: Double, romanPizzaPrice: Double,
    sicilianPizzaPrice: Double, tyroleanPizzaPrice: Double
) : PizzaCity(
    neapolitanPizzaPrice, romanPizzaPrice,
    sicilianPizzaPrice, tyroleanPizzaPrice
), CheckPhoto, Souse{
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

    override fun showCheckPhoto() {
        println("У вас есть фотография чека?")
        println("1. Да\n2. Нет")
        if (readln()=="1") {
            checkPhotoCount++
            println("Вам будет скидка 50 рублей с покупки")
        }
    }
    override fun neapolitanPizzaSale() {
        println("Вы будете кофе?")
        println("1. Да\n2. Нет")
        if (readln() == "1"){
            cofeeneapol++
            println("С вас 200 рублей")}
        neapolitanPizzaCount++
        println("Спасибо за покупку неаполитанской пиццы в ")
    }


    override fun romanPizzaSale() {
        println("Вы будете кофе?")
        println("1. Да\n2. Нет")
        if (readln() == "1"){
            cofeeroman++
            println("С вас 200 рублей")}
        romanPizzaCount++
        println("Спасибо за покупку римской пиццы в ")
    }

    override fun sicilianPizzaSale() {
        println("Вы будете кофе?")
        println("1. Да\n2. Нет")
        if (readln() == "1"){
            cofeesicili++
            println("С вас 200 рублей")}
        sicilianPizzaCount++
        println("Спасибо за покупку сицилийской пиццы в ")
    }

    override fun tyroleanPizzaSale() {
        println("Вы будете кофе?")
        println("1. Да\n2. Нет")
        if (readln() == "1"){
            cofeetyrolean++
            println("С вас 200 рублей")}
        tyroleanPizzaCount++
        println("Спасибо за покупку тирольской пиццы в ")
    }
}