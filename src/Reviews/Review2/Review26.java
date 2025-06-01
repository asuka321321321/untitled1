package Reviews.Review2;

public class Review26 {
    public static void main(String[] args){
        int[] numArray = new int[]{10,12,14,16,18,20};
        int target = 10;//探索される値の代入
        int count = 0;
        for(int i = 0;i < numArray.length;i++){
            if(target == numArray[i]){
                count++;
            }
        }
        System.out.println("探索した値：" + target);
        System.out.println("一致した数：" + count);
    }
}
