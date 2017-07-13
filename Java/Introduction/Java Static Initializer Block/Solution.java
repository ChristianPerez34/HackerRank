// Java Static Initializer Block
// https://www.hackerrank.com/challenges/java-static-initializer-block

public static int B;
public static int H;
public static boolean flag;

static{
    Scanner input = new Scanner(System.in);
    B = input.nextInt();
    H = input.nextInt();
    if(B < 1 || H < 1){
        flag = false;
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
    else{
        flag = true;
    }
}