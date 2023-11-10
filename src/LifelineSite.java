public class LifelineSite implements Site{
    double _units = 10;
    double _rate= 15;
    @Override
    public double getBillableAmount() {
        double base = _units * _rate * 0.5;
        double tax = base * Site.TAX_RATE * 0.2;
        return base + tax;
    }
}
