package day1;

public class test {
    public static void main(String[] args) {
        System.out.println(1+2);//3
        System.out.println(1-2);//-1
        System.out.println(3*2);//6
        System.out.println(4/2);//2
        System.out.println((2+4)/2);//3
        int i=1;
        int j=i;
        System.out.println("i="+i);
        int a=1;
        int b=a++;
        System.out.println("b="+b);
        int c=1;
        c *=2;
        System.out.println("c="+c);
        int d=10;
        int f=15;
        System.out.println(d>f);
        int h=10;
        boolean resul =(i<5)&(i>15);
        System.out.println(resul);
        int n=10;
        int m=15;
        int k=(n==10)?1+1:2+2;
        System.out.println(k);
    }
}
