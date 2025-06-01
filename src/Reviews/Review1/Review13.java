package Reviews.Review1;

public class Review13 {
    public static void main(String[] args) {
        double randomNum = Math.random() * 4;
        int fortune = (int)randomNum;
        switch (fortune) {
            case 1:
                System.out.println("大吉");
                break;
            case 2:
                System.out.println("中吉");
                break;
            case 3:
                System.out.println("小吉");
                break;
        }
    }
}
