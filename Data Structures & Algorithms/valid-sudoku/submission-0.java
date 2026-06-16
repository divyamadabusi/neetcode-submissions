class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Integer> set = new HashSet<>();
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();


        //check each square in the board.
        //if its number already exists in the corresponding
        //row/col/square map for it. return false.

        //
        for(int r = 0; r < 9; r++) {
            for(int c = 0; c < 9; c++) {
                char curr = board[r][c];
                if(curr == '.') {
                    continue;
                }

                if(!rows.containsKey(r)) {
                    rows.put(r, new HashSet<>());
                }
                if(rows.get(r).contains(curr)) {
                    return false;
                }

                if(!cols.containsKey(c)) {
                    cols.put(c, new HashSet<>());
                }
                if(cols.get(c).contains(curr)) {
                    return false;
                }

                if(!squares.containsKey("" + r/3 + c/3)) {
                    squares.put(("" + r/3 + c/3) , new HashSet<>());
                }
                if(squares.get("" + r/3 + c/3).contains(curr)) {
                    return false;
                }

                rows.get(r).add(curr);
                cols.get(c).add(curr);
                squares.get("" + r/3 + c/3).add(curr);

            }
        }
        return true;
        
    }
}
