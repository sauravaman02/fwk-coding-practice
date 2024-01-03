package oracleInterview;

public class PrinterImplTwo implements PrinterFactory{
    @Override
    public void printInteger(int print) {
        System.out.println("Value: "+ print);
    }

    @Override
    public void printString(int string) {
        System.out.println("Value: "+ string);
    }
}
