package by.tms;

public class Cosmodrome {

    public boolean launch(IStart iStart){
        if(iStart.checkSystem()){
            System.out.println("Предстартовая проверка прошла успешна");
            iStart.activateEngine();
            int[] countdown = new int [] {10,9,8,7,6,5,4,3,2,1};
            for(int i=0; i<countdown.length; i++){
                System.out.print(countdown[i] + "...");
            }
            System.out.println();
            iStart.start();
            return true;
        } else {
            System.out.println("Предстартовая проверка провалена");
            return false;
        }
    }
}


