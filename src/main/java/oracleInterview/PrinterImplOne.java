package oracleInterview;

public class PrinterImplOne implements PrinterFactory{
    @Override
    public void printInteger(int print) {
        System.out.println(print);
    }

    @Override
    public void printString(int string) {
        System.out.println(string);
    }
}
