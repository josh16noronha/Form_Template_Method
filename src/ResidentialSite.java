public class ResidentialSite implements Site{

    double _units = 10;
    double _rate= 15;

    @Override
    public double getBillableAmount() {
        double base = _units * _rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
