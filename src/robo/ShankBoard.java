package robo;

public class ShankBoard {
	
	private int [][] boardLocations;

	
	
	
	public ShankBoard(int dimension) {
		this.boardLocations = new int[dimension][dimension];
	}
	


	
	public void setBotLocation(ShankLocation newLoc, ShankLocation oldLoc) {
		this.boardLocations[oldLoc.xLocation][oldLoc.yLocation] = 0;
		this.boardLocations[newLoc.xLocation][newLoc.yLocation] = 1;

	}
	
	
	public int getBoardDimension() {
		return this.boardLocations.length;
	}
	
	public void printBoard() {
		
		for(int i=0;i<this.boardLocations[0].length;i++) {
			System.out.println();
			for(int j=0;j<this.boardLocations.length;j++) {
				
				int val = this.boardLocations[i][j];
				if(val==0) {
					System.out.print("0 ");
				} else {
					System.out.print(val+" ");
				}
				
			}
		}
	}
	
	

}



