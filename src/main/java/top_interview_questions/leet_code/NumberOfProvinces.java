package top_interview_questions.leet_code;

public class NumberOfProvinces {

    int length;
    public int findCircleNum(int[][] isConnected) {

        length = isConnected.length;
        boolean[] visited = new boolean[length];
        int counter = 0;

        for (int i = 0; i < length; i++) {
            if (!visited[i]) {
                dfs(isConnected, visited, i);
                counter++;
            }
        }

        return counter;
    }

    public void dfs(int[][] isConnected, boolean[] visited, int node) {

        for (int j = 0; j < length; j++) {

            if (isConnected[node][j] == 1 && !visited[j]) {
                visited[j] = true;
                dfs(isConnected, visited, j);
            }

        }


    }
}
