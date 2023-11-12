class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        int rowSize = arr.length;
        int colSize = arr[0].length;
        int gap = Math.abs(rowSize - colSize);
        System.out.println("row size : "+ rowSize);
        System.out.println("column size : "+ colSize);
        System.out.println("gap : "+ gap);

        if (rowSize > colSize) {
            answer = new int[rowSize][colSize + gap];

            //insert arr's data
            for (int i = 0; i < rowSize; i++) {
                for (int j = 0; j < colSize; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
            //insert zero data
            for (int i = 0; i < rowSize; i++) {
                for (int j = colSize; j < rowSize; j++) {
                    answer[i][j] = 0;
                }
            }
        } else if (rowSize < colSize) {
            answer = new int[rowSize + gap][colSize];
            //insert arr's data
            for (int i = 0; i < rowSize; i++) {
                for (int j = 0; j < colSize; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
            //insert zero data
            for (int i = colSize; i < rowSize; i++) {
                for (int j = 0; j < rowSize; j++) {
                    answer[i][j] = 0;
                }
            }
        } else {
            answer = arr;
        }
        return answer;
    }
}