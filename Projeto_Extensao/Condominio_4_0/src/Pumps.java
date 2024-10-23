public class Pumps extends Sensors{

private int water_pump1;
private int water_pump2;
   
    public void setWater_pump1(){
        water_pump1 = getPump1();
    }

    public void setWater_pump2(){
        water_pump2 = getPump2();
    }

    public String isPump1OM() {
        if (water_pump1 == 1) {
            return "Bomba 1 está ligada.";
        } else if (water_pump1 == 0) {
            return "Bomba 1 está desligada.";
        } else {
            return "Estado desconhecido para Bomba 1.";
        }
    }

    public String isPump2ON() {
        if (water_pump1 == 1) {
            return "Bomba 1 está ligada.";
        } else if (water_pump1 == 0) {
            return "Bomba 1 está desligada.";
        } else {
            return "Estado desconhecido para Bomba 1.";
        }
    }








    public void startPumps(){
        setWater_pump1();
        setWater_pump2();
        }

}

