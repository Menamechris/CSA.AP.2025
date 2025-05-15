public boolean clearPair(int row, int col) {
    int main = puzzle[row][col];
    boolean clearedAPair = false;

    for(int i = row; i < puzzle.length; i++) {
        for(int j = 0; j < puzzle[0].length; j++) {
            if(main == puzzle[i][j] || main + puzzle[i][j] == 10) {
                puzzle[i][j] = 0;
                clearedAPair = true;
            }
        }
    }
    return clearedAPair;
}
