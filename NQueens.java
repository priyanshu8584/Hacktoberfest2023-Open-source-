public class NQueens {
    public static void main(String[] args) {
        int n=5;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='.';
            }
        }
        queens(board,0);
    }
    public static boolean isTrue(char board[][],int row,int col)
   {
    //vertically up
      for(int i=row-1;i>=0;i--)
         {
            if(board[i][col]=='Q')
            return false;
         }
    //diagonally right
     for(int j=col-1, i=row-1;j>=0 && i>=0;j--,i--)
     {
        if(board[i][j]=='Q')
        return false;
     }
    //diagonally left
    for(int i=row-1,j=col+1;i>=0 && j<board.length;j++,i--)
    {
       if(board[i][j]=='Q')
        return false; 
    }
    return true;
   }
    public static void queens(char board[][], int row)
    {
        if(row==board.length)
        {
            System.out.println();
            for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        return;  
        }
      
        for(int j=0;j<board.length;j++)
        {
              if (isTrue(board, row, j))
              {
            board[row][j]='Q';
            queens(board,row+1);
            board[row][j]='.';
              }
        }
    }
}
