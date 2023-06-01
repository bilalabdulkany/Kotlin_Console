import example.*
import example.PersonKt.phoneNumber
import kotlin.io.path.Path
import kotlin.io.path.exists
import kotlin.io.path.inputStream
import kotlin.io.path.outputStream
import kotlin.system.exitProcess

fun promptPerson(): Person = person {
    print("Enter person ID: ")
    id = readln().toInt()

    print("Enter name: ")
    name = readln().toString()

    print("Enter email address (blank for none): ")
    val email = readln()
    if (email.isNotEmpty()) {
        this.email = email
    }

    while (true) {
        print("Enter a phone number (or leave blank to finish): ")
        val number = readln()
        if (number.isEmpty()) break

        print("Is this a mobile, home, or work phone? ")
        val type = when (readLine()) {
            "mobile" -> Person.PhoneType.MOBILE
            "home" -> Person.PhoneType.HOME
            "work" -> Person.PhoneType.WORK
            else -> {
                println("Unknown phone type.  Using home.")
                Person.PhoneType.HOME
            }
        }
        phones += phoneNumber {
            this.number = number
            this.type = type
        }
    }
}

// Reads the entire address book from a file, adds one person based
// on user input, then writes it back out to the same file.
fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Usage: add_person ADDRESS_BOOK_FILE")
        exitProcess(-1)
    }
    val path = Path(args.single())
    val initialAddressBook = if (!path.exists()) {
        println("File not found. Creating new file.")
        addressBook {}
    } else {
        path.inputStream().use {
            AddressBook.newBuilder().mergeFrom(it).build()
        }
    }
    path.outputStream().use {
        initialAddressBook.copy { people += promptPerson() }.writeTo(it)
    }
}