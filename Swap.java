public class Swap{
    public static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        swap(x,y);
    }
}