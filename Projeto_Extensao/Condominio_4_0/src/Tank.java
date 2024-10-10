public class Tank extends Sensors{
 
    public static boolean level_low;
    public static boolean level_medium;
    public static boolean level_high;
    public static boolean water_flow;
    
    public void setLevel_low(){
        level_low = getSensor1();
    }

    public void setLevel_medium(){
        level_medium = getSensor2();
    }

    public void setLevel_high(){
        level_high = getSensor3();
    }

    public void setWater_flow(){
        water_flow = getWater_pipe();
    }

    public void waterFlow(){
        if (water_flow == true){
            System.out.println("Entrada de água da rua ok!");       
        } else {
            System.out.println("Sem água da rua, atençao!");
        }
    }

    public void startTank(){
        setLevel_low();
        setLevel_medium();
        setLevel_high();
        setWater_flow();
        waterFlow();
    }

}
