package src.Access_modifiers.Police;

public class Cop {
    public int gun;    // modifier, return-type, variable

    public Cop(int gun){
        this.gun = gun;
    }

    protected void canIshoot(){
        System.out.println("Of-Course, Shoot");
    }

}
