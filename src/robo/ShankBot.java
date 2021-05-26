package robo;

public class ShankBot {

	enum Orientation {
	    NORTH,
	    SOUTH,
	    EAST,
	    WEST
	  }
	
	private ShankBoard board;
	private ShankLocation currLocation;
	private Orientation currentOrientation;
	
	public ShankBot(ShankBoard _board,int xLoc, int  yLoc) {
		this.board = _board;
		this.currLocation = new ShankLocation(xLoc,yLoc);
		this.board.setBotLocation(this.currLocation, this.currLocation);
		this.currentOrientation = Orientation.NORTH;
	}
	
	
	
	public Orientation getCurrentOrientation() {
		return this.currentOrientation;
	}
	
	public ShankLocation getCurrentLocation() {
		return this.currLocation;
	}
	
	
	
	public boolean turnRight() {
		if(this.moveRight()) {
			switch (this.currentOrientation) {
			 	case EAST:
			 		this.currentOrientation = Orientation.SOUTH;
			 		
			 		break;
			 	case WEST:
			 		this.currentOrientation = Orientation.NORTH;
			 		break;
			 	case NORTH:
			 		this.currentOrientation = Orientation.EAST;
			 		break;
			 	case SOUTH:
			 		this.currentOrientation = Orientation.WEST;
			 		break;
			 		
			}
			this.board.printBoard();
			this.printOrientation();
			return true;
		}
		return false;
	}
	
	
	
	private boolean moveRight() {
		System.out.println("\n\n----------- Moving Right ------------");
		
		int newY = this.currLocation.yLocation+1;
		if(newY >= this.board.getBoardDimension()) {
			System.out.println("\n\nINFO: REACHED END OF BOARD CANT MOVE RIGHT");
			return false;
		} 
		else {
			this.moveHelper(this.currLocation.xLocation, newY);
			return true;
		}
		
		
	}
	
	private boolean moveLeft() {
		System.out.println("\n\n---------- Moving Left ------------");
		
		
		int newY = this.currLocation.yLocation-1;
		if(newY < 0) {
			System.out.println("\n\nINFO: REACHED END OF BOARD CANT MOVE LEFT");
			return false;
		} 
		else {
			this.moveHelper(this.currLocation.xLocation, newY);
			return true;
		}
		
	}
	
	private boolean moveUp() {
		System.out.println("\n\n----------- Moving Up ------------");
		
		int newX = this.currLocation.xLocation-1;
		if(newX < 0) {
			System.out.println("\n\nINFO: REACHED END OF BOARD CANT MOVE UP");
			return false;
		} 
		else {
			this.moveHelper(newX, this.currLocation.yLocation);
			return true;
		}
		
	}
	
	private boolean moveDown() {
		System.out.println("\n\n----------- Moving Down ------------");
		
		int newX = this.currLocation.xLocation+1;
		if(newX >= this.board.getBoardDimension()) {
			System.out.println("\n\nINFO: REACHED END OF BOARD CANT MOVE Down");
			return false;
		} 
		else {
			this.moveHelper(newX, this.currLocation.yLocation);
			return true;
		}
		
	}
	
	private void moveHelper(int newX,int newY) {
		ShankLocation newLoc = new ShankLocation(newX, newY);
		this.board.setBotLocation(newLoc, this.currLocation);
		this.currLocation = newLoc;
		
		
	}
	
	private void printOrientation() {
		switch (this.currentOrientation) {
		 	case EAST:
		 		System.out.println("\n**********	----> *********");
		 		break;
		 	case WEST:
		 		System.out.println("\n**********	<---- *********");
		 		break;
		 	case NORTH:
		 		System.out.println("\n**********	^   *********");
		 		break;
		 	case SOUTH:
		 		System.out.println("\n**********	v   *********");
		 		break;
		 	default:
		 		
	 		
		}
	}
	
	

}
