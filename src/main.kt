fun main() {
name()
    state()
    var number=numbers(90,67,78,98)
    println(number.contentToString())
    var mixnumber = mixnumbers(34, 90.88, 87.87, 78)
    println(mixnumber.contentToString())
    var vowels=vowel('u', 'i' ,'e' , 'a')
    println(vowels.count())

}
fun name(){
    var name="Establishment"
    var names=(name[5].toString()+name[6]+name[7])
    println(names)
}
fun state(){
    var states=arrayOf("Mary" , "Jane" , "Susan" , "Mellisa")
    var me=states.set(3, "True")
    println(states.contentToString())
}
fun numbers(num1:Int , num2:Int, num3:Int , num4:Int): Array<Int> {
    var number=arrayOf(num1*num2*num3*num4)
    return (number)
}
fun mixnumbers(a:Int, b: Double, c:Double , d:Int): Array<Double> {
    var mixnumber=arrayOf(a+b+c+d)
    return mixnumber
}
fun vowel(k:Char, l:Char, o:Char , p:Char): Array<Char> {
    var vowels=arrayOf(k,l,o,p)
    return vowels




}