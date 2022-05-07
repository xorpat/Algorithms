package Searching;



public class SeqSearch {
    public static int searchMethod(int[] A,int x) {
        int idx = -1;
        for(int i = 0; i < A.length-1; i++) {
            if(A[i] == x) {
                idx = i;
                break;
            }
        }

        return idx;
    }
    public static void main(String[] args) {
        int[] A = new int[10];

        for(int i = 0; i < A.length; i++) {
            A[i] = (int) Math.floor(Math.random() * 10);
            System.out.printf("%d ", A[i]); 
        }

        System.out.println("The result is " + searchMethod(A,100));

    }
}
