//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import static java.lang.System.*;

public class HashTableRunner
{
  public static void main ( String[] args )
  {
		try {
            // Create an array of linked lists for the hash table
            LinkedList<Number>[] table = new LinkedList[10];
            for (int i = 0; i < 10; i++) {
                table[i] = new LinkedList<>();
            }

            // Read thg integers from "numbers.dat" and store them in the hash table
            Scanner file = new Scanner(new File("numbers.dat"));
            while (file.hasNextInt()) {
                Number num = new Number(file.nextInt());
                int bucket = num.hashCode();
                if (!table[bucket].contains(num)) {
                    table[bucket].add(num);
                }
            }
            file.close();

            // Print the contents of the hash table
            System.out.println("HASHTABLE");
            for (int i = 0; i < 10; i++) {
                System.out.print("bucket " + i);
                for (Number num : table[i]) {
                    System.out.print(" " + num);
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("error");
        }
  }
}
