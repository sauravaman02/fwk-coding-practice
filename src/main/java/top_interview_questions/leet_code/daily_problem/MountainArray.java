package top_interview_questions.leet_code.daily_problem;

public interface MountainArray {

    public default int get(int index) {
        return 1;
    };
    public default int length() {
        return 1;
    }
}
