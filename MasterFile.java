public class MasterFile {
    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        System.out.println(multiMethod(a,b));

    }

    public void firstMethod(){
        System.out.println("First method");
    }

    public void alphaMethod(){
//<<<<<<< HEAD
        System.out.println("Alpha Uploaded")
    }

    public void multiMethod(int num1, int num2){
       
        int result = num1 * num2;
        return result;
    }
}
//=======
        System.out.println("Alpha Uploaded");
    }

    public static int multiMethod(int num1, int num2){
        int result = num1 * num2;
        return result;
    }
}
//>>>>>>> beta
