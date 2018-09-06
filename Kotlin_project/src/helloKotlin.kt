import kotlin.math.sqrt
import kotlin.properties.Delegates

fun main(args :Array<String>) {

    /*val name = "John"
    val n1 =10
    val n2 = 23
    val result = "n1*n2=${n1*n2}"
    val greeting = "Hello $name"
    print(greeting)
    print(result)
    println()

    val coordinates = Pair(3,5)
    //val (x,y) = coordinates
    //println(x)
    //println(y)

    println()

    val coordinates3D = Triple(3,4,5)

    val (x,y,_)= coordinates3D

    println(x)
    println(y)

    val age = 14


    if (age < 18 || name == "John"){
        print("you are less than 18")
    } else if(age > 65){
        print("you are more than 65 years old")
    } else {
        print("you are greater or equal to 18")
    }

    var choice :String = " "

    while (choice != "q"){
        print("Enter your choice or press q to exit: ")
        choice = readLine().orEmpty()
        println(choice)
    }

    println("you select q as your choice!")

    val number = 7

    if (number % 3 == 0 && number % 5 == 0){
        print("FizzBuzz")
    } else if (number % 5 == 0){
        print("Buzz")
    } else if (number % 3 == 0){
        print("Fizz")
    } else print(0)

    val closedRange = 0..5

    for(index in closedRange){
        println(index)
    }
    val halfOpenrange = 0 until 5

    val decreasingRange = 5 downTo 0

    for(index in decreasingRange){
        println(index)
    }

    for(index in  10 downTo 0 step 2){
        println(index)
    }

    val age = 19

    val agegroup = when(age){
        in 0..2 -> "infant"
        in 3..12 -> "child"
        in 13..19 -> "teen"
        else -> "Unknown"
    }
    println(agegroup)

    val input = 6
    var factorial = 1
    for(index in 1..input){
        factorial *= index
    }
    print(factorial)

    val number = 15

    val rsult = when {
        number % 3 == 0 && number % 5 == 0 -> "Fizz Buzz"
        number % 3 == 0 -> "Fizz"
        number % 5 == 0 -> "Buzz"
        else -> "Not a shit"
    }
    print(rsult)

    greet("Mary",30)
    val result = add(4,7)
    println(result)
}

fun greet(name :String, age :Int){
    //name = "Alex"
    println("Hello, $name. My age is $age")
}

fun add(a :Int,b :Int) :Int{
    return a+b
}

fun greet( age :String, name :String) :String{
    return "Hello $name and your age is $age"
    var addFunction =::add
    val result = addFunction(4,5)
    displayResult(addFunction,4,5)
}

fun displayResult(function : (Int,Int)->Int,a :Int,b :Int){
    var result = function(a,b)
    print(result)
}

fun add(a :Int, b :Int) :Int{
    return a+b

    println(isPrime(1231432343))
}

fun isPrime(number: Int) :Boolean{

    var result = true

    for (index in 2..number/2){
        if(number % index == 0){
            result = false
            break
        }
    }
    return result
    println(EvenOrOdd(33))

}

fun EvenOrOdd(number :Int) :String{
    if (number % 2 == 0) {
        return "Even"
    } else{
        return "Odd"
    }

    //var customerId :Int?

    var age :Int?

    age = 10

    var name :String?

    //println(age)

    val parsedInt = "10".toIntOrNull()

    print(parsedInt)

    var age :Int? = null

    age = age!! + 1

    println(age)

    var age :Int? = null

    if (age != null){
        age += 1
    } else{
        println("Age is null")
    }

    println(age)

    var middleName :String? = "John"

    if(middleName != null){
        print(middleName.length)
    }

    println(middleName?.length)

    //let

    middleName?.let{
        var len = it.length
        println(it)
    }

    var age :Int? = null

    val result = age ?: 0

    println(result)

    println(divideIfWhole(10,3))

}

fun divideIfWhole(value :Int, divisor :Int) :Int?{
    val quotient = value / divisor
    val remainder = value % divisor

    return if(remainder == 0) quotient else null

    val numbers = arrayOf(3,4,5.7,6,7,8,"alex",null)

    for (index in 0 until numbers.size){
        println(numbers[index])
    }

    val names = Array(5,{"John Doe"})

    println(names)

    val evenNumbers = intArrayOf(2,4,6,8)

     val names = listOf("alex","mary","steve")

    val members = mutableListOf<String>()

    members.add("John")
    members.add("Mary")
    members.add("steve")

    println(members.contains("Mary")) // true

    members.first() // John
    members.last() // Steve
    members[1] // Mary
    members.slice(0..1) // John and mary

    if(members.isEmpty()){
        println("Members List is empty")
    }else{
        println("List is not empty")
    }
    val names = listOf<String>("Mary","Alex","John","Steve")
    println(contains1("Ma",names))
    print(contains2("Mry",names))
}

fun contains2(nameToSearch: String, names: List<String>) :Boolean{
    return nameToSearch in names
}

fun contains1(nameToSearch :String, names :List<String>) :Boolean {

    var found = false

    for (index in 0 until names.size){
        if (names[index] == nameToSearch){
            found = true
            break
        }
    }

    return found

    var numbers = mutableListOf(3,12,3,4,1,156,7)
    // need sort
    sort(numbers)
    println(numbers)

}

fun sort(numbers :MutableList<Int>){
    for(i in 0 until numbers.size){
        for (j in i+1 until numbers.size){
            if(numbers[i] < numbers[j]){
                //swap numbers
                val temp = numbers[i]
                numbers[i] = numbers[j]
                numbers[j] = temp
            }
        }
    }

    var airports = mutableMapOf("IAH" to "George Bush","SFO" to "San francisco","seatac" to "seattle airport")

    airports["SIA"] = "sdfsdf"

    airports.remove("SIA")

    for((airportCode,airportName) in airports){
        println("$airportCode - $airportName")
    }

    for(key in airports.keys){
        println("$key")
    }
    println(airports)

    val names = setOf("Alex","John","Mary")

    val numbers = arrayOf(1,2,3,4,5,6,7)

    var numbersSet = mutableSetOf(*numbers)

    println(numbersSet)

    numbersSet.contains(5)

    println(5 in numbersSet) // true

    numbersSet.add(10)

    numbersSet.remove(5)

    val numbers = arrayOf(1,2,3,4,5,1,2,3,4,5,6,1,2,3,4,5)

    val set = setOf(*numbers)

    val dublicatFreenumbers = set.toIntArray()

    for(index in 0 until dublicatFreenumbers.size){
        println(dublicatFreenumbers[index])
    }

    val addLambda :(Int,Int) -> Int

    addLambda = {a :Int, b:Int -> Int
        a+b
    }

    val result = addLambda(4,5)

    println(result)

    val squareLambda :(Int) -> Int = {it * it}

    println(squareLambda(5))

    printResult(3,5,addLambda)

    val numbers = arrayOf(4,56,7,34,2)

    val largerThan5Numbers = numbers.filter { it > 5 }

    println(largerThan5Numbers)

}

fun printResult(a :Int, b :Int, operation :(Int,Int) -> Int){
    println(operation(a,b))
    var counter = 0

    val incrementCounter = {
        counter +=1
    }

    incrementCounter()
    incrementCounter()

    println(counter)

    val counter1 = countingLambda()

    val counter2 = countingLambda()

    println("counter1")
    println(counter1())
    println(counter1())

    println("counter2")
    println(counter2())
    println(counter2())


}

fun countingLambda(): () -> Int {

    var counter = 0
    val incrementCounter :() -> Int = {
        counter += 1
        counter
    }
    return incrementCounter
    val customer1 = Customer("John", "Doe")
    println(customer1.fullName)

    var customer2 = customer1

    var customer3 = Customer("Mary","Doe")

    customer2 = customer3

    println(customer2 === customer1)

}

class Customer(var firstName :String, var lastName :String){
    val fullName
        get() = "$firstName $lastName"
}
    val coordinate1 = Coordinate(95.5,35.5)

    val coordinate2 = Coordinate(95.5,35.5)

    if(coordinate1 == coordinate2){
        print("Same Coordinates")
    } else {
        print("Different Coordinates")
    }
}

data class Coordinate(var latitude: Double, var longtitude: Double) {

    val walmart = ShoppingList("Walmart")
    //walmart.groceryItems.add(GroceryItem("Milk",2))
    //walmart.groceryItems.add(GroceryItem("Milk",6))

    walmart.addGroceryItem(GroceryItem("Milk",2))
    walmart.addGroceryItem(GroceryItem("Milk",12))

    println(walmart.getGroceryItems().size)
}

class GroceryItem(var name:String, var quantity: Int){

}

class ShoppingList(var name:String){
    private var groceryItems = mutableListOf<GroceryItem>()

    fun getGroceryItems():List<GroceryItem>{
        return this.groceryItems
    }


    fun addGroceryItem(groceryItem: GroceryItem){
        val gi = this.groceryItems.find{
            it.name == groceryItem.name
        }

        if(gi == null){
            this.groceryItems.add(groceryItem)
        }
    }

    val customer = Customer("John","Doe")

    CustomerRepository. addCustomer(customer)


}

data class Customer(var firstName :String, var lastName :String){

}

object CustomerRepository {

    val allCustomers = mutableListOf<Customer>()

    fun addCustomer(customer :Customer){
        allCustomers.add(customer)
    }

    val user1 = User.newUser("John","Doe")
    val user2 = User.newUser("Mary","Doe")

    println(User.numberOfUsers)
}

class User private constructor(var firstName :String, var lastName :String){

    companion object Factory {

        var numberOfUsers :Int = 0

        fun newUser(firstName: String,lastName: String) :User{

            numberOfUsers +=1
            return User(firstName,lastName)
        }
    }

    println(URLs.allCustomers)
    println(URLs.addCustomers)


}

object URLs {

    val allCustomers = "http://mywebsite.com/customers"
    val addCustomers = "http://mywebsite.com/add"

    val square = Square(25.0)

    println(square.area)

    square.area = 100.0

    println(square.width)
}

class Square(var width :Double){

    var area :Double

        get(){
            return width * width
        }

        set(value){
            width = sqrt(value)
        }
    val shirt = Shirt()
    shirt.sold = true

    println(Shirt.totalSold)

    val shirt2 = Shirt()
    shirt2.sold = true

    println(Shirt.totalSold)


}

class Shirt{

    companion object {
        var totalSold = 0
    }

    var sold :Boolean by Delegates.observable(false){
        _,old,new ->

        if(new){
            totalSold += 1
        }
    }

}

class Triangle(var sideA :Double, var sideB :Double){

    val hypotenuse :Double by lazy{

        sqrt((sideA*sideA)+(sideB*sideB))

    }

    val someString = "Something"
    // Mom // Mom
    // Cat // Tac

    println("Cat".isPalindrome)
    println("Mom".isPalindrome)

    println(32.0.fahrenheit.celsius)
}

val Double.celsius :Double
    get(){
        return (this - 32) * 5/9
    }

val Double.fahrenheit :Double
    get(){
        return (this * 9/5) + 32


    val name = "John"

    println(name.reversed())

    val car = Car("Honda","Accord")

    println(car.start())

}

class Car(var make :String, var model :String){

    fun start(){

    }

    fun changeGear(no :Int){

    }

    val sm = SimpleMath()
    sm.add(4,5)

    println(SimpleMath.factorial(5))
}

class SimpleMath{

    companion object {
        fun factorial(number :Int) :Int {

            var result = 1

            for (index in 1..number){
                result *= index
            }

            return result

        }
    }
    fun add(a :Int, b:Int) :Int{
        return a+b
    }

    val bmw = BMW("BMW","Series 3")
    bmw.start()
    bmw.isTurboOn = true
    processService(bmw)


}

fun processService(car :Car){

    if(car is BMW){
        println("Car is BMW!")
    }

    val bmw = car as? BMW
    bmw?.start()
    bmw?.isTurboOn = true
}

open class Car(var make :String, var model :String){

    open fun start(){

    }
}

class BMW(make :String, model :String) :Car(make, model) {

    var isTurboOn :Boolean = false

    override fun start() {
        println("Strating BMW!")
    }
    val bmw = BMW("BMW","Series 3")
    bmw.performService()



}

abstract class DataAccess(var connectionString :String){

    abstract fun getAllCustomers() :Array<String>
}

class SQLDataAccess(connectionString: String) :DataAccess(connectionString){
    override fun getAllCustomers(): Array<String> {

        return arrayOf("Mary","Alex")
    }
}

open class Car(var make :String, var model :String){

    open fun performService(){

        println("Do a tire check")
        println("Oil check")
        println("Break check")

    }
}

class BMW(make :String, model :String) :Car(make, model){

    override fun performService(){
        super.performService()
        println("Perform Microfilter Check!")
    }

    for( direction in Compass.values()){
        println("Index is ${direction.ordinal} and name is ${direction.name}")
    }

    val compass = Compass.North

    when(compass){
        Compass.North -> print("North")
        Compass.South -> print("South")
        Compass.West -> print("West")
        Compass.East -> print("East")

    }
    //val northWest = Compass.NorthWest

    for(device in Devices.values()){
        println("${device.name} - ${device.hasFrontFacingCamera}")
    }

    // get the current device model
    val device = Devices.current()
    print(device.name)

}

enum class Devices(var hasFrontFacingCamera : Boolean = true) {
    iPhone3G(false),
    iPhone3GS(false),
    iPhone4,
    iPhone5,
    iPhone6,
    iPhone7,
    iPhone8,
    iPhoneX;

    companion object {
        fun current() :Devices {

            val index = Devices.values().size - 1
            return Devices.values()[index]
        }
    }

}

enum class Compass {
    North,
    West,
    South,
    East

    for(day in DaysOfTheWeek.values()){
        println("$day and ${day.isWeekend}")
    }
}

enum class DaysOfTheWeek(var isWeekend :Boolean = false){

    Sunday(true),
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday(true)

    val car = Car()
    car.start()
    car.changeGear(4 )

    car.color

}

interface Vehicle {

    val color :String
        get() {
            return "White"
        }

    fun start(gear :Int = 1)
    fun changeGear(gear :Int)
}

class Car : Vehicle {
    override fun start(gear: Int){

    }

    override fun changeGear(gear: Int) {
        println("changeGear")
    }
}

interface Bird {
    fun eat()
}

interface Flyable {
    fun fly()
}

class Ostrich :Bird{
    override fun eat() {
        
    }
}

class Sparrow :Bird, Flyable {
    override fun eat() {

    }

    override fun fly() {

    }

    //val numbers = mutableListOf(3,4,5,6,"asled")

    //numbers .add("kl")

    val airports = mapOf("IAH" to "Intercontinentional", "SJO" to "qweqwerr4r", 4 to "sdfdf","sdfsdf333" to 2)

    println(airports[4])

    val names = listOf("d","sd","sdfge")
    val numbers = listOf(345,6,4,3,5345,34,5345,1)

    println(names.toBulletList())
    println(numbers.toBulletList())



}

fun List<Any>.toBulletList() :String {
    val separator = "\n - "
    return this.map{ it }.joinToString(separator,prefix = separator, postfix = "\n")

    val (a,b) = swap (10,45)
    println("a = $a and b = $b")

    val (a1, b1) = swap("Hello","Bye")
    println("a1 is $a1 and b1 is $b1")
}

fun <T,K> swap(a :T, b :K) :Pair<K,T>{
    return Pair(b,a)*/

    val numbers = mutableListOf(13,4,5,27,3,5,6)
    val names = mutableListOf("Yanni","David","Alex")
    sort(numbers)
    sort(names)
    println(names)
    println(numbers)

}

fun <T> sort(list :MutableList<T>) where T:Comparable<T> {

    for(i in 0 until list.size){
        for(j in 0 until list.size){

            if(list[i] < list[j]){

                val temp = list[i]
                list[i] = list[j]
                list[j] = temp
            }
        }
    }
}
