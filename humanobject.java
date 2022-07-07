
class HellowProgram{

    public static void main(String[] args){
System.out.println("Hello world!");
Human h1= new Human();
h1.setName("Ankit");
h1.setAge(22);
h1.setAddress("Mumbai");

System.out.println(h1.getName());
System.out.println(h1.getAge());
System.out.println(h1.getAddress());

}
}

class Human{

private String name;
private int age;
private String address;

public String getName() {return this.name;}
public int getAge() {return this.age;}
public String getAddress() {return this.address;}

public void setName(String name) {this.name=name;}
public void setAge(int age) {this.age=age;}
public void setAddress(String address) {this.address=address;}
}
