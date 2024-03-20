fun main(){
    var num1 = 50
    var num2 = 30
    var sum = num1 + num2
    print(sum)


    var num3 = 45
    var num4 = 21
    var difference = num3 - num4
    print(difference)

    var num5 = 650
    var num6 = 11
    var product = num5 * num6
    println(product)

    var num7 = 1950
    var num8 = 32
    var result = num7 / num8
    println(result)

    var num9 = 240
    var num10 = 45
    var remainder = num1 % num2
    println(remainder)

   var age = 19
    ++age
    println(age)

    var weight = 52
    --weight
    println(weight)

    val a = 325
    val b = 432
    println(a<b)

    val c = 325
    val d = 432
    println(c>d)


    val e = 325
    val f = 432
    println(e!=f)

    val g = 32
    val h = 45
    var adding = g + h
    println(adding)

//    subtract(31,73)
    fullNames("Caren","kosgey")
    val x = "My name is"
    val name = "Mary"
    println(x+ " " + name)


    val text = "Banana"
    println(text[0])
    println(text[1])
    println(text[2])
    println(text[3])
    println(text[4])
    println(text[5])

    val namme = "Janet"
    val year = "1965"

    val sentense = "$name was born in $year"
    println(sentense)


    val message = "PASGXSGYUGY78"
    val message2 = "HJHSHJGGUI"
    if (message.equals(message2)) {
        println(true)
    }
        else{
            println(false)
        }

    val X = "african investor"
    println(X.uppercase())
    println(X.lowercase())

//    var D = 20
//    var E = 11
//     var divide = var D % var E
//     println(divide)

val maName = " Emma Museveni "
    println(maName.trimStart())
    println(maName.trimEnd())
    println(maName.trim())

val location = "Eldoret"
    println(location.startsWith("E"))
    println(location.endsWith("f"))
//
//    val teext = "Caren went to church. "
//    + "She is Kenyan"
//    println(text.replace("Ugandan","African"))

    val word = "eagle, falcon, hawk, owl"
    val birds = word.split(",")
    println(birds)
    println(birds[1])

    val weightt = 54.5
    println("My weight is"+  weightt.toString())

    //Kotlin Arrays

    var numArray = arrayOf(10, 20, 30, 40, 50, 60)
    println(numArray[0])
    println(numArray[1])
    println(numArray[2])

    var numArray2 = numArray.plus(70)
    print(numArray2[6])

    var index = numArray2.indexOf(40)
    println (index)

//    var numArray = numArray.minOrNull()

   schoolName("Akirachix")
myDetails("Caren",21)
    myNames("Caren")
    thatsMe("Caren")
    studentRecords("Caren",21,"0789894949",34.5,"Kenyan")

    var numbers:Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9)
    var summ =0
    numbers.forEach{x:Int ->
    if (x % 2==0){
        summ+=x
    }
}
 println(summ)
//fun subtract (num1: Int, num2:Int):Int{
//    var difference =
//    return(difference)




}
fun fullNames(name1:String,name2:String):String{
    var names = name1 + name2
    return(names)
    print(names)

}
fun schoolName (name:String){
    var word = "Akirachix"
    var a=word[0]
    var b=word[3]
    var c=word[4]
    var add = "$a$b$c"
    println(add)
}
fun myDetails(name:String,age:Int){
    var name = "Caren"
    var age = 21
    var sentence = "Hi, my name is $name and I am $age years old"
    println(sentence)
}
fun myNames(name:String):Int{
    var name = "Caren"
    var result = name.length
    println(result)
    return (result)
}
fun thatsMe(name:String){
    var name = "Caren"
    if (name == "Caren"){
        println("That's me!")
    } else {
        println("I dont know who that is")
    }
}
fun studentRecords(name:String,age:Int,number:String,weight:Double,citizen:String){
    println(name)
    println(age)
    println(number)
    println(weight)
    println(citizen)
}
fun isEven(num:Int){
    var result:Boolean= num%2==0
    println(result)
}

