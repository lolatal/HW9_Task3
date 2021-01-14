package by.tms;

public class Apollo implements IStart{
    @Override
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
        System.out.println("Двигатели Apollo запущены. Все системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Старт Apollo");
    }
}
