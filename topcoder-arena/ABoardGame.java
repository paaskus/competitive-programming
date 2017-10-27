public class ABoardGame {
    private int currentRegion;
    private String[] regions;
    
    public String whoWins(String[] board) {
        regions = new String[board.length / 2];
        sortCells(board);
        int alice = 0;
        int bob = 0;
        int count = 0;
        for (int j = 0; j < regions.length; j++) {
            for (int i = 0; i < regions[count].length(); i++) {
                if (regions[count].charAt(i) == 'A') {
                    alice++;
                }
                
                if (regions[count].charAt(i) == 'B') {
                    bob++;
                }
            }
            System.out.println("Region " + (j + 1) + ": " + "Alice=" + alice + "; " + "Bob=" + bob);
            if (alice > bob) {
                return "Alice";
            }
            
            if (bob > alice) {
                return "Bob";
            }
            
            alice = 0;
            bob = 0;
            count++;
        }
        return "Draw";
    }
        
    public void updateBoard(String[] board) {
        currentRegion = (board.length / 2) - 1;
    }
        
    public void sortCells(String[] board) {
        String[] newBoard = new String[2];
        if (board.length > 2) {
            updateBoard(board);
            newBoard = new String[board.length - 2];
        } else {
           regions[0] = board[0] + board[1];    
           return;   
        }
        regions[currentRegion] = regions[currentRegion] + board[0];
        for (int i = 1; i < board.length - 1; i++) {
            regions[currentRegion].concat(board[i].substring(0, 1));
            regions[currentRegion].concat("" + board[i].charAt(board.length - 1));
            newBoard[i - 1] = board[i].substring(1, board.length - 1);
        }
        regions[currentRegion].concat(board[board.length - 1]);
        
        sortCells(newBoard);
    }
        
}