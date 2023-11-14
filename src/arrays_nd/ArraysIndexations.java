package arrays_nd;
class ArraysIndexations {

    public static void main(String[] args) {
        
    	System.out.println(new int[] { 1, 2, 3, 4, 5 }[0]); // 1
    	System.out.println(new int[] { 1, 2, 3, 4, 5 }[4]); // 5
        //System.out.println(new int[] { 1, 2, 3, 4, 5 }[5]); // ERROR
    	
    	System.out.println(new String[][] { 
            { "a", "b", "c" }, 
            { "x", "y", "z" } }[0][0]);    	// a
    	
    	
        for(String value : new String[][] { 
            { "a", "b", "c" }, 
            { "x", "y", "z" } }[1]){
        	System.out.print(value + ", "); // x, y, z,
        }
        
        System.out.println();
        System.out.println(new int[] { 0, 1, 2 }.length); // 3
        
        System.out.println(new String[][] { 
            { "a" }, 
            { "x", "y", "z" } }[0].length); // 1
        
        System.out.println(new String[][] { 
            { "a" }, 
            { "x", "y", "z" } }[1].length); // 3
        
        System.out.println(new String[][] { 
            { "a" }, 
            { "x", "y", "z" } }.length); // 2
    }
}