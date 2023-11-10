public abstract class Site {
    public double TAX_RATE = 7;
    double _units = 10;
    double _rate= 15;

    double getBillableAmount(){
        double base = _units * _rate;
        double tax = base * TAX_RATE;
        return base + tax;
    };
}
