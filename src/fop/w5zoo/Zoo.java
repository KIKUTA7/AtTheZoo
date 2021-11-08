package fop.w5zoo;

public class Zoo {
    private Vivarium[] vivaria;
    public Zoo(Vivarium[] vivaria)
    {
       this.vivaria = vivaria;
    }
    public String toString()
    {
        String s="{";
        s+=vivaria[0].toString();
        for (int i=1;i<vivaria.length;i++)
        {
            s+=", ";
            s+=vivaria[i].toString();

        }
        s+="}";
        return s;
    }
    public int getCosts()
    {
        int sum=0;
        for (int i = 0; i < vivaria.length; i++) {
            sum+=vivaria[i].getCosts();
        }
        return sum;
    }
}
