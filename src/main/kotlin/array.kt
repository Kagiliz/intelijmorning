fun main(args: Array<String>) {
    var myarr= arrayOf("Shiku","Mungai","Robert","Andrew",98,false,'e')
    myarr[2]="Mwendwa"
    var myarr2= arrayOf(3,6,9,2,5,65,95)
    println("My name is : "+myarr[1])
    println("The size of my array is : "+myarr2.size)
    println("My sorted array is : "+myarr2.sorted())
    println("My sorted array is : "+myarr.sort())

}