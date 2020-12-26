package MainPackage;

public class MainClass {

    public static void main(String[] args) {

        GumballMachine gumballMachine = new GumballMachine(5);

        gumballMachine.printState();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.printState();

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();

        gumballMachine.printState();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();

        gumballMachine.printState();

        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.printState();

    }

}
