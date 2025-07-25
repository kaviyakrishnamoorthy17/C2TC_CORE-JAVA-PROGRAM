package day6.usingfinal;

public class FinalVariable {

    // Final instance variable must be initialized
    final int x = 100;

    // Static blank final variable
    final static int Y;

    // Static final variable initialized at declaration
    final static int Z = 10;

    void change() {
        // x = 30; // ❌ Cannot reassign final variable
        // Y = 200; // ❌ Cannot reassign final variable
        System.out.println("Cannot modify final variables.");
    }

    @Override
    public String toString() {
        return "FinalVariable [x=" + x + ", Y=" + Y + "]";
    }

    static {
        Y = 20; // ✅ Allowed (first-time initialization of blank final)
        // Z = 100; // ❌ Not allowed (already initialized)
        System.out.println("Value of Y: " + Y);
    }

    public static void main(String[] args) {
        FinalVariable fv = new FinalVariable();
        System.out.println(fv);
        fv.change();
    }
}