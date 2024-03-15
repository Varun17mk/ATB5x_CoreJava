package src.Access_modifiers.Police;

import java.util.SortedMap;

public class JrCop {
    public static void main(String[] args) {
        Cop JrCop=new Cop(2);
        System.out.println(JrCop.gun);
        JrCop.canIshoot(); // Can use canIshoot here cause its protected and can be used in same package only.
    }
}
