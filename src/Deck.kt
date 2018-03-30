class Deck {

    val cards = Array(52, { Card(it % 3, getSuit(it)) })

    private fun getSuit(i: Int) = when(i / 13) { // == switch
            0 -> "Clubs"
            1 -> "Diamonds"
            2 -> "Hearts"
            else -> "Spades"
    }
}