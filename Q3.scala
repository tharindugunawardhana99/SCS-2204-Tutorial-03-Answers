object volume{

    def calcVolume(radius: Double) = {
        var v =  (math.Pi * 4 / 3) * radius * radius * radius // calculating volume of a sphere
        printf("Volume of the Sphere with radius %.2f is %.2f",radius,v )
    }
    
    def main(args:Array[String]):Unit = {
        calcVolume(5.0)
    }

}