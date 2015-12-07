import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /* 1task */
        System.out.println();
        System.out.println("1task:");

        System.out.println("Hello World!");
        String stroka="Hello";
        System.out.println(stroka);
        System.out.println();

        /* 2task */
        System.out.println("2task:");
        Method();  //вызов метода
        System.out.println(Method()); // печать
        System.out.println();

        /* 3task */
        System.out.println("3task:");
        Apple apple=new Apple(); //  экз
        apple.setCountry("Belarus"); // цвет
        apple.setPrise("high price");  // размер
        System.out.println("Яблоко \n Страна:" + apple.setCountry() + "\n Размер: " + apple.getSize()); // печтаем
        System.out.println();

        /* 5task */
        System.out.println("5task:");
        List<Fruits> Candies = new ArrayList<Fruits>();  // лист конфет
        Fruits orange=new Orange("Russia,","small price") ;  //  экз orange
        Candies.add(orange);  // в лист - orange
        Fruits melon=new Melon("Russia,","medium price"); //  экз melon
        Candies.add(melon); //добавл в лист - melon
        int count=0; //счетчик
        for(Fruits f:Candies){  //(как форич в шарпе)
            Candies.get(count).Info(f);  //обр к листу по индексу - get(count) и вызыв метод Info
            count++;
        }
        System.out.println();

        /* 6ask */
        System.out.println("6task:");
        Apple get=new Apple();
        System.out.println("Перегрузка");
        System.out.print("sin(n) = ");
        get.Get(5);
        System.out.print("n + m = ");
        get.Get(3,4);
        System.out.println();

         /* 8ask */
        System.out.println("8task:");
        int n = Test.StringSize(10);
        System.out.println(n);
        System.out.println("Exception");
        System.out.println();

        /* 9task */
        System.out.println("9task:");
        int []mass=new int[4]; // одномерный массив
        mass[0]=1;
        mass[1]=7;
        mass[2]=3;
        mass[3]=5;
        System.out.println("Сортировка");
        Sort (mass);
        for(int i=0;i<mass.length;i++)
        {
            System.out.println(mass[i]);
        }
        System.out.println();

        /* 10task */
        System.out.println("10task:");
        ArrayList<Person> list = new ArrayList<Person>() {};
        list.add(new Person("Алексей", 20, 183));
        list.add(new Person("Сергей", 19, 183));
        list.add(new Person("Андрей", 20, 165));
        list.add(new Person("Евгений", 21, 170));
        list.add(new Person("Вечеслав", 20, 175));
        list.add(new Person("Станислав", 20, 165));
        System.out.println("До сортировки:");
        for (int i=0; i<list.size(); i++) // выводим по листу данные
        {
            System.out.println(list.get(i).Name+" "+list.get(i).age+" "+list.get(i).tall);
        }
        System.out.println();

        SortPerson(list);

        System.out.println("После сортировки:");
        for (int i=0; i<list.size(); i++)
        {
            System.out.println(list.get(i).Name+" "+list.get(i).age+" "+list.get(i).tall);
        }
        System.out.println();
    }

    // task 2
    public static int Method()
    {
        int a=10;
        return a;
    }

    public static void Sort(int[] arr){
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    public static void SortPerson(ArrayList<Person> list)
    {
        for (int j = 0; j < list.size(); j++)
        {
            for (int i = j + 1; i < list.size(); i++)
            {
                if (list.get(i).compareTo(list.get(j)) < 0)
                {
                    Person temp = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, temp);
                }
            }
        }
    }
}
