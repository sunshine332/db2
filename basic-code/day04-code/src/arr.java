public class arr {
    public static void main(String[] args) {
        int[] num = new int[]{6,4,8,2,9};
      /*  int min=num[0];
        int max=num[1];*/
    /*    for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
    }
        System.out.println("");
        for (int min = 0, max = num.length - 1; min < max; min++, max--) {
            int temp = num[min];
            num[min] = num[max];
            num[max] = temp;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }*/
        int max =num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i]>max){
                max=num[i];
            }
        }
        System.out.println(max);
    }
}
