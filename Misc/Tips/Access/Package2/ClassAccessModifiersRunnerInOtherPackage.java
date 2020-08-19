package Misc.Tips.Access.Package2;

import Misc.Tips.Access.Package1.ClassAccessModifiers;

// public, protected, (default), private
public class ClassAccessModifiersRunnerInOtherPackage {
    
    public static void main(String[] args) {
        
        ClassAccessModifiers c = new ClassAccessModifiers();
        System.out.println(c);
    }
}