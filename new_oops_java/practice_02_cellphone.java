class cellPhone{
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void ring(){
        System.out.println("ringing...");
    }
    public void callFriend(){
        System.out.println("call with Savta...");
    }
}
    public class practice_02_cellphone {
    public static void main(String[] args) {
        cellPhone vivo=new cellPhone();
        vivo.callFriend();
        vivo.vibrate();
        vivo.ring();
    }
}
