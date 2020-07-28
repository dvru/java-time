public class Person {

    public static void main(String[] args){

        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());

    }


    public String firstName;
    public String lastName;
    public int age;


    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age){
        if(age < 0 || age > 100){
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen() {
        if (age < 20 && age > 12) {
            return true;
        } else {
            return false;
        }
    }

    public String getFullName() {
        String name = "";
        if (firstName.isEmpty() && lastName.isEmpty()) {
            name = "";
        } else if (firstName.isEmpty()) {
            name = lastName;
        } else if (lastName.isEmpty()) {
            name = firstName;
        } else {
            name = firstName + " " + lastName;
        }
        return name;
    }






}
