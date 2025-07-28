/**
 * Driver program that creates standard 52-card deck (as Card array)
 * and prints out each card in deck.
 *
 * @author George Mathews
 * @version 3.0
 */

public class Main {

	/* ALGORITHM
	*
	1. Generate 52 card deck into Card array
	- ???
	2. Print deck (simple)
	- ???
	*
	*/
	public static void main(String[] args) {
		/*** RUNNING TESTER ***/
		//uncomment line below to run CardTester:
		CardTester.main(null);

		/*** DRIVER PROGRAM ***/
		//1. Generate 52 card deck into Card array

		//2. Print deck
		Card[] deck = new Card[52];
		char[] arr = { Card.CLUB, Card.SPADE, Card.DIAMOND, Card.HEART };

		int i = 0;
		for (int j = 0; j < arr.length; j++) {
			for (int k = 1; k <= 13; k++) {
				deck[i] = new Card(k, arr[j]);
				i++;
			}
		}

		for (int index = 0; index < deck.length; index++) {
			System.out.print(deck[index].getPrintValue() + " " + deck[index].getSuit() + " ");
			int next = (index + 1) % 13;
			if (next == 0) {
				System.out.print("\n");
			}

		}

	}
}