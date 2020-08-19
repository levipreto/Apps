package Misc.Tips.Access.Package2;

import Misc.Tips.Access.Package1.ExampleClass;

public class MethodAccessRunnerOtherPackage {

    public static void main(String[] args) {
        
        ExampleClass exampleClass = new ExampleClass();
        exampleClass.publicMethod();
        //exampleClass.protectedMethod();
        //exampleClass.privateMethod();
        //exampleClass.defaultMethod();

    }
}