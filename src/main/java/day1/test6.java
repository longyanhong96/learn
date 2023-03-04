package day1;

public class test6 {
    public static void main(String[] args) {
        int leve=9;
        for(int j=0;j<leve;j++){
            for(int i=0;i<leve-j;i++){
                System.out.print(" ");
            }
            for (int i=0;i<j*2+1;i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
