package top_interview_questions.leet_code.daily_problem;

public class SearchMountainArray {

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int length = mountainArr.length();
        int left = 0;
        int right = length - 1;
        int peak = -1;
        int index = -1;


        while (left <= right) {

            int mid = left + ((right - left) / 2);

            System.out.println("Mid = " + mid);
            System.out.println("left = " + left);
            System.out.println("right = " + right);

            if((mid+1 < length) && (mountainArr.get(mid) < mountainArr.get(mid + 1))){
                peak=mid;
                left=mid+1;
            }
            else{
                right = mid-1;
            }
        }


        right = peak;
        left = 0;
        while (left <= right) {

            int mid = left + ((right - left) / 2);

            if (mountainArr.get(mid) == target) {
                index = mid;
                return index;
            }

            else if ((mountainArr.get(mid) > target)) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }

        }

        left = peak + 1;
        right = length - 1;

        while (left <= right) {

            int mid = left + ((right - left) / 2);

            if (mountainArr.get(mid) == target) {
                index = mid;
                return index;
            }

            else if ((mountainArr.get(mid) < target)) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }

        }

        return index;
    }
}
