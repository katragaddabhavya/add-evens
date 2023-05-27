public class AddEven
{
    //Write the logic to add evens in the methods
    public long addEvens(int n)    {
        if(n<=0 || n==1)
            return 0;
        if(n%2!=0)
            return addEvens(n-1);
        return n+addEvens(n-1);
    }
    public static void main(String[] args) {
        // Initialize the object of AddEven class
        AddEven addEven = new AddEven();
        // Declare a variable to give as input to the addEvens method
        long a=addEven.addEvens(8);
        System.out.println("Addition of Even Numbers is:"+a);

        // Call the addEvens method and display the result

    }


}