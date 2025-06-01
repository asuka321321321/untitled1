package Review29;

public class Main {
    public static void main(String[] args){
        KeyInput keyInput = new KeyInput();
        System.out.print("宛先を入力＞");
        String to = keyInput.readString();
        System.out.print("件名を入力＞");
        String subject = keyInput.readString();
        System.out.print("本文を入力＞");
        String body =keyInput.readString();
        System.out.println(to + "に以下のメールを送信しました。");
        System.out.println("件名：" + subject);
        System.out.println("本文：" + body);
    }
}
