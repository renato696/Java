import java.time.Duration;
import java.time.LocalDateTime;

public class Pumps extends Sensors{

private int water_pump1;
private int water_pump2;

private LocalDateTime startTimePump1;
private LocalDateTime endTimePump1;

private LocalDateTime startTimePump2;
private LocalDateTime endTimePump2;

    public void setWater_pump1(){
        water_pump1 = getPump1();
        pump1WorkTime();
    }

    public void setWater_pump2(){
        water_pump2 = getPump2();
        pump2WorkTime();
    }

    public String isPump1OM() {
        if (water_pump2 == 1) {
            return "Bomba 2 está ligada.";
        } else if (water_pump1 == 0) {
            return "Bomba 2 está desligada.";
        } else {
            return "Estado desconhecido para Bomba 1.";
        }
    }

    public void pump1WorkTime(){
        if (water_pump1 == 1) {
            startTimePump1 = LocalDateTime.now();
            System.out.println("Bomba 1 ligada em: " + startTimePump1);
        } else {
            endTimePump1 = LocalDateTime.now();
            System.out.println("Bomba 1 desligada em: " + endTimePump1);
            calculateOperatingPump1Time();
        }
    }

    private void calculateOperatingPump1Time() {
        if (startTimePump1 != null && endTimePump1 != null) {
            Duration duration = Duration.between(startTimePump1, endTimePump1);
            long minutes = duration.toMinutes();
            System.out.println("Bomba 1 funcionou por: " + minutes + " minutos.");
            }
        }
  
    public String isPump2ON() {
        if (water_pump2 == 1) {
            return "Bomba 1 está ligada.";
        } else if (water_pump1 == 0) {
            return "Bomba 1 está desligada.";
        } else {
            return "Estado desconhecido para Bomba 1.";
        }
    }


    public void pump2WorkTime(){
        if (water_pump2 == 1) {
            startTimePump2 = LocalDateTime.now();
            System.out.println("Bomba 2 ligada em: " + startTimePump2);
        } else {
            endTimePump2 = LocalDateTime.now();
            System.out.println("Bomba 2 desligada em: " + endTimePump2);
            calculateOperatingPump1Time();
            }
    }
    
    private void calculateOperatingPump2Time() {
        if (startTimePump2 != null && endTimePump2 != null) {
            Duration duration = Duration.between(startTimePump2, endTimePump2);
            long minutes = duration.toMinutes();
            System.out.println("Bomba 2 funcionou por: " + minutes + " minutos.");
            }
        }

    public void startPumps(){
        setWater_pump1();
        setWater_pump2();
        }
}

