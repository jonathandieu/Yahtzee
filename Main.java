import java.util.*;

class Main {
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> diceRoll = new ArrayList<Integer>();

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
    
    Collections.sort(diceRoll);
    System.out.println(diceRoll);

    
    System.out.println(diceRoll.get(0));


  }
}