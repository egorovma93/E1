public class Person implements Comparable {  // implements - значит он использует коллекцию Comparable (Comparable - коллекция для сравнение элементов)

    public String Name; // имя
    public int age; // возраст
    public int tall; // рост

    public Person(String str, int a, int t) // конструктор
    {
        this.Name = str;
        this.age = a;
        this.tall = t;
    }
    public int compareTo(Object obj){
        Person p = (Person)obj; // созд экземпляр класса Person р  // (Person)obj - переменной типа  obj передаем нэйи возраст рост
        if(this.age<p.age){  // сравнивает текущего со следующим
            return -1;
        }
        if (this.age>p.age){
            return 1;
        }
        if(this.age==p.age){
            if (this.tall<p.tall){
                return -1;
            }
            if(this.tall>p.tall){
                return 1;
            }
            if (this.tall==p.tall){
                return 0;
            }
        }
        return 0;
    }
}
