package MainPackage;

import java.net.Socket;

public class GumballMachine {

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count){
        this.count = count;

        if (count > 0)
            state = NO_QUARTER;
    }

    public void insertQuarter(){

        if (state == HAS_QUARTER) {
            System.out.println("you can`t insert another quarter");
        }
        else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("you inserter a quarter");
        }
        else if (state == SOLD_OUT){
            System.out.println("you cannot insert a quarter, the machine is sold out");
        }
        else if (state == SOLD){
            System.out.println("please wait, we are already giving you a gumball");
        }
    }//end Insert Quarter


    public void ejectQuarter(){

        if (state == HAS_QUARTER){
            System.out.println("Quarter is returned");
        }
        else if (state == NO_QUARTER){
            System.out.println("you haven`t insert any quarters");
        }
        else if (state == SOLD){
            System.out.println("Sorry, you already turned the crank ,, you can call the call center. ^_^");
        }
        else if (state == SOLD_OUT){
            System.out.println("you can`t eject, you haven`t inserted a quarter yet.");
        }

    }//end Eject Quarter.

    public void turnCrank(){

        if (state == SOLD){
            System.out.println("Turning twice doesn`t get you another gumball you idiot");
        }
        else if (state == NO_QUARTER){
            System.out.println("you cann`t get a gumball their is no quarter");
        }
        else if (state == SOLD_OUT){
            System.out.println("you turned, there are no gumballs");
        }
        else if(state == HAS_QUARTER){
            System.out.println("you turned,, wait for your gumball");
            state = SOLD;
            dispense();
        }
    }//end Turn Crank

    public void dispense(){

        if (state == SOLD){

            System.out.println("A gumball comes rolling out the solt");
            count = count-1;

            if (count ==0){
                System.out.println("the machine is out of gumballs");
                state = SOLD_OUT;
            }
            else{
                state = NO_QUARTER;
            }
        }
        else if (state == NO_QUARTER){
            System.out.println("you need to pay a Quarter first ");
        }
        else if (state == SOLD_OUT){
            System.out.println("No gumball dispensed");
        }
        else if (state == HAS_QUARTER){
            System.out.println("No gumball dispensed");
        }

    }//end Dispensed function

    void printState(){

        if (state == 0)
            System.out.println("State : SOLD_OUT");
        else if (state == 1)
            System.out.println("State : NO_QUARTER");
        else if (state == 2)
            System.out.println("State : HAS_QUARTER");
        else if (state == 3)
            System.out.println("State : SOLD");

        System.out.println("Number of Gumballs : " + count);
        System.out.println(" ");
    }

}


