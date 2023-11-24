class InputException extends Exception
{
    @Override
    public java.lang.String getMessage() {
        return "Input should be less than 10,000";
    }
}
class MultiplyInputException extends Exception
{
    @Override
    public java.lang.String getMessage() {
        return "Multiplication Input should be less than 7,000";
    }
}

class calculator1 {
    int input1;
    int input2;
    int input3;
    int input4;

    public void setInput1(int input1) throws InputException {

        try {
            if (input1 > 10000) {
                throw new InputException();
            }
            this.input1 = input1;
        } catch (InputException e) {
            System.out.println(e.getMessage());
        }
    }

    public void getInput1() {
        System.out.println("The first input is " + input1);
    }

    public void setInput2(int input2) throws InputException {
        try {
            if (input2 > 10000) {
                throw new InputException();
            }
            this.input2 = input2;
        } catch (InputException e) {
            System.out.println(e.getMessage());
        }
    }

    public void getInput2() {
        System.out.println("The Second input is " + input2);
    }

    public void getInput3() {
        System.out.println("First Multiplication input is " + input3);
    }

    public void setInput3(int input3) throws MultiplyInputException {
        try {
            if (input3 > 7000) {
                throw new MultiplyInputException();
            }
            this.input3 = input3;
        } catch (MultiplyInputException e) {
            System.out.println(e.getMessage());
        }
    }

    public void getInput4() {
        System.out.println("Second Multiplication input is " + input4);
    }

    public void setInput4(int input4) {
        try {
            if (input4 > 7000) {
                throw new MultiplyInputException();
            }
            this.input4 = input4;
        } catch (MultiplyInputException e) {
            System.out.println(e.getMessage());
        }
    }

    int add() {    
        int c = this.input1 + this.input2;
        System.out.println(c);
        System.out.println("Addition Function is Finished !! ");
        return c;

    }

    int subtract() {  
        int c;
        if (this.input1 > this.input2)
            c = this.input1 - this.input2;
        else
            c = this.input2 - this.input1;

        System.out.println(c);
        System.out.println("Subtraction Function is Finished !! ");
        return c;
    }

    int multiply() {  
        int c = this.input3 * this.input4;
        System.out.println(c);
        System.out.println("Multiplication Function is Finished !! ");
        return c;
    }

    float divide() {  
        float c = (float)(this.input1 / this.input2);
        try {
            if (this.input2 == 0) {
                throw new ArithmeticException("We cannot divide by 0 ");
            }
            System.out.println(c);
            return c;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Division Function is Finished !! ");
        }
        return c;
    }

}

public class OPPS_CWH_11 {
    public static void main(String[] args) throws MultiplyInputException, InputException {
        calculator1 C1 = new calculator1();
        C1.setInput1(40);
        C1.setInput2(5);
        C1.setInput3(400);
        C1.setInput4(500);
        C1.getInput1();
        System.out.print("\n");
        C1.getInput2();
        System.out.print("\n");
        C1.getInput3();
        System.out.print("\n");
        C1.getInput4();
        System.out.print("\n");
        C1.add();
        System.out.print("\n");
        C1.subtract();
        System.out.print("\n");
        C1.divide();
        System.out.print("\n");
        C1.multiply();
        System.out.print("\n");
    }
}