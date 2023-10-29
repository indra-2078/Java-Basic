class Phone{
    public void on(){
        System.out.println("Turning on phone...");
    }
    public void off(){
        System.out.println("Turning off phone...");
    }
}
class SmartPhone extends Phone{
    @Override
    public void on(){
        System.out.println("Turning on Smartphone...");
    }
    public void playMusic(){
        System.out.println("Playing Music...");
    }
}


public class dyn_meth_disp{
    public static void main(String[] args) {
        Phone a = new SmartPhone();
        a.on();
    }
}