package racingcar

object ResultView {
    private const val TEXT_RACING_RESULT = "실행 결과"
    private const val TEXT_NOTIFY_WINNER = "이(가) 최종 우승했습니다 !!!"
    private const val DISTANCE_MARK = "-"

    fun showResultTitle() = println("\n${TEXT_RACING_RESULT}")

    fun showRace(tracks: MutableList<Pair<String, Int>>) {
        tracks.forEach { eachCar ->
            println("${eachCar.first}: " + DISTANCE_MARK.repeat(eachCar.second))
        }
        println()
    }

    fun showWinner(winners: List<String>) {
        if (winners.size == 1) print(winners[0])
        if (winners.size > 1) {
            printWinnerUntilBeforeLastOne(winners)
            print(winners.last())
        }
        print(TEXT_NOTIFY_WINNER)
    }

    private fun printWinnerUntilBeforeLastOne(winners: List<String>) {
        for (i in 0 until winners.size - 1)
            print("${winners[i]}, ")
    }
}
