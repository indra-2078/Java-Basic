public class pattern {
    static void patterns(){
        for(int i = 10 ; i > 0; i--){
            for(int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        patterns();
    }
}
