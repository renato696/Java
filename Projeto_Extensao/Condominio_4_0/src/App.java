public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Condominio 4.0");
    
        Sensors sensors = new Sensors();
        sensors.startSensors();

        Tank tank = new Tank();
        tank.startTank();

        Dashboard dashboard = new Dashboard(tank);
        dashboard.currentTank_code();

    }


}
