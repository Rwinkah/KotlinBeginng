
 fun main(args: Array<String>) {
     println("How many hours was yout car parked for?")

     var hours = readLine()!!.toInt()
     var total: Double = 0.0
     if (hours < 24) {
         total = 5 + ((hours - 5) * 0.5)


     } else total = 15 + (hours - 24) * 0.5
 }
