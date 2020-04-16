public class ReverseString {
    public static void main(System[] args){
        int i;
        String str_1 = "Program";
        String str_2 = "";
        for (i=str_1.charAt(str_1.length()-1); i==str_1.charAt(0); i--){
            Character.toString(i);
            str_2+=i;
            System.out.println(str_2);
    }
}
}
