class Employee{
    private int id;
    private String name;
    public Employee(){
        id = 23;
        name = "Default";
    }
    public Employee(int i, String n){
        id = i;
        name = n;
    }
    public void getDetails(){
        System.out.println("Name: "+ name);
        System.out.println("ID: "+ id);
    }
}

public class constructors {
    public static void main(String[] args) {
        Employee employee_1 =  new Employee(44, "Indra");
        employee_1.getDetails();
    }
}
