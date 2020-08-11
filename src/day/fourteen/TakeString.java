package day.fourteen;

public class TakeString {
    public static void main(String[] args) {
        String msg = "12342 + 2342 = ?";
        int first = Integer.parseInt(msg.substring(0,msg.indexOf('+')).trim());
        int msg0 = msg.indexOf('+');
        String msg1 = msg.substring(0, msg0);
        String msg2 = msg1.trim();
        int num1 = Integer.parseInt(msg2);
        int end = Integer.parseInt(msg.substring(msg0+1).replaceAll("=", "").
                replaceAll("\\?", "").trim());

        int sum = first + end;
        System.out.println(first+end);


    }
}
