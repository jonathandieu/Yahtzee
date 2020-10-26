import java.util.*;
import java.util.ArrayList;
import java.util.List;

class Main {


  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> diceRoll = new ArrayList<Integer>();
    ArrayList<Integer> smallStraight = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
    ArrayList<Integer> largeStraight = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));

    System.out.println(smallStraight);
    System.out.println(largeStraight);


    
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

     ArrayList<Integer> sequentialDiceRoll1 = new ArrayList<Integer>(diceRoll.subList(0, 4));
     ArrayList<Integer> sequentialDiceRoll2 = new ArrayList<Integer>(diceRoll.subList(0, 5));
    
    // Sorts the arraylist values
    Collections.sort(diceRoll);
    System.out.println("This is what was entered:" + diceRoll);
    System.out.println("This is what we have" + sequentialDiceRoll1);
    System.out.println("This is what we are comparing to" + smallStraight);
    if(sequentialDiceRoll1 == smallStraight)
    {
        System.out.println("Success!");
    }
    System.out.println(sequentialDiceRoll2);




    int firstNum = diceRoll.get(0);
    int lastNum = diceRoll.get(5);

    
    if(firstNum == lastNum)
    {
        maxiYahtzy = 100;
    }

    else if(sequentialDiceRoll2.equals(largeStraight))
    {
        lStraight = 50;
    }
    
    else if(sequentialDiceRoll1.equals(smallStraight))
    {
        sStraight = 40;
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