public class ifDemo {
    public static void main(String[] args) {
        int  a,b,c;
        a = 2;
        b = 3;
        if (a<b){
            System.out.println("a < b ");
        }

            if (a==b){
                System.out.println("your not see the text");
            }
                c = a - b;
                System.out.println("c = -1 " + c);
                if (c >= 0){
                    System.out.println("c not -");
                }
                if (c < 0){
                    System.out.println("c the -");
                }
        System.out.println();
                c = b - a;
                if (c >= 0){
                    System.out.println("c  not -");
                }
                if (c < 0){
                    System.out.println("c the -");
                }



    }
}
