fun main(args: Array<String>) {
    var num=6
    //if statement
    //if..else statement
    //if..elseif..statement
    if (num<12){
        println("its true")

        var r=14
        var x=13

        println(r+x)
    }
    //if..else statement
    else{
        println("Its false")
    }
    //if..elseif..statement
    if (num>0) {
        println("The number is negative")
    }else if (num >0 && num<10){
        println("This is a single digit number")
    }
    else if(num>=10 && num<100){
        println("This a double digit number")
    }
    else
        println("It has three or more digits")
}