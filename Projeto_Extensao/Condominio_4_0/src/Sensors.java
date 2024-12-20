public class Sensors {
   
    private int sensor1 = 0;
    private int sensor2 = 1;
    private int sensor3 = 1;
    private int water_pipe = 1;

    private int pump1 = 1;
    private int pump2 = 0;


    public int getSensor1() {
        return sensor1;
    }

    public int getSensor2() {
        return sensor2;
    }

    public int getSensor3() {
        return sensor3;
    }

    public int getWater_pipe() {
        return water_pipe;
    }

    public int getPump1() {
        return pump1;
    }
    
    public int getPump2() {
        return pump2;
    }


    public void startSensors(){
        System.out.println(String.format("Sensor 1 status: %d", sensor1));
        System.out.println(String.format("Sensor 2 status: %d", sensor2));
        System.out.println(String.format("Sensor 3 status: %d", sensor3));
        System.out.println(String.format("Sensor flow status: %d", water_pipe));
        System.out.println(String.format("Pump1 status %d", pump1));
        System.out.println(String.format("Pump2 status %d", pump2));
    }
}