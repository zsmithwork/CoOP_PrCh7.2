package programmingchallenge11_3;

public class RetailItem {
    private String description;
    private int unitsOnHand;
    private double price;

    public RetailItem() {
        description = "\0";
        unitsOnHand = 0;
        price = 0.0;
    }
    public RetailItem(String s, int i,double d) throws NegativeValue, NegativePrice {
        if (i < 0)
            throw new NegativeValue(i);
        if (d < 0)
            throw new NegativePrice(d);
        description = s;
        unitsOnHand = i;
        price = d;
    }
    public void setDesc(String s) {
        description = s;
    }
    public void setUnits(int i) {
        unitsOnHand = i;
    }
    public void setPrice(double d) {
        price = d;
    }
    public String getDesc() {
        return description;
    }
    public int getUnits() {
        return unitsOnHand;
    }
    public double getPrice() {
        return price;
    }
}
