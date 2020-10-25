import java.util.*;

class Main {


  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> diceRoll = new ArrayList<Integer>();
    ArrayList<Integer> sequentialDiceRoll = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));

    System.out.println(sequentialDiceRoll);
    
    // Values that will be printed out at the end
    int cPoints = 0;
    int pPoints = 0;
    int sStraight = 0;
    int lStraight = 0;
    int maxiYahtzy = 0;

    System.out.println("Please enter your dice roll");
    while(diceRoll.size() < 6)
    {   
        int input = sc.nextInt();
        if (input > 0 && input < 7)
        {
            diceRoll.add(input);
        }
        else
        {
            System.out.println("That isn't a valid roll");
        }
    }
    
    // Sorts the arraylist values
    Collections.sort(diceRoll);
    System.out.println(diceRoll);



    int firstNum = diceRoll.get(0);
    int lastNum = diceRoll.get(5);

    if(firstNum == lastNum)
    {
        maxiYahtzy = 100;
    }

    else if(diceRoll.contains(sequentialDiceRoll))
    {
        pPoints = 35;
    }
    else
    {
        cPoints = getSum(diceRoll);
    }

    System.out.printf("Chance: %d points\n", cPoints);
    System.out.printf("Three pairs: %d points\n", pPoints);
    System.out.printf("Small Straight: %d points\n", sStraight);
    System.out.printf("Large Straight: %d points\n", lStraight);
    System.out.printf("Maxiyatzy: %d points\n", maxiYahtzy);

  }
  public static int getSum(ArrayList<Integer> someAL)
  {
    int sum = 0;
    int size = someAL.size();

    for(int i = 0; i < size; i++)
    {
        sum += someAL.get(i);
    }
    return sum;
  }
}