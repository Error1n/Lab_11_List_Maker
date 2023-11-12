import java.util.Scanner;
import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        Scanner Scan = new Scanner(System.in);
        ArrayList<String> myArrList = new ArrayList<>();
        String addItem = "";
        int itemToDel = 0;

        boolean done = false;

        do
        {
            String choice = SafeInput.getRegExString(Scan, "Choose from the menu options", "[AaDdPpQq]");

            if(choice.equalsIgnoreCase("A"))
            {
                addItem = SafeInput.getNonZeroLenString(Scan, "Add an item to the list: ");
                myArrList.add(addItem);
            }
            else if(choice.equalsIgnoreCase("D"))
            {
                System.out.println("Delete an item from the list");
                itemToDel = SafeInput.getInt(Scan, "Enter the number of the item you want to remove");
                myArrList.remove(itemToDel); // overwrite Tom with Bob
                for(String f  : myArrList);

            }
            else if(choice.equalsIgnoreCase("P"))
            {
                System.out.println("Printing your list");
                for(String f  : myArrList)
                {
                    System.out.println(f);
                }
            }
            else if(choice.equalsIgnoreCase("Q"))
            {
                done = SafeInput.getYNConfirm(Scan, "Do you want to quit?");
            }
        }while(!done);




    }
}