package Day4;

public class SnakeAndLadder {
    static int position = 0;
    static int diceValue;
    static int diceMovement;
    static int count = 0;
    static int disePosition = 0;
    static int totalDicePosition;
    static final int finalDicePosition = 100;
    static void discRoll() {
        while (disePosition < finalDicePosition) {
            double diceMove = (Math.random() * 10 % 3);
            diceMovement = (int) diceMove;
            double value = (Math.random() * 10 % 6);
            diceValue = (int) value;
            System.out.println(diceValue);
            System.out.println(diceMovement);

            switch (diceMovement) {
                case 1:
                    System.out.println("Player Move Forward");
                    if ((disePosition + diceValue) <= finalDicePosition)
                        disePosition = disePosition + diceValue;
                    break;
                case 2:
                    System.out.println("Player Move Backward");
                    disePosition = disePosition - diceValue;
                    if (disePosition < 0)
                        disePosition = 0;
                    break;
                default:
                    System.out.println("No Move");
            }
            count++;
            System.out.println("Position of Dice is : " + disePosition);
        }
        System.out.println(count + "Times dice roll");
    }
    public static void main (String args[])
    {
        discRoll();
    }
}
