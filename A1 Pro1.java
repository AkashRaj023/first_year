public class Main {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int k=0;
        int c=0;
        if(n>2) {
            while (n > 2) {
                n = n / 2;
                c = c + 1;
            }
            System.out.println(k + "is divisible by 2" +c+ "times");
        }
            else
            {
                System.out.println(k+"is divisible by 2");
            }
        }
    }
