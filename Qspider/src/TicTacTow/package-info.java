package TicTacTow;
 class TicTacTow{
		private final char[][] mark ;
	
		{
			mark = new char[3][3];
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					mark[i][j]=' ';
				}
			}
		}
 
	
 public void displayBoard(){
	 System.out.println("---------------");
	 for(int i=0; i<mark.length; i++) {
		 System.out.print("| ");
		 for(int j=0;j<mark.length; j++) {
			 System.out.print(mark[i][j]+" | ");
			 
		 }
		 System.out.println();
		 System.out.println("--------------");
		 
	 }
	 
 }
 
 public boolean isRowWin(){
	 for(int i=0; i<3; i++) {
		 if(mark[i][0]!=' ' && mark[i][0]==mark[i][1] && mark[i][1]==mark[i][2]) {
			 return true;
		 }
		
	 }
	 return false;
 }
 public boolean isColumnWin(){
	 for(int i=0; i<3; i++) {
		 if(mark[0][i]!=' ' && mark[0][i]==mark[1][i] && mark[1][i]==mark[2][i]) {
			 return true;
		 }
		
	 }
	 return false;
 }
 public boolean isDigonalWin(){
	
		 if((mark[0][0]!=' ' && mark[0][0]==mark[1][1] && mark[1][1]==mark[2][0])) {
			 return true;
		 }
	 return false;
 }
 public static void main(String[] args) {
	TicTacTow t1 = new TicTacTow();
	t1.displayBoard();
}
  }
 
 
