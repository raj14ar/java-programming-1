package JavaAssignment1;

class CustomException extends Exception {
    public CustomException(){
        System.out.println("Oops! String Value is Passed");
    }
}
public class Question8<T> {
    public Integer fun(Integer num){
        return (num*2)/3;
    }
    public Double fun(Double num){
        return (num*2)/3;
    }
    public Long fun(Long num){
        return (num*2)/3;
    }
    public Float fun(Float num){
        return (num*2)/3;
    }
    public String fun(String num) {
        try {
            throw new CustomException();
        }
        catch (CustomException e){
            // Exception is caught
        }
        return "";
    }
    public static void main(String[] args) {
        // calling using number
        int i=150;
        Question8 quest = new Question8();
        System.out.println(quest.fun(i));
        double d=452.36;
        System.out.println(quest.fun(d));
        long l=15687l;
        System.out.println(quest.fun(l));
        //calling using string
        String str ="abc";
        System.out.println(quest.fun(str));
    }
}
