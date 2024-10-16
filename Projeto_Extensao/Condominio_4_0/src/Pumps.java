import java.time.Duration;
import java.time.LocalDateTime;

public class Pumps extends Sensors{

    private int water_pump1;
    private int water_pump2;
    private LocalDateTime startPump1Time;
    private LocalDateTime startPump2Time;
    private long pump1Duration;
    private long pump2Duration;
    private long pump1TotalDuration;
    private long pump2TotalDuration;

    public Pumps() {
        this.water_pump1 = getPump1();
        this.water_pump2 = getPump2();
        this.pump1Duration = 0;
        this.pump2Duration = 0;
        this.pump1TotalDuration = 0;
        this.pump2TotalDuration = 0;

        if (water_pump1 == 1) {
            startPump1Time = LocalDateTime.now();
        }

        if (water_pump2 == 1) {
            startPump2Time = LocalDateTime.now();
        }
    }

    public void startPumpsChrono() {
        int newPump1Status = getPump1();
        if (newPump1Status == 1 && water_pump1 == 0) {
            startPump1Time = LocalDateTime.now();
        } else if (newPump1Status == 0 && water_pump1 == 1 && startPump1Time != null) {
            LocalDateTime endPump1Time = LocalDateTime.now();
            Duration elapsedTime = Duration.between(startPump1Time, endPump1Time);
            pump1Duration = elapsedTime.toMinutes();
            pump1TotalDuration += pump1Duration;
        }
        water_pump1 = newPump1Status;

        int newPump2Status = getPump2();
        if (newPump2Status == 1 && water_pump2 == 0) {
            startPump2Time = LocalDateTime.now();
        } else if (newPump2Status == 0 && water_pump2 == 1 && startPump2Time != null) {
            LocalDateTime endPump2Time = LocalDateTime.now();
            Duration elapsedTime = Duration.between(startPump2Time, endPump2Time);
            pump2Duration = elapsedTime.toMinutes();
            pump2TotalDuration += pump2Duration;
        }
        water_pump2 = newPump2Status;
    }

    public long getPump1Duration() {
        return pump1Duration;
    }

    public long getPump2Duration() {
        return pump2Duration;
    }

    public long getPump1TotalDuration() {
        return pump1TotalDuration;
    }

    public long getPump2TotalDuration() {
        return pump2TotalDuration;
    }


    public void setWater_pump1(){
        water_pump1 = getPump1();
    }

    public void setWater_pump2(){
        water_pump2 = getPump2();
    }

    public void startPumps(){
        setWater_pump1();
        setWater_pump2();
        startPumpsChrono();
    }
}

