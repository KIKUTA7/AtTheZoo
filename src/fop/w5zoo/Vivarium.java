package fop.w5zoo;

public class Vivarium {
    int area;
    int constructionYear;
    Animal [] inhabitants;
    public Vivarium(Animal[] inhabitants, int area, int constructionYear)
    {
        this.inhabitants = inhabitants;
        this.area = area;
        this.constructionYear = constructionYear;

    }
    public String toString () {
        return "[area: "+area+", constructionYear: "+constructionYear+", animals: "+inhabitants.toString()+"]";
    }
}
