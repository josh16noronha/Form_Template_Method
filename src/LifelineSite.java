public class LifelineSite extends Site {

    public LifelineSite(){
        super();
    }

    @Override
    public double getBaseAmount() {
        return super.getBaseAmount() * 0.5;
    }
    @Override
    public double getTaxAmount() {
        return super.getTaxAmount() * 0.2;
    }
}
