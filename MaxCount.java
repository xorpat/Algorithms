public class MaxCount {

    static int countMax(int[] data) {
        int max = data[0];
        for(int i = 0; i < data.length; i++) {
            if(data[i] > max) {
                max = data[i];
            }
        }
        int count=0;
        for (int i=0; i < data.length; i++) {
            if(data[i] == max) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int c = countMax(new int[] {3,2,4,7,3,-10,7});
        System.out.println(c);
    }

}
