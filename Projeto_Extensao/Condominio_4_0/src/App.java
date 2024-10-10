public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Condominio 4.0");
    
//        Sensors sensors = new Sensors();
        Tank tank = new Tank();
//        Pumps pump = new Pumps();

        tank.startTank();

        System.out.println(Tank.level_low);
        System.out.println(Tank.level_medium);
        System.out.println(Tank.level_high);
        System.out.println(Tank.water_flow);
    }


}
