class Circle{
    private int radius;
    private int perimetere;
    private int area;
    public void setRadius(int r){
        radius = r;
    }
    public void setPeri(int p){
        if( p >radius){
            perimetere = p;
        }
        else{
            System.out.println("wrong input");
        }
    }
    public void setArea(int a){
        if (a > radius){
            area = a;
        }
        else{
            System.out.println("wrong input");
        }
    }
    public int getRadius(){
        return radius;
    }
    public int getArea(){
        return area;
    }
    public int getPeri(){
        return perimetere;
    }
    
}


public class prac {
    public static void main(String[] args) {
        Circle cr = new Circle();
        cr.setRadius(20);
        System.out.println(cr.getRadius());
        cr.setPeri(45);
        System.out.println(cr.getPeri());
        cr.setArea(33);
        System.out.println(cr.getArea());
    }
}
