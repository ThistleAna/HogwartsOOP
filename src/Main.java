public class Main {
    // main method starts here
    public static void main(String[] args) {
        // create object from Main class
        Person obj = new Person("Harry", "Potter", 10, "Gryffindor");
        System.out.println("First Name = " + obj.fName);
        System.out.println("Last Name = " + obj.lName);
        System.out.println("Age = " + obj.age);
        System.out.println("House = " + obj.house);


        // create student 2
        Person obj2 = new Person("Ron", "Weasley", 10, "Gryffindor");
        System.out.println("First Name = " + obj2.fName);
        System.out.println("Last Name = " + obj2.lName);
        System.out.println("Age = " + obj2.age);
        System.out.println("House = " + obj2.house);

        // 
    }
}
