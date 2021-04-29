import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;


public class Awesome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]mtx = new int[6][5];
		
		Random rand = new Random();
		
		int tmp=0;
		for(int row=0;row<mtx.length;row++) {
			for(int col=0;col<mtx[0].length;col++) {
				//int num = rand.nextInt(100);
				mtx[row][col] = tmp;
				tmp++;
			}
		}
		
		ListProblems lp = new ListProblems();
		//Awesome.printMtxSpiral(mtx);

	}
	
	public static void printMtxSpiral(int [][] mtx) {
//		System.out.println("Original Matrix size : "+ mtx.length);
//		System.out.println("Original Matrix fist dim : "+ mtx[0].length);
//		System.out.println("Original Matrix fist dim : "+ mtx[2].length);
		Awesome.printMatrix(mtx);
		System.out.println("---------------------------------------------------");
		
		int colLength = mtx[0].length;
		int rowLength = mtx.length;
		
		for(int row=0;row<(mtx.length)/2;row++) {
			for(int col=0;col<(colLength+rowLength) -4 ;col++) {
				
				int tmpCol = col;
				if(tmpCol==colLength) {
					tmpCol-=1;
				}
				System.out.print(" " +mtx[row][tmpCol]);
			}
		}
		

		
	}
	
	public static void rotateMatrix(int [][] mtx) {
		System.out.println("Original Matrix : ");
		Awesome.printMatrix(mtx);
			
		
		
		for(int row=0;row<mtx.length;row++) {
			int endCol = mtx[row].length-1;	
			for(int col=0;col<endCol;col++) {
					int tmp = mtx[row][col];
					mtx[row][col] = mtx[row][endCol];
					mtx[row][endCol] = tmp;
					endCol--;
			}
		}
		System.out.println(" Rotated Matrix : ");
		Awesome.printMatrix(mtx);
	}
	
	public static void printMatrix(int [][] mtx) {
		for(int i=0;i<mtx.length;i++) {
			for(int j=0;j<mtx[i].length;j++) {
				System.out.print(" "+mtx[i][j]);
			}
			System.out.println();
		}
	}

}