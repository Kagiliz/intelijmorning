class Hesabu{
    //data member/
    private var number:Int=8

    //member function
    fun calculateSquare():Int{
        return number*number
    }
}
class elizabeth{
    var name="eMobilis"
    fun myname(){
        println(name)
    }
}
class regina{
    var names="orange"
    fun myname(){
        println(names)
    }
}
class car{
    var name="mercedes benz"
    fun myname(){
        println(name)
    }
}
fun main(args: Array<String>) {
    //create an object
    val myobj=Hesabu()
    println(myobj.calculateSquare())
    val myobj2=elizabeth()
    println(myobj2.myname())
    val myobj3=regina()
    println(myobj3.myname())
    val myobj4=car()
    println(myobj4.myname())


}