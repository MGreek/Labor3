import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class Laden {

    private Vector<Produkt> produkten;

    public Laden(Vector<Produkt> produkten) {
        this.produkten = produkten;
    }

    public Vector<Produkt> getProdukten() {
        return produkten;
    }

    public void setProdukten(Vector<Produkt> produkten) {
        this.produkten = produkten;
    }

    public float preisNachRabatt()
    {
        float sum = 0;
        for (Produkt p : produkten)
            sum += p.getPrice();
        return sum;
    }

    public Vector<Produkt> getTeuerProdukten()
    {
        Vector<Produkt> r = new Vector<>();
        for (Produkt p : produkten)
            if (p.getPrice() > 100)
                r.add(p);
        return r;
    }

    public Vector<Produkt> sortiereNachPreis()
    {
        Vector<Produkt> r = new Vector<>(produkten);
        Collections.sort(r);
        return r;
    }

    public Vector<Produkt> teuersteGuenstingste()
    {
        Vector<Produkt> r = new Vector<Produkt>();
        Vector<Produkt> temp = sortiereNachPreis();
        r.add(temp.firstElement());
        r.add(temp.lastElement());
        return r;
    }
}
