public class Orange extends Fruits {
    //public String size="small";
    public Orange(String name,String prise)
    {
        super.prise=prise; // super - обр к предку (к фруктам)
        //this.prise=prise; // this - обр в данный класс
        super.name=name;
    }
    @Override
    public  void  Info(Fruits orange) // создаем экз класа Fruits
    {
        System.out.println("конфеты: Три медведя") ;
        System.out.println(orange.name+" "+ orange.prise) ;
    }
}
