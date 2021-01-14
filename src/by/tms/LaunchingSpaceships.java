package by.tms;

public class LaunchingSpaceships {
    public static void main(String[] args) {
       Apollo apollo = new Apollo();
       Challenger challenger = new Challenger();
       USSEnterprise ussEnterprise = new USSEnterprise();
       Shuttle shuttle = new Shuttle();
       Cosmodrome cosmodrome = new Cosmodrome();
       System.out.println("Проверка космического корабля Apollo...");
       cosmodrome.launch(apollo);
       System.out.println("------------------------------");
       System.out.println("Проверка космического корабля Challenger...");
       cosmodrome.launch(challenger);
       System.out.println("------------------------------");
       System.out.println("Проверка космического корабля USS Enterprise...");
       cosmodrome.launch(ussEnterprise);
       System.out.println("------------------------------");
       System.out.println("Проверка космического корабля Shuttle...");
       cosmodrome.launch(shuttle);


    }
}
