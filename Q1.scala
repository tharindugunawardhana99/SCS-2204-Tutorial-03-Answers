object area{

    def calcArea(radius: Double) = {
        var a =  math.Pi * radius * radius //calculating area of a disk
        printf("Area of the disk with radius %.2f is %.2f",radius,a )
    }
    
    def main(args:Array[String]):Unit = {
        calcArea(5.0)
    }

}