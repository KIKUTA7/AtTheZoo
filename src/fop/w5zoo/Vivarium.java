package fop.w5zoo;

public class Vivarium {
    private int area;
    private int constructionYear;
    private Animal [] inhabitants;
    public Vivarium(Animal[] inhabitants, int area, int constructionYear)
    {
        this.inhabitants = inhabitants;
        this.area = area;
        this.constructionYear = constructionYear;

    }
    public String toString () {
        return "[area: "+area+", constructionYear: "+constructionYear+", animals: "+inhabitants.toString()+"]";
    }
    public int getCosts()
    {
        return 900+area*area*100+area*area*(2019-constructionYear)*5;
    }
}
