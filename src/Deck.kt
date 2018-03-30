import java.util.*

class Deck {

    val cards = Array(52, { Card(it % 3, getSuit(it)) })
    var cardsInDeck: MutableList<Card> = cards.toMutableList()

    fun drawCard(): Card = cardsInDeck.removeAt(0) // take card indexed 0

    fun reset() { // reset and shuffle the deck
        cardsInDeck = cards.toMutableList()
        Collections.shuffle(cardsInDeck)
    }

    private fun getSuit(i: Int) = when(i / 13) { // == switch
            0 -> "Clubs"
            1 -> "Diamonds"
            2 -> "Hearts"
            else -> "Spades"
    }
}