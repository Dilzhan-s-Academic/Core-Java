public class GenerateException{
    public static void main(String a[]){
        int i = 0;
        int j = 0;
        int result = 0;

        try{
            if(j == 0){
                // throw new exception
                throw new ArithmeticException("Dont do that again!!");
            }

            System.out.println("Dividing...");
            result = i / j;
            
            System.out.println("Result : " + result);
        }
        catch(ArithmeticException e){
            System.out.println("Cant Divid by Zero ::: " + e);
        }
        System.out.println();
        System.out.println("Good Bye!!");
    }
}