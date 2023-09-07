import com.sun.prism.null3d.NULL3DPipeline;
import top_interview_questions.backtracking.Permutation;
import top_interview_questions.leet_code.RichestCustomer;
import top_interview_questions.leet_code.RunningSum;

import java.util.Arrays;
import java.util.List;

public class Entrypoint {

    public static void main(String[] args) {

        int[][] arr = {{1,5},{7,3},{3,5}};

        RichestCustomer richestCustomer = new RichestCustomer();
        System.out.println(richestCustomer.maximumWealth(arr));

    }
}
