package Misc.Tips.Access.Package1;

public class MethodAccessRunnerSamePackage {

    public static void main(String[] args) {
        
        ExampleClass exampleClass = new ExampleClass();
        exampleClass.publicMethod();
        exampleClass.protectedMethod();
        //exampleClass.privateMethod();
        exampleClass.defaultMethod();

    }
}