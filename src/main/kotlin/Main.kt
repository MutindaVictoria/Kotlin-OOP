fun main( ) {

var shapes=Rectangle(20,15)
 println( shapes.getArea())
  println  (shapes.length)
    println(shapes.width)
var useraccount=BankAccount("2345678","Rosa Waeni",1000000.0)
    println(useraccount.accountNumber)
    println(useraccount.accountHolderName)
    println (useraccount.balance)
    println(useraccount.deposit(200000.0))
    println(useraccount.withdraw(10000.0))

    var cat=Animal.Cat()
    var dog=Animal.Dog()
    cat.makesound()
    dog.makesound()
    val rect=Rectangles(35.0,29.0)
    println(rect.getArea())
    val circ=Circle(14.0)
    println(circ.getArea())
    val book=Book("Alchemist","Paul cahaelo",1300.00)
    println(book.title)
    println(book.author)
    println(book.price)


    val lists = listOf(
        Book("Emotional intelligence","Phoebe culmnigram",1200.0),
        Book("Power of now","Alex Beckham",1500.0),
        Book("Vessel of power","Joston graham",2000.0)
    )

    val bookPrice=lists.map {  Book(it.title,it.author,it.price *1.1)}
    bookPrice.forEach{ println("title :${it.title}, author:${it.author},price:${it.price}")}
}
//Create a class called "Rectangle" with properties length and width.
// Add a method to the class called "getArea()" that returns the area of the rectangle.
// Create an object of the class and call the "getArea()" method

// i create class
class Rectangle(var length:Int,var width:Int) {
    //// ii Add a method to the class called "getArea()" that returns the area of the rectangle.
    fun getArea(): Int {
        var area = length * width
        return area
    }
}
//Create a class called "BankAccount"
// with properties accountNumber, accountHolderName, and balance.
// Add methods to the class to deposit and withdraw money.
// Create an object of the class and perform some deposit and withdrawal operations.

//i create a class
class BankAccount(var accountNumber:String,var accountHolderName:String,var balance:Double){
 // ii Add methods to the class to deposit and withdraw money.
    fun deposit(depositAmount:Double):Double{
        return balance+depositAmount
    }
    fun withdraw(withdrawcash:Double):Double{
        return balance-withdrawcash
    }

}
//Define an abstract class called "Animal" with a method called "makeSound()".
// Create two subclasses of the class called "Cat" and "Dog".
// Override the "makeSound()" method in each subclass to make a different sound.
// Create objects of the two subclasses and call their "makeSound()" methods.

//(i)Define an abstract class called "Animal" with a method called "makeSound()".
open  class Animal(){
    open fun makesound() {

    }
    //ii // Create two subclasses of the class called "Cat" and "Dog".
    class Cat(): Animal(){
        override fun makesound(){
        println("meoow")
        }
    }
    class Dog():Animal(){
        override fun makesound() {
           println ("Whooowo")
        }
    }

}
//Define an interface called "Shape" with a method called "getArea()".
// Create two classes called "Rectangle" and "Circle" that implement the "Shape" interface.
// Implement the "getArea()" method in each class to calculate the area of the rectangle and circle.
// Create objects of the two classes and call their "getArea()" methods.

// i
interface Shape{
    fun getArea():Double

}
//ii,ii
class Rectangles(private var widths:Double, private var length: Double):Shape{
    override fun getArea(): Double {
        return widths*length
    }
}
//ii,iii
class Circle(private var radius:Double):Shape{
    override fun getArea(): Double {
        return Math.PI*radius*radius
    }
}

//Define a data class called "Book" with properties title, author, and price.
// Create an object of the class and print its properties.
//Create a list of objects of the "Book" class.
// Use the map function to create a new list of objects with the prices increased by 10%.
data class Book(var title:String,var author:String,var price:Double)



