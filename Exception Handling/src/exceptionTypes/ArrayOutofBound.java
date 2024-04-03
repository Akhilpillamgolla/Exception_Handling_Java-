package exceptionTypes;

public class ArrayOutofBound {
	
	public static void main(String args[])
    {
        try{
            int a[] = new int[3];
            a[0] = 1;
            a[1] = 2;
            a[2] = 3;
            
            System.out.println(a[0]);    //we can use for each loop to traverse 
            System.out.println(a[1]);
            System.out.println(a[2]);
            
            a[3] = 4; // accessing 8th element in an array of
                      // size given is only 3
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Array Index is Out Of Bounds");
        }
    }

}
