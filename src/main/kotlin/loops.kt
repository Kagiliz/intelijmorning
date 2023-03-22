fun main(args: Array<String>) {
    //for loop
    //write a kotlin program that uses a forloop to
    //print out even numbers between 1 and 10
     val myarray= arrayOf("Mwaura","Purity","Regina")
    for (jina in myarray){
        println(jina)
    }
    //while loop
    val nambari : Int=5
    while (nambari<=10) {
        println("Loop $nambari")
        nambari += 2
    }

    val nambari : Int=35
    while (nambari>5){
        println("Loop $nambari")
        nambari -+ 2
    }
    //do..while loops
    val numloop=100
    do{
        println("loop $numloop")
        numloop+=2
    }while (numloop<=105)
}