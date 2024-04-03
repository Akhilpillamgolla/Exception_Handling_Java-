package CustomException;

@SuppressWarnings("serial")     //unique identifier for each class
class DrivingLicence  extends Exception       //class with user defined exception
{  
    public DrivingLicence (String str)  
    {  
        super(str);    //calling constructor of parent method
    }  
}  
    
public class CustomException         //class that deals with custom exception with DrivingLicence
{  
  
    static void validate (int age) throws DrivingLicence{      //method that is used to throw exception by collecting value from try block 
   
    	if(age < 18){              //if age is less than 18 then  it throws exception
  
        throw new DrivingLicence("age is not valid to DrivingTest");    // Throws Exception Message
    }  
       else {   
        System.out.println(" Congratulation Your Elgible for  Driving Licence");   // if condition is not satisfied then  this will execute
        }    
     }    
  
    public static void main(String args[])  //main 
    {  
        try  
        {  
            validate(21);  //giving value to method 
        }  
        catch (DrivingLicence ex)     //catching custom exception
        {  
            System.out.println("Caught the exception");   //if exception is there then we will get this message 
    
            System.out.println("Exception occured: " + ex);   // with exception message
        }  
  
        System.out.println(" Have a nice day ");    //if no exception then this will execute
    }  
}  