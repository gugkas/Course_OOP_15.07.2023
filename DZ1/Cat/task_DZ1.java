package DZ1.Cat;

public class task_DZ1 {
    public static void main(String[] args) 
    {
        new Cat("Барсик ", 5);
        System.out.println("Мяу, меня зовут: " + Cat.getName() + "мне " + Cat.age + " лет");

    }
}

class Cat 
{

    public static String getAge;
    private static String name;
    static int age;

    public Cat(String name, int age)
    {
        Cat.name = name;
        Cat.age = age;
    }

    public void setName(String name) 
    {
        Cat.name = name;
    }

    public void setAge(int age) 
    {
        Cat.age = age;
    }

    public static String getName() 
    {
        return name;
    }

    public double getAge() 
    {
        return age;
    }


}
