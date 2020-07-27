package racingcar

object Racing {

    fun start(carCnt: Int, trials: Int) {
        val cars = RacingCarFactory.makeCars(carCnt)

        ResultView.printResultSignal()

        for (i in 1..trials) {
            for (x in cars.indices) {
                cars[x].run(randomNum = (0..9).random())
            }
            ResultView.printRace(cars)
        }
    }
}
