import java.util.HashMap;
import java.util.HashSet;

public class ValidSudoko {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                char current = board[i][j];
                if(current != '.'){
                    if(!seen.add(i+"row"+current)
                            || !seen.add(j+"col"+current)
                || !seen.add(i/3+"boxes"+j/3+current)
                    ){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
