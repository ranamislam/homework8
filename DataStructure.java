package Homework_8;
import java.util.*;
public class DataStructure
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String[] namesArray = new String[3];
        List<Integer> studentID = new ArrayList<Integer>();
        List<Integer> list = new LinkedList<Integer>();
        Stack<String> stack = new Stack<String>();
        Queue<String> queue = new LinkedList<String>();


        System.out.println("Please enter three (3) students' names: ");
        for(int i = 0; i < namesArray.length; i++)
        {
            System.out.print("Student-name <" + (i+1) + ">: ");
            namesArray[i] = keyboard.nextLine();
        }
        blankSpace();

        System.out.println("Please enter students' ID numbers: ");
        for(int i = 0; i < namesArray.length; i++)
        {
            System.out.print("Student-ID <" + (i+1) + ">: ");
            studentID.add(keyboard.nextInt());
        }
        blankSpace();

        System.out.println("Please enter students' total credits: ");
        for(int i = 0; i < namesArray.length; i++)
        {
            System.out.print("Student-credit <" + (i+1) + ">:  ");
            list.add(keyboard.nextInt());
        }

        for(int i = 0; i < namesArray.length; i++)
        {
            stack.push(namesArray[i]);
            queue.add(namesArray[i]);
        }


        System.out.println("\n--DATA--FROM--COMPUTER--STORAGE------------------------\n" +
                           "\nFollowing is students' information: \nNAMES: ");
        int i = 0;
        for(String s : namesArray)
        {
            System.out.println("Student-name <" + (i+1) + ">:  " + s);
            i++;
        }
        blankSpace();

        System.out.println("STUDENT ID:");
        Iterator it = studentID.listIterator();
        int j = 0;
        while(it.hasNext() && j < namesArray.length)
        {
            System.out.println("Student-ID <" + (j+1) + ">: " + it.next());
            j++;
        }
        blankSpace();


        int l = 0;
        for(int s : list)
        {
            System.out.println("Student-credit <" + (l+1) + ">:  " + s);
            l++;
        }
        blankSpace();


        int p = namesArray.length;
        System.out.println("STACK:");
        for(int w = 0; w < namesArray.length; w++)
        {
            System.out.println("\t\t" + p + "-st/th student entered: " + stack.pop());
            p--;
        }
        blankSpace();

        System.out.println("QUEUE:");
        for(int y = 0; y < namesArray.length; y++)
        {
            System.out.println("\t\tQueue: " + (y + 1) + " --> " + queue.remove());
        }
    }

    public static void blankSpace()
    {
        System.out.println();
    }

}
