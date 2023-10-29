class Car{
    int accelaration;
    int speed;
    int distance;
    public void Car(){
        if(accelaration>0){
            speed++;
            distance++;
        }
    }
    public void setDistance(int d){
        distance = d;
    }
    public void setSpeed(int s){
        distance = s;
    }
    public void setAcceleration(int a){
        distance = a;
    }
    public int getDistance(){
        return distance;
    }
    public int getspeed(){
        return speed;
    }
    public int getAccerleration(){
        return accelaration;
    }
}
class BMW_Car extends Car{
    int brake;
    public void applyBrake(){
        speed--;
        distance--;
    }
}

public class inheritance1 {
    public static void main(String[] args) {
        
    }
}
