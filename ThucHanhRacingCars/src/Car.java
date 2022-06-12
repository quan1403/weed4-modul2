import java.util.Random;
import static Main.STEP;
import static Main.DISTANCE;

public class Car implements Runnable {

    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        int runDistance = 0;
        long startTime = System.currentTimeMillis();
        while (runDistance < DISTANCE){
            try {
                int speed = (new Random()).nextInt(20);
                runDistance += speed;
                String log ="|";
                int percentTravel = (runDistance * 100)/ DISTANCE;
                for (int i = 0; i < DISTANCE ;i+=STEP ) {
                    if (percentTravel >=1 +STEP){
                        log+= "=";
                    }else if (percentTravel >=1 && percentTravel < i + STEP){
                        log +="o";
                    }else {
                        log += "-";
                    }
                }
                log +="|";
                System.out.println("Car"+this.name+":"+log+""+Math.min(DISTANCE,runDistance)+"Km");
            }
        }
    }
}