package Misc.Tips.NestedClass.src;

class DefaultClass {

}

public class NestedClassRunner {
    
    int i;

    class InnerClass {
        public void method() {
            i = 5;
        }
    }

    static class StaticNestedClass {
        public void method() {}
    }

    public static void main(String[] args) {
        
        //InnerClass innerClass = new InnerClass();

        StaticNestedClass staticNestedClass = new StaticNestedClass();

        NestedClassRunner nestedClassRunner = new NestedClassRunner();
        InnerClass innerClass = nestedClassRunner.new InnerClass();

        System.out.println(staticNestedClass);
        System.out.println(innerClass);
    }
}