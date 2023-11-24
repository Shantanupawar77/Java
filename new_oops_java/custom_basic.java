
    class Coder{
        int id;
        String name;
        public void printDetails(){
            System.out.println("My name is "+ name);
            System.out.println("and my id is "+ id);
        }
        }

    public class custom_basic {
    public static void main(String[] args) {
        Coder shantanu= new Coder();
        Coder tejas= new Coder();

        shantanu.name="Shantanu Dhoni";
        shantanu.id=32;
        tejas.name="Tejas Pawar ";
        tejas.id=34;
        tejas.printDetails();
        shantanu.printDetails();
    }
}
