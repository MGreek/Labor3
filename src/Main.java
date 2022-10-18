import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Produkt> p = new Vector<Produkt>();
        p.add(new Produkt(1.15f, 5));
        p.add(new Produkt(14.30f, 7));
        p.add(new Produkt(15.49f, 12));
        p.add(new Produkt(6.05f, 30));
        p.add(new Produkt(8.99f, 1));
        p.add(new Produkt(12.27f, 15));
        p.add(new Produkt(22.77f, 21));
        p.add(new Produkt(11.13f, 100));
        p.add(new Produkt(90.50f, 3));
        p.add(new Produkt(120.12f, 8));
        Laden l = new Laden(p);
        System.out.print("Preis nach Rabatt: ");
        System.out.println(l.preisNachRabatt());
        System.out.println("Produkten die mehr als 100 kosten: ");
        for (Produkt pr : l.getTeuerProdukten())
        {
            System.out.print(pr.getPrice());
            System.out.print(' ');
            System.out.println(pr.getDayCount());
        }
        System.out.println("Produkten sortiert nach preis: ");
        for (Produkt pr : l.sortiereNachPreis())
        {
            System.out.print(pr.getPrice());
            System.out.print(' ');
            System.out.println(pr.getDayCount());
        }
        System.out.println("Guenstigste und teuerste Produkten: ");
        for (Produkt pr : l.teuersteGuenstingste())
        {
            System.out.print(pr.getPrice());
            System.out.print(' ');
            System.out.println(pr.getDayCount());
        }
    }
}