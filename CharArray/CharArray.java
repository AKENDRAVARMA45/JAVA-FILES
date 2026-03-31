public class CharArray {
    public static void main(String[] args){
        char arr[] = new char[5];
        arr[0] = 'A';
        arr[1] = 'P';
        arr[2] = 'D';
        arr[3] = 'P';
        arr[4] = 'D';

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
