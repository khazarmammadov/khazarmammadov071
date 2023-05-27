package lesson13;

public class OuterClass {

    class Member {
        void innerMethod() {
            System.out.println("Task 2");
        }
    }

    void outerMethod() {
        Member member = new Member();
        System.out.print("Task 3 -- > ");
        member.innerMethod();
    }

    static class InnerClass {
        void method() {
            System.out.println("Task 4");
        }
    }

    interface InnerInterface{
        void method();
    }
    public void method() {
        InnerInterface innerInterface = new InnerInterface() {
            @Override
            public void method() {
                System.out.println("Anonyms method");
            }
        };
        innerInterface.method();
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        Member member = outerClass.new Member();
        member.innerMethod();
        outerClass.outerMethod();
        InnerClass obj = new InnerClass();
        obj.method();
        outerClass.method();


    }
}
