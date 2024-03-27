package src.March25th_2024;

import java.util.ArrayList;
import java.util.List;

public class Iterator {
    public static void main(String[] args)
    {
        List<String> courselist = new ArrayList<>(); // <String> defines only strings are accepted.
        courselist.add("ATB");
        courselist.add("MTB");
        courselist.add("PTB");
        courselist.add("SDET");

        List numlist = new ArrayList(); // nothing is specified here hence objects of all data type can be created
        numlist.add(150);
        numlist.add(200);
        numlist.add(300);

        courselist.addAll(numlist); // .addALL() Method helps to add elements of specified list into current list.
        System.out.println(courselist);

        java.util.Iterator iterator = courselist.iterator(); // Iterator is used to itrate elements from 1 to n elements in an array.
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
