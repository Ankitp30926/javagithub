class HellowProgram{

    public static void main(String[] args){
System.out.println("Hello world!");
Animal h1= new Animal();
h1.setName("Dhanno");
h1.setAge(4);
h1.setFood("Green Gross");
h1.setWork("Gave Milk");

System.out.println(h1.getName());
System.out.println(h1.getAge());
System.out.println(h1.getFood());
System.out.println(h1.getWork());

}
}

class Animal{

private String name;
private int age;
private String food;
private String work;

public String getName() {return this.name;}
public int getAge() {return this.age;}
public String getFood() {return this.food;}
public String getWork() {return this.work;}

public void setName(String name) {this.name=name;}
public void setAge(int age) {this.age=age;}
public void setFood(String food) {this.food=food;}
public void setWork(String work) {this.work=work;}
}
