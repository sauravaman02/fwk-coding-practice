public class CustomStack {

    int[] stack;

    public CustomStack(int length){

        stack = new int[length];
    }


    int pushCounter = -1;

    //lifo
    void push(int number) {

        if (pushCounter >= stack.length)
            throw new StackOverflowError();

        stack[++pushCounter] = number;
    }

    int pop() throws Exception {

        //pushCounter = -1

        if (pushCounter >= 0) {
            int numberPopped = stack[pushCounter--];
            return numberPopped;
        }
        else {
            throw new Exception("No items to return in Stack.");
        }


    }
}
