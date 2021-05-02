import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import datastructures.MyNode;


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
		
		

		

	}
	
	
	
    public MyNode mergeTwoLists(MyNode l1, MyNode l2) {
        
        MyNode lptr = l1;
        MyNode rptr = l2;

        
        while(lptr!=null && rptr!=null) {
            
        	if(lptr.getVal() > rptr.getVal()) {
        		
        		System.out.println("Left greater than right. Lval:"+lptr.getVal() + " rightVal:"+rptr.getVal());
        		
        	}
        	else {
        		System.out.println("Right greater than left. Rval"+rptr.getVal() + " LightVal:"+lptr.getVal());
        	}
        	
        	lptr=lptr.getNext();
        	rptr=rptr.getNext();
        	
        }
        return null;
    }
        
	
	public static void printMtxSpiral(int [][] mtx) {
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