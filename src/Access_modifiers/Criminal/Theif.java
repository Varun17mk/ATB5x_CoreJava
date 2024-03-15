package src.Access_modifiers.Criminal;

import src.Access_modifiers.Police.Cop;

public class Theif {
    public static void main(String[] args) {
        Cop cop = new Cop(10);
        System.out.println(cop.gun);
//        cop.canIshoot();
        // He cant access this(Protected modifier) cause theif is outside Police package
    }
}
