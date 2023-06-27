package ru.javacore;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Tester tester1 = new Tester("Алексей", "Столпнер", 6);
        tester1.printInfo();
        System.out.println();
        Tester tester2 = new Tester("Иван", "Иванов", 10, "B1");
        double salary2 = tester2.printInfo(2.0);
        System.out.println("Зарплата И. Иванова: " + salary2);
        System.out.println();
        Tester tester3 = new Tester("Илья", "Ильев", 5, "С1", 2500.0);
        tester3.promote();
        boolean goodTester = Tester.printInfo(tester2);
        System.out.println("Иван лучше Ильюхи? " + goodTester);

    }
}
