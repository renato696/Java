public class Pumps extends Sensors{

    private int water_pump1;
    private int water_pump2;

    public void setWater_pump1(){
        water_pump1 = getPump1();
    }

    public void setWater_pump2(){
        water_pump2 = getPump2();
    }

    public void startPumps(){
        setWater_pump1();
        setWater_pump2();
    }

    public void pumpsStatus(){
        startPumps();
        if (water_pump1 == 1 || water_pump2 == 1){
            System.out.println("Bomba ligada, água sendo enviada para caixa superior");
        } else {
            System.out.println("Bombas desligadas");
        }
    }
}
