object book{

    def bookPrice(books: Int): Double = {
        return (books * 24.95)
    }

    def discount(price: Double): Double = {
        return (price * 0.4)
    }

    def shipping(books : Int): Double = {
        if(books <= 50){
            return 3.0
        }
        else{
            return (3.0 + (books-50) * 0.75) 
        }
    }

    def totalPrice(books : Int) = {
        var p = (bookPrice(books) + shipping(books) - discount(bookPrice(books)))
        printf(s"Total wholesale price of %d books is Rs.%.2f", books,p)
    
    }   


    def main(args:Array[String]): Unit = {
        totalPrice(60)
    }

}