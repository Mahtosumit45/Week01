import java.util.Scanner;

public class Cards {

    public static String[] initializeDeck(){
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4" ,"5" ,"6" ,"7", "8", "9", "10","Jack", "Queen" ,"King" ,"Ace"};

        int num = suits.length * ranks.length;
        String[] deck = new String[num];
        int i = 0;
        for(String suit: suits){
            for(String rank: ranks){
                deck[i++] = rank+" of "+suit;
            }
        }
        return deck;
    }
    public static void shuffleDeck(String[] deck){
        int n = deck.length;
        for(int i =0;i<n;i++){
            int randomNumber = i+ (int)(Math.random() *(n-i));
            String temp = deck[i];
            deck[i] = deck[randomNumber];
            deck[randomNumber] = temp;
        }
    }
    public static String[][] distribute(String[] deck,int numberOfPlayer,int numOfCard){
        int cardPerPlayer = numOfCard/numberOfPlayer;
        String[][] players = new String[numberOfPlayer][cardPerPlayer];
        int id = 0;
        for (int i = 0; i < numberOfPlayer; i++) {
            for (int j = 0; j < cardPerPlayer; j++) {
                players[i][j] = deck[id++];
            }
        }
        return players;
    }
    public static void printer(String[][] players){
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player "+(i+1)+" : ");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println(" "+players[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of player ");
        int numberOfPlayer = sc.nextInt();
        String[] deck = initializeDeck();
        shuffleDeck(deck);
        String[][] distributedCards = distribute(deck,numberOfPlayer,52);
        //Printing the player with their cards
        printer(distributedCards);

    }
}
