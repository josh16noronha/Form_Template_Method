public abstract class Site {
    private double TAX_RATE = 7;
    private double _units = 10;
    private double _rate= 15;

    public double getBillableAmount(){
        return getBaseAmount() + getTaxAmount();
    }
    public double getBaseAmount(){
        double base = _units * _rate;
        return base;
    }

    public double getTaxAmount(){
        double tax = getBaseAmount() * TAX_RATE;
        return tax;
    }
}
