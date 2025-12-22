package pack_01;

public class NeedsVariable {
    public static void main(String[] args) {
        HasVariables hv = new HasVariables();
        System.out.println("Name: " + hv.name);
        System.out.println("Age: " + hv.age);
        System.out.println("Address: " + hv.address);
        // System.out.println("Fees: " + hv.fees); // This line would cause an error
    }
}
