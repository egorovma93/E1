public class Melon extends Fruits {

    public Melon(String name,String prise) // конструктор
    {
        super.setPrise(prise); // super - обр к предку (к фруктам)
        super.setName(name);
    }
    @Override
    public   void  Info(Fruits melon)
    {
        System.out.println("конфеты: Аленка") ;
        System.out.println(melon.name+" "+ melon.prise) ;
    }
}
