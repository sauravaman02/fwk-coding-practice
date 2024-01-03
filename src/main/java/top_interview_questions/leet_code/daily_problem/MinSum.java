package top_interview_questions.leet_code.daily_problem;

public class MinSum {

    public static long minSum(int[] nums1, int[] nums2) {

        long sa = 0, sb = 0, a0 = 0, b0 = 0;

        for (int a: nums1) {
            a0 += a > 0 ? 0: 1;
            sa += Math.max(a, 1);
        }

        for (int b: nums2) {
            b0 += b > 0 ? 0: 1;
            sb += Math.max(b, 1);
        }

        if (sa < sb && a0 == 0) return -1;

        if (sa > sb && b0 == 0) return -1;

        return Math.max(sa, sb);
    }
}
