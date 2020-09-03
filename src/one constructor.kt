import java.lang.Integer.sum

fun main()
{

  val sum= Sum(10,2)

    println("Add the two numbers = ${sum.add()} ")
}

class Sum constructor(number1:Int , number2:Int){
   var Summation=0; var num=0; var num2=0;

    init {   if(number1>=0 && number2>=0)   {  num =number1;   num2=number2;add(); }
             else { println("The number is not positive")}
    }
   public fun add():Int{
        Summation=num+num2;
       return Summation;
    }




}