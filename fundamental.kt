fun main() {
    println("hello world")
    number()
    char()
    string()
    stringforloop()
    literalstring()
    stringunicode()
    rawstring()
    stringtemplate()
    ifexpresi()
    ifelse()
    ifelse2()
    elseif()
    booleanand()
    tipedatanumber()
    konversiNumber()
    array()
    nullable()
    setUser("adrian" , 18)
    printUser("Adrian" , 18 , "Garut")
    namedArgument()
    maindefault()
    varag()
}

// type number
fun number() {
    val valueA: Int = 30
    val valueB = 10
    println(valueA + valueB)
}

// char
fun char() {
    val vocal = 'A'
    println("value " + vocal)
}

// string
//mrnggunakan indexing
fun string() {
    val text = "adrian"
    val firstChar = text[3]
    println("huruf index ke 3 dari $text adalah $firstChar")
}

// menggunankan for loop
fun stringforloop() {
    val text = "adrian"
    for (char in text){
        println("$char ")
    }
}
// escaped string
// literal  string
fun literalstring() {
    val statements = "kotlin is Awesome "
    val statement = "kotlin is "
    println(statements + statement)
}

// mennggunakan unicode
fun stringunicode() {
    val name = "unicode test: \u00A9"
    println(name)
}

// raw string
fun rawstring() {
    val line = """
        Line 1
        Line 2
        Line 3
        LIne 4
    """.trimIndent()

    println(line)
}

// string template
fun stringtemplate() {
    val name = "KOTLIN"
    println("ini adalah bahasa pemrograman " + name)

    val nami = "Adrian"
    println("MY NAME IS $nami ")

    val nama = "Adrian"
    val umur = 18
    println("Hallo nama saya $nama , saya berumur $umur tahun")

    val hour = 7
    println("Office ${if (hour > 7) "allready close" else "is open"}")
}

// if expresions
fun ifexpresi() {
    val openhours = 7
    val now = 20
    if (now > openhours){
        println("office already open")
    }
}

fun ifelse(){
    val openHours = 7
    val now = 20
    val office: String
    if (now > openHours) {
        office = "Office alreadt open"
    }
    else {
        office = "Office is Closed"
    }

    println(office)
}

fun ifelse2() {
    val openHours = 7
    val now = 20
    val office: String
    office = if (now > openHours) {
        "office already open"
    } else {
        "office is closed"
    }

    println(office)
}

fun elseif() {
    val openHours = 7
    val now =7
    val office = if (now > 7) {
        "office Already Open"
    } else if (now == openHours){
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }

    println(office)
}

// boolean
// mengunakan and &&

fun booleanand(){
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = if (now >= officeOpen && now >= officeClosed){
        true
    } else {
        false
    }

    println("Office is open : $isOpen")

    val isClose = now < officeOpen || now > officeClosed

    print("Office is closed : $isClose")

    if (!isOpen) {
        print("Office is closed")
    } else {
        print("Office is open")
    }
}

fun tipedatanumber() {
    // tipe data number int = 32 bit
    val IntNumber = 200

    // tipe data number long = 64 bit
    val LongNumber = 200000000
    // atau pake huruf L
    val LongNUmberL = 3000L

    // tipe data number short = 16 bit
    val shortNumber: Short = 10

    // tipe data number byte = 8 bit
    val byteNumber = 0b11010010

    // tipe data number Double = 64 bit
    val doubleNumber: Double = 1.3

    // tipe data number float = 32 float
    val floatNumber: Float = 0.123456789f    // yang terbaca hanya 0.1234567

    println("""
        tipe Number int = $IntNumber
        tipe number Long = $LongNumber
        tipe Number long L = $LongNUmberL
        Tipe NUmber Short = $shortNumber
        Tipe Number byte = $byteNumber
        Tipe number double = $doubleNumber
        Tipe number float = $floatNumber
        
    """.trimIndent())

}

fun konversiNumber() {
    // dengan menggunakan to...tipe contoh
    val byteNumber: Byte = 10
    val intNumber: Int = byteNumber.toInt() // ready to go

    println(intNumber)
    // kita juga bisa menggunakan
    // toByte(): Byte
    // toShort(): Short
    // toInt(): Int
    // toLong(): Long
    // toFloat(): Float
    // toDouble(): Double
    // toChar(): Char
}

fun array() {
    // menggunkan arrayOf
    val array = arrayOf(1, 3, 5, 7)
    val mixArray = arrayOf(1, 3, 5, 7 , "Dicoding" , true)

    println(array[2])
    println(mixArray[4])
}

fun nullable() {
    // menggunakan if
    var string: String? = "Dicoding"
    if(string != null) { // smart cast
        println(string.length) // It works now!
    }

    // menggunkaan is atau  !is
    var obj: Any = "Dicoding"

    if(obj is String) {
        // Tidak membutuhkan casting secara eksplisit.
        println("String length is ${obj.length}")
    }
}

fun safecalls() {
    // safe calls operator {?}
    val text: String? = null
    text?.length

    // elvis
    val textLength = if (text != null) text.length else 7

    // non_null
    val text3: String? = null
    val textLength2 = text3!!.length // ready to go ???
}

fun setUser(name: String, age: Int): String {
    return "Your name is $name, and you $age years old"
}

fun printUser(name: String , age: Int , live: String): Unit {
    println("Your name is $name")
    println("Age = $age")
    println("tinggal = $live")
}

// named argument

fun namedArgument() {
    val fullName = getFullName(first = "Adrian" , middle = " Nugraha ", last = "Tanjung")
    println(fullName)
}

fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}

// default argument

fun getFullNamee(
    first: String = "Adrian",
    middle: String = " is ",
    last: String = "Handsome"): String {
    return "$first $middle $last"
}

fun maindefault() {
    val fullName = getFullNamee()
    println(fullName)
}

// variabel argument
fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}

fun varag() {
    val number = sumNumbers(10, 20, 30, 40)
    print(number)
}




