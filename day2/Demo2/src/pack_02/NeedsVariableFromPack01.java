package pack_02;

import pack_01.HasVariables;

public class NeedsVariableFromPack01 extends HasVariables {
    public static void main(String[] args) {
        HasVariables hv = new HasVariables();
        System.out.println("Name: " + hv.name);
        // System.out.println("Age: " + hv.age);
        NeedsVariableFromPack01 nv = new NeedsVariableFromPack01();
        System.out.println("Address: " + nv.address);
        // System.out.println("Fees: " + hv.fees); // This line would cause

    }

}
