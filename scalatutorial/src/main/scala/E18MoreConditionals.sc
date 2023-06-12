import com.atomicscala.AtomicTest._
//Q1
//If elements are same

//Q2
def isPalindrome(value: String): Boolean = {
  if (value.reverse == value)
    true
  else
    false
}

isPalindrome("mom") is true
isPalindrome("dad") is true
isPalindrome("street") is false

//Q3
def isPalIgnoreCase(value: String): Boolean = {
  if (value.reverse.equalsIgnoreCase(value))
    true
  else
    false
}
isPalIgnoreCase("Bob") is true
isPalIgnoreCase("DAD") is true
isPalIgnoreCase("Blob") is false

//Q4
def isPalIgnoreSpecial(str: String): Boolean = {
    var createdStr = ""
    for (c <- str) {
        // Convert to Int for comparison:
        val theValue = c.toInt
        if ( theValue>64 && theValue<123) {
            createdStr += c
        }
        else if ( theValue > 47 && theValue < 58) {
            createdStr += c
        }
    }
    //println(createdStr)
    isPalIgnoreCase(createdStr)
}

isPalIgnoreSpecial("Madam I'm adam") is true
isPalIgnoreSpecial("trees") is false
