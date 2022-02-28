package fop.w5zoo;

public class Animal
{

    private String name;
    private int foodCosts;
    public Animal(String name, int foodCosts)
    {
        this.name=name;
        this.foodCosts = foodCosts;
    }

    public int getFoodCosts() {
        return foodCosts;
    }

    public String getName() {
        return name;
    }

    public String toString () {
        return "("+"name:"+name+ ", foodCosts: "+foodCosts+")";
    }
}
