package Reviews.Reviews2;

public class Review25 {
    public static void main(String[] args){
        int[] numArray;
        numArray = new int[] {11,12,13,14,15};
        int sum = 0;
        for(int i = 0;i < numArray.length;i++){
            sum += numArray[i];
        }
        System.out.println("結果：" + sum);
    }
}
