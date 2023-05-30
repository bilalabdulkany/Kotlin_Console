import example.AddressBook
import example.Person
import example.PersonKt.phoneNumber
import example.addressBook
import example.person
import kotlin.io.path.Path
import kotlin.io.path.exists
import kotlin.io.path.inputStream
import kotlin.system.exitProcess

fun promptPerson(): Person = person {

    print("Enter person ID:")
    id = readln().toInt()

    print("Enter person Name:")
    name = readLine().toString()

    print("Enter email address")
    email = readln()
    if(email.isNotEmpty()){
        this.email = email
    }

    while(true){
        print("Enter a phone number")
        val number = readln()
        if (number.isEmpty()) break;

        print("Is this a  mobile number or  work phone?")
        val type = when(readln()){
            "mobile" -> Person.PhoneType.MOBILE
            "home" -> Person.PhoneType.HOME
            "work" -> Person.PhoneType.WORK
            else -> {
                println("Unknown mobile type")
                Person.PhoneType.UNRECOGNIZED
            }
        }
        phones += phoneNumber {
            this.number = number
            this.type = type
        }

    }

}

fun main(args: Array<String>) {

    if(args.size !=1 ) {
        println("Usage: add_person ADDRESS_BOOK_FILE" )
        exitProcess(-1)
    }
    val path = Path(args.single())
    val initialAddressBook = if(!path.exists()){
        println("File not found")
        addressBook {  }
    }else {
        path.inputStream().use {
            AddressBook.newBuilder().mergeFrom(it).build()
        }
    }

    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}