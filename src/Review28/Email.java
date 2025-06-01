package Review28;

public class Email {
    public static void send(String to,String body){
        System.out.println(to + "に以下のメールを送信しました");
        System.out.println("件名：【件名なし】");
        System.out.println("本文：" + body);
    }
    public void send(String to,String subject,String body){
        System.out.println(to + "に以下のメールを送信しました。");
        System.out.println("件名：" + subject);
        System.out.println("本文：" + body);
    }
}
