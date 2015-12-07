abstract public class Fruits {  //класс - предок

    protected String prise;
    protected String name;

    protected void setPrise(String prise)
    {
        this.prise=prise;
    } //установить размер
    protected void setName(String name)
    {
        this.name=name;
    } //установить имя

    protected String getSize()
    {
        return  prise;
    }

    abstract public  void  Info(Fruits Frukt) ;                        // абстр метод котор наслед у всех потомков

}
