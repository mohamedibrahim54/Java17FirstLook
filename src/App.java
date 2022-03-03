public class App {

    // Pattern-matching switch statement (Java 17 - preview)
    public static void displayObjectType(Object object){
        switch (object){
            case Integer i -> System.out.println("It's Integer");
            case String s -> System.out.println("It's String");
            case null -> System.out.println("The Object is null");
            default -> System.out.println("It's none of defined types");
        }
    }

    public static void displayObjectInformation(Object object){
        switch (object){
            case Integer i -> System.out.println("It's Integer");
            case String s && s.contains("d") -> System.out.println(s + "-> It's String contain d");
            case null -> System.out.println("The Object is null");
            default -> System.out.println("It's none of defined types");
        }
    }


    public static void enjoyConsumable(Consumable consumable){
        switch (consumable){
            case Coffee coffee -> coffee.addCream();
            case Tea tea -> tea.stirTea();
            default -> System.out.println("it's ready to go");
        }
        consumable.consume();
    }
    public static void main(String[] args) {
//        displayObjectType(5);
//        displayObjectType("Mohamed");
//        displayObjectType("Ibrahim");
//        displayObjectType(null);
//        displayObjectType(5f);
//
//        displayObjectInformation(5);
//        displayObjectInformation("Mohamed");
//        displayObjectInformation("Ibrahim");
//        displayObjectInformation(null);
//        displayObjectInformation(5f);


        Coffee coffee = new Coffee();
        Tea tea = new Tea();
        Beverage beverage = new Beverage();

        enjoyConsumable(coffee);
        enjoyConsumable(tea);
        enjoyConsumable(beverage);
    }
}
