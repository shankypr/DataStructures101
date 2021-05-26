package robo;

import java.io.IOException;

public class ShankController {

	public static void test() {
		ShankBoard board = new ShankBoard(10);
		ShankBot bot = new ShankBot(board,0,0);
		
		System.out.println("\n---------------- Initial Board ----------------");
		board.printBoard();
		
		bot.turnRight();
		bot.turnRight();
		bot.turnRight();
		bot.turnRight();
		
//		while(bot.moveRight());
//		while(bot.moveLeft());
//		while(bot.moveDown());
		
		
	}

}
