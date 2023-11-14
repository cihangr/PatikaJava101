
public class Main {
    public static void main(String[] args) {
        int[] list ={1,3,4,6,7,8,12,13,65,23,67,99,84,14};
        int sum=0;
        for (int i=0; i<list.length; i++){
            sum+=list[i];
        }
        System.out.println(sum/list.length);
    }
}
