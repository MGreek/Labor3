public class Produkt implements Comparable<Produkt> {
    private float basePrice;

    private int dayCount;

    public Produkt(float basePrice, int dayCount) {
        this.basePrice = basePrice;
        this.dayCount = dayCount;
    }

    public float getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }

    public int getDayCount() {
        return dayCount;
    }

    public void setDayCount(int dayCount) {
        this.dayCount = dayCount;
    }

    public float getPrice()
    {
        float price = basePrice;
        if ((10 <= dayCount) && (dayCount < 20))
            price *= 0.9;
        else if (dayCount >= 20)
            price *= 0.8;
        return nomalizePrice(price);
    }

    static public float nomalizePrice(float price)
    {
        int temp = (int) (price * 100);
        if ((temp % 10) % 5 != 0)
        {
            if ((temp % 10) > 5)
                temp += 10;
            temp -= (temp % 10) % 5;
        }
        return temp * 0.01f;
    }

    @Override
    public int compareTo(Produkt o) {
        return (int) ((getPrice() - o.getPrice()) * 100);
    }
}
