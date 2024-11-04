package lesson17;

public class Person {
    private String name;
    private int age;
    private String hobby;

    public Person(String name, int age, String hobby){
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public Person(String john) {
    }

    public String toString(){
        return String.format("Person %s, Age: %d, Hobby: %s" ,name ,age, hobby);
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getHobby(){
        return hobby;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setHobby(String hobby){
        this.hobby = hobby;
    }

}
