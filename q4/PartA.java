public sumOrSameGame(int numRows, int numCols) {
    int[][] puzzle = new int[numRows][numCols];

    for(int i = 0; i < numRows; i++) {
        for(int j = 0; j < numCols; j++) {
            puzzle[i][j] = (int)(Math.random()*(9-1)+1);
        }
    }
}
