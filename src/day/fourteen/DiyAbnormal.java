package day.fourteen;

public class DiyAbnormal {
    public static void main(String[] args) {
        Abnormal in = new Abnormal();
        try {
            in.show(6);
        }catch(MyException e) {
            System.out.println(e.getMessage());
        }
    }

    static class MyException extends Exception{
        private String information;
        
        MyException(String information){
            this.information = information;
        }
        @Override
        public String getMessage() {
            return information;
        }
    }

    public static class Abnormal{
        final int A = 4;
        final int B = 0;
        public void show(int n) throws MyException {
            if (n > A || n < B) {
                MyException mY = new MyException("异常：ArrayIndexOutOfBoundsException，数组下标越界了");
                throw (mY);
            } else {
                System.out.println("程序正常执行");
            }
        }
    }
}
