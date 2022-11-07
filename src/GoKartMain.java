public class GoKartMain {
    public static void main(String[] args) {
        GoKart hamilton = new GoKart("PURPLE");
        System.out.println("Hamilton: Laps Driven: " + hamilton.getLapsDriven());
        System.out.println("Hamilton: Drive()");
        hamilton.drive();
        System.out.println("Hamilton: Drive(5)");
        hamilton.drive(5);
        System.out.println("Hamilton: Laps Driven: " + hamilton.getLapsDriven());

        GoKart perez = new GoKart("RED");
        System.out.println("Perez: Laps Driven: " + perez.getLapsDriven());
        System.out.println("Perez: Drive(4)");
        perez.drive(4);
        System.out.println("Perez: Laps Driven: " + perez.getLapsDriven());

        System.out.println("Hamilton: Drive()");
        hamilton.drive();
        System.out.println("Perez: Drive(2)");
        perez.drive(2);
        System.out.println("Hamilton: Drive(3)");
        hamilton.drive(3);

        System.out.println("Hamilton: Laps Driven: " + hamilton.getLapsDriven());
        System.out.println("Perez: Laps Driven: " + perez.getLapsDriven());
    }
}
