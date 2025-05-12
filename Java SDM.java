%%writefile exceptionDemo3.java
class ExceptionDemo3
{
    public static void main(String args[])  // Changed 'atgs' to 'args'
    {
        try{
            int num = Integer.parseInt("13"); // RA2311026010650
            System.out.println(num);
        } catch(NumberFormatException e) {
            System.out.println("Number Format Exception occurred");
        }   
    }
}

class Error_Handling
{
    static void display()
    {
        try
        {
            throw new NullPointerException("Demo");
        
        }
        catch(NullPointerException e)
        {
            throw e
        }
    }
}
public static void main(String args[])
{
    try{
        display();
    }
    catch(NullPointerException e)
    {
        System.out.println(Recaught: " +e");
    }
}

class Error_Handling
{
    static void throwdemo() throws IllegalAccessExeption
    {

        System.out.println("Inside throwdemo");
    
    }
    public static void main(string args[])
    {
        try{
            throwdemo();
        }
        catch(IllegalAccessException e)
        {
            System.out.println("Caught "+ e);
        }
    }
}

