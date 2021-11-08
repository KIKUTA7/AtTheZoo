package fop.w5zoo;

public class Animal
{
    String name;
    int foodCosts;
    public Animal(String name, int foodCosts)
    {
        this.name=name;
        this.foodCosts = foodCosts;
    }
    public String toString () {
        return "("+"name:"+name+ ", foodCosts: "+foodCosts+")";
    }
}
