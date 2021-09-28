fun main() {

    // Number of correct answers
    var correct = 0

    // Question 1
    println("In the show The Office, Michael's last name is ____")
    val correctAns1 = "Scott"
    val ans1 = readLine()

    if ( ans1.equals(correctAns1, true) ) {
        println("Correct!")
        correct ++
    } else {
        println("Oops! The correct answer was $correctAns1.")
    }


    // Question 2
    println("McHenry County College is located in ____")
    val correctAns2 = "Crystal Lake"
    val ans2 = readLine()

    if ( ans2.equals(correctAns2, true) ) {
        println("Correct!")
        correct ++
    } else {
        println("Oops! The answer was $correctAns2.")
    }


    // Question 3
    println("____ is the color of an emerald")
    val correctAns3 = "Green"
    val ans3 = readLine()

    if ( ans3.equals(correctAns3, true) ) {
        println("Correct!")
        correct ++
    } else {
        println("Oops! The answer was $correctAns3.")
    }


    // Question 4
    println("If you freeze water, you get ____")
    val correctAns4 = "Ice"
    val ans4 = readLine()

    if ( ans4.equals(correctAns4, true) ) {
        println("Correct!")
        correct ++
    } else {
        println("Oops! The answer was $correctAns4.")
    }


    // Question 5
    println("Nemo is a ____fish")
    val correctAns5 = "Clown"
    val ans5 = readLine()

    if ( ans5.equals(correctAns5, true) ) {
        println("Correct!")
        correct ++
    } else {
        println("Oops! The answer was $correctAns5.")
    }


    println("Nice job! You scored $correct/5")


}

