public class Apple extends Fruits {

    String country;
    public void setCountry(String country)
    {
        this.country=country;
    }
    public String setCountry()
    {
        return country;
    }

    public  void Get(int n, int m)
    {
        System.out.println(n+m);
    }

    public void Get(int n)
    {
        System.out.println(Math.sin(n));
    }
    @Override
    public  void  Info(Fruits apple)
    {
        System.out.println(apple.name+" "+ apple.prise) ;
    }
}