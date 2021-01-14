package by.tms;

public class Shuttle implements IStart{
    public boolean checkSystem() {
        int a = (int) (Math.random()*11);
        if(a>3){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void activateEngine() {
        System.out.println("Двигатели Shuttle запущены. Все системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Старт Shuttle");
    }
}
