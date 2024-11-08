public class App {
    public static void main(String[] args) {
        System.out.println("Condominio 4.0");
    
        Sensors sensors = new Sensors();
        sensors.startSensors();

        Tank tank = new Tank();
        tank.startTank();

        Pumps pumps = new Pumps();
        pumps.startPumps();

        Dashboard dashboard = new Dashboard(tank);
        dashboard.currentTank_code();

    }

}
