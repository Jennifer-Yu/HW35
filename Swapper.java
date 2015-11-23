//Jennifer Yu
//APCS1 pd9
//HW35 -- Put it together
//2015-11-22

public class Swapper {
    
    public static void print1( String[][] a ) { 
	    for (int x = 0; x < a.length; x++) { //for the x row
	        for (int y = 0; y < a[x].length; y++) { //for the y element
	            System.out.print(a[x][y] + "\t"); //print the element
	        }
	        System.out.println(""); //go to next line
	    }
    }
    
    public static void main(String[] args) {
	    String [][] test = { {"hey", "sup", "dude"}, {"jenn", "jen", "jay"}, {"lol", "lmao", "rofl"} };
	    print1(test);
    }
    
    
}