public sealed class Beverage implements Consumable permits Coffee, Tea{

    private double temperature;

    public double getTemperature() {
        return temperature;
    }

    public void heatUp(){
        temperature = 200.5;
    }

    @Override
    public void consume() {
        System.out.println("Consume beverage");
    }
}
