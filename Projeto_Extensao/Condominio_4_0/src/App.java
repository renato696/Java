public class App {
    public static void main(String[] args) {
        System.out.println("Condominio 4.0");
    
        Sensors sensors = new Sensors();
        sensors.startSensors();

        Tank tank = new Tank();
        tank.startTank();

        Pumpss pumps = new Pumpss();
        pumps.startPumps();

        Dashboard dashboard = new Dashboard(tank);
        dashboard.refreshDashboard();


    }

}
