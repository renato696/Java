public class Tank {
    
    private boolean level_1;
    private boolean level_2;
    private boolean level_3;
    private int flow1;


    public void setLevel_1(boolean level_1) {
        this.level_1 =  level_1;
    }
    
    public void setLevel_2(boolean level_2) {
        this.level_2 = level_2;
    }
    
    public void setLevel_3(boolean level_3) {
        this.level_3 = level_3;
    }
    
    public void setFlow(int flow) {
        this.flow1 = flow;
    }

    
    public void water_flow(){
        if (flow1 == 1) {
            System.out.println("Entrada de água da rua OK.");
        } else {
            System.out.println("Sem entrada de água da rua");
        }}

}
