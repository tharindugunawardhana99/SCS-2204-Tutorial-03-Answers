object temp{

    def calcTemp(celsius: Double)={
        var t = (celsius * 1.8) + 32.0 //cinvert celsius to fahrenheit
        println(s"Fahrenheit value of Celsius $celsius is $t")

    }

    def main(args:Array[String]): Unit = {
        calcTemp(35.0)
    }

}