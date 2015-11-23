//Jennifer Yu
//APCS1 pd9
//HW35 -- Put it together
//2015-11-22

import cs1.Keyboard;

public class Swapper {
    
    //TO PRINT THE ARRAY
    public static void print1( String[][] a ) { 
	    for (int x = 0; x < a.length; x++) { //for the x row
	        for (int y = 0; y < a[x].length; y++) { //for the y element
	            System.out.print(a[x][y] + "\t"); //print the element
	        }
	        System.out.println(""); //go to next line
	    }
    }
    
    public static void swap(String[][] a) {
        int row1 = 0;
        int col1 = 0;
        int row2 = 0;
        int col2 = 0;
        int swapp = 1;
        print1(a);
        while (swapp == 1) { //ASKS IF YOU WANT TO SWAP ANYTHING
            try {
                System.out.println("\n\nDo you want to swap?\n1: Yes\n2: No");
                swapp = Keyboard.readInt();
                //IF YOU DO WANT TO SWAP, THEN SWAP
                if (swapp == 1) {
                    //TAKES POSITIONS, STORES THEM, SWAPS
                    System.out.println("\n\nWhat do you want to swap?");
                    System.out.println("Row:");            
                    row1 = Keyboard.readInt();
                    row1 -= 1; //TO ACCOUNT FOR ROW 0
                    System.out.println("Column:");    
                    col1 = Keyboard.readInt();
                    col1 -= 1;
                    System.out.println("\n\nWhat do you want to swap it with?");                
                    System.out.println("Row:");   
                    row2 = Keyboard.readInt();
                    row2 -= 1;
                    System.out.println("Column:");          
                    col2 = Keyboard.readInt();
                    col2 -= 1;
                    String p1 = "";
                    String p2 = "";
                    p1 = a[row1][col1];
                    p2 = a[row2][col2];
                    a[row1][col1] = p2;
                    a[row2][col2] = p1;
                    }
            }
            //IF YOU MESS UP, IT WILL LET YOU TRY AGAIN (CONTINUES FROM WHERE YOU LEFT OFF)
            catch (Exception e) {
        		    System.out.println("\n\nTry again. Rows are 1-3. Columns are 1-3.");
        		    swap(a);
        	}
        	//PRINTS THE CHANGE
        	System.out.println("\n\nResult:");
            print1(a);
        }  
    }
    
    //TEST
    public static void main(String[] args) {
	    String [][] test = { {"hey", "sup", "dude"}, {"jenn", "jen", "jay"}, {"lol", "lmao", "rofl"} };
	    swap(test);
    }
    
    
}