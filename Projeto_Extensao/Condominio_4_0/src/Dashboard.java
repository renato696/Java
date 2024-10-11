public class Dashboard {

    private Tank tank;
    private int tank_code;

    public Dashboard(Tank tank) {
        this.tank = tank;
    }

    public void currentTank_code(){
        tank_code = tank.getCode_dashboard();
        System.out.println(String.format("Codigo do Tanque: %d", tank_code));
    }
}
