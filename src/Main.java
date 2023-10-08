public class Main {
    public static void main(String[] args) {

        Order order = new Order();


        Confectionery cakeWithIcing = new IcingDecorator(new Cake(), "Chocolate");
        Confectionery cookieWithFilling = new FillingDecorator(new IcingDecorator(new Cookie(), "Vanilla"), "Strawberry");
        Confectionery chocolateWithSprinkles = new SprinkleDecorator(new Chocolate(), "Rainbow");

        order.addConfectionery(cakeWithIcing);
        order.addConfectionery(cookieWithFilling);
        order.addConfectionery(chocolateWithSprinkles);


        order.printOrder();
    }
}