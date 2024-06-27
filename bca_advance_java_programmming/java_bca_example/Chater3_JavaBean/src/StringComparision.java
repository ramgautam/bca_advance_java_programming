public class StringComparision {
    public static void main(String args[]){

        String test="DivyaGyan";
        String test1= new String("DivyaGyan");
        String test2= test1;


        System.out.println("==<><><"+ (test1==test2));
        System.out.println("==<><><"+ (test==test1));
        System.out.println("equals<><><"+ (test.equals(test1)));
    }
}
