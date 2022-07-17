object Time{

    def easyPace(d1: Double): Double = {
        return d1 * 8 //8 min per km
        
    }
    def tempo(d2: Double): Double = {
        return d2 * 7 //7 min per km
    }
    
    def main(args:Array[String]):Unit = {
        var totalTime = easyPace(2.0) + tempo(3.0) + easyPace(2.0)
        println("Total Running Time is " + totalTime + " minutes")
    }

}