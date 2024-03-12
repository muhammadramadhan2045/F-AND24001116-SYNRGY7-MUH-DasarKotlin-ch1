class XStar(private val height :Int) : Shape(){
    override fun draw() {
        for (i in height downTo 1) {
            for (j in 1..height - i) {
                print(" ")
            }
            for (k in 1 until 2 * i) {
                if (k == 1 || k == 2 * i - 1) {
                    print("*")
                } else {
                    print(" ")
                }
            }
            println()
        }
        //segitiga bintang di setiap sisi tengahnya kosong (x)
        for (i in 2..height) {
            for (j in 1..height - i) {
                print(" ")
            }
            for (k in 1 until 2 * i) {
                if (k == 1 || k == 2 * i - 1) {
                    print("*")
                } else {
                    print(" ")
                }
            }
            println()
        }


    }

}