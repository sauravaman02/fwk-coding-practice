import java.util.Stack;

public class WalmartMatrixTraversal {

    public int traverse(int[][] matrix, int m, int n) {

        int MIN_COST = Integer.MIN_VALUE;

        int [] visited = new int[m*n];

        Stack<Object> stack = new Stack<>();

        visited[0] = matrix[0][0];
        stack.push(matrix[0][0]);

        while (!stack.isEmpty()) {

            if (m != 0){
                stack.push(m-1, n);

            }

        }

    }
}
