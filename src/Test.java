/* 8ask */
public class Test {
    public static int StringSize(int s)
    {
        try{
            return s/0;
        }
        catch (Exception ex){
            System.out.print("error ");
            return -1;
        }
    }
}