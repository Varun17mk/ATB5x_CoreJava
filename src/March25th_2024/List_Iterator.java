package src.March25th_2024;

// List Iterator is used to iterate all the elememnts
// especially from last element to first element


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_Iterator {
    public static void main(String[] args)
    {
        List ttacourselist = new ArrayList();
        ttacourselist.add("ATB");
        ttacourselist.add("MTB");
        ttacourselist.add("PTB");
        ttacourselist.add("SDET");

        // Itrating from last to first element of ttacourselist

        ListIterator lt = ttacourselist.listIterator(ttacourselist.size());
        while (lt.hasPrevious())
        {
            System.out.println(lt.previous());
        }

        System.out.println("-------------------");
        // Itrating from  first to last  element of ttacourselist

        ListIterator lt1 = ttacourselist.listIterator();
        while (lt1.hasNext())
        {
            System.out.println(lt.next());
        }
    }
}
