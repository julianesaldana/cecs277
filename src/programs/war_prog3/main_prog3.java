//	Julian Saldana
//	CECS 277-01
//	Prog 3 - War
//	10/6/2020
//	I certify that this program is my own original work. I did not copy any part of this program from
//	any other source. I further certify that I typed each and every line of code in this program

package programs.war_prog3;

import java.util.ArrayList;
import java.util.Scanner;

public class main_prog3{
	public static void main(String[]arg){
		System.out.println("Welcome to war");
		warDeck deck = new warDeck();
		boolean run = true;
		while (run){
			System.out.println("1) Create new deck\n2) Shuffle deck\n3) Show deck\n4) Play War\n5) Exit");
			Scanner in = new Scanner(System.in);
			switch (in.nextInt()){
				case 1:
					deck = new warDeck();
					break;
				case 2:
					deck.shuffle();
					break;
				case 3:
					deck.display();
					break;
				case 4:
					System.out.print("Enter maximum battle number: ");
					playWar(deck, in.nextInt());
					break;
				case 5:
					run = false;
					break;
				default:
					System.out.println("Enter a correct value");
					break;
			}
		}
	}

	public static void playWar(warDeck deck, int max) {
		System.out.println();

		// creating both hands using decks, display
		warHand user1Hand = new warHand(deck);
		System.out.print("Player 1 deck");
		user1Hand.display();

		warHand user2Hand = new warHand(deck);
		System.out.print("Player 2 deck");
		user2Hand.display();

		Scanner in = new Scanner(System.in);
		System.out.println("Press any key to continue");
		in.next();


		// actually playing game, creating middle pile
		ArrayList<warCard> pile = new ArrayList<warCard>();

		int counter = 0;
		while (counter < max) {
			if (user1Hand.cardsLeft() == 0 || user2Hand.cardsLeft() == 0){
				break;
			}
			else{
				// dealing both cards
				warCard temp1 = user1Hand.warDeal();
				System.out.print("Player 1 plays "); temp1.display();

				warCard temp2 = user2Hand.warDeal();
				System.out.print("\nPlayer 2 plays "); temp2.display();
				System.out.println();

				// removing from their hands and adding to middle pile
				user1Hand.pop();
				user2Hand.pop();
				pile.add(temp1);
				pile.add(temp2);

				// if player 1 card value is greater
				if (temp1.getValue() > temp2.getValue()) {
					for (int j = 0; j < pile.size(); j++)
						user1Hand.add(pile.get(j));
					System.out.println("Player 1 wins the round");
					counter++;
					pile.clear();
				}

				// if player 2 card value is greater
				else if (temp1.getValue() < temp2.getValue()) {
					for (int j = 0; j < pile.size(); j++)
						user2Hand.add(pile.get(j));
					System.out.println("Player 2 wins the round");
					counter++;
					pile.clear();
				}

				// if it is equal
				else {
					boolean war = true;
					while (war){
						if (user1Hand.cardsLeft() >= 4 && user2Hand.cardsLeft() >= 4){
							System.out.println("WAR TIME!!!!");

							// dealing war cards and adding to pile
							warCard war1 = user1Hand.warDeal();
							System.out.println("War card 1 for player 1 dealt");
							user1Hand.pop();
							pile.add(war1);

							warCard war2 = user2Hand.warDeal();
							System.out.println("War card 1 for player 2 dealt");
							user2Hand.pop();
							pile.add(war2);

							warCard war3 = user1Hand.warDeal();
							System.out.println("War card 2 for player 1 dealt");
							user1Hand.pop();
							pile.add(war3);

							warCard war4 = user2Hand.warDeal();
							System.out.println("War card 2 for player 2 dealt");
							user2Hand.pop();
							pile.add(war4);

							warCard war5 = user1Hand.warDeal();
							System.out.println("War card 3 for player 1 dealt");
							user1Hand.pop();
							pile.add(war5);

							warCard war6 = user2Hand.warDeal();
							System.out.println("War card 3 for player 2 dealt");
							user2Hand.pop();
							pile.add(war6);

							warCard warFinal1 = user1Hand.warDeal();
							System.out.print("Final war card for player 1 is "); warFinal1.display();
							user1Hand.pop();
							pile.add(warFinal1);

							warCard warFinal2 = user2Hand.warDeal();
							System.out.print("\nFinal war card for player 2 is "); warFinal2.display();
							user2Hand.pop();
							pile.add(warFinal2);

							System.out.println();


							// if player 1 war card value is greater
							if (warFinal1.getValue() > warFinal2.getValue()) {
								for (int j = 0; j < pile.size(); j++)
									user1Hand.add(pile.get(j));
								System.out.println("Player 1 wins the war round");
								pile.clear();
								counter++;
								war = false;
							}

							// if user2 war card value is greater
							else if (warFinal1.getValue() < warFinal2.getValue()) {
								for (int j = 0; j < pile.size(); j++)
									user2Hand.add(pile.get(j));
								System.out.println("Player 2 wins the war round");
								pile.clear();
								counter++;
								war = false;
							}
						}
						else
							war = false;
					}
				}
			}
		}

		System.out.println("\n\nGame over\n---------------");
		System.out.print("\nPlayer 1 deck");
		user1Hand.display();

		System.out.print("Player 2 deck");
		user2Hand.display();

		if (user1Hand.cardsLeft() > user2Hand.cardsLeft())
			System.out.printf("Player 1 wins the game with %d cards vs player 2 with %d cards in %d battles", user1Hand.cardsLeft(), user2Hand.cardsLeft(), counter);
		else if (user1Hand.cardsLeft() == user2Hand.cardsLeft())
			System.out.printf("Tied with 26 cards each in %d battles", counter);
		else
			System.out.printf("Player 2 wins the game with %d cards vs player 2 with %d cards in %d battles", user2Hand.cardsLeft(), user1Hand.cardsLeft(), counter);
		System.out.println("\n\n");
	}
}