import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pumpss extends Sensors {
    private int water_pump1;
    private int water_pump2;

    private LocalDateTime startTimePump1;
    private LocalDateTime endTimePump1;
    private long Pump1TotalWorkedTime;

    private LocalDateTime startTimePump2;
    private LocalDateTime endTimePump2;
    private long Pump2TotalWorkedTime;

    long Pump1TotalOffTime; // Tempo total desligada - Bomba 1
    long Pump2TotalOffTime;

    public DatabaseHelper dbHelper = new DatabaseHelper(); // Instância para salvar dados no banco

    // Configura a bomba 1
    public void setWater_pump1() {
        try {
            water_pump1 = getPump1();
            pump1WorkTime();
        } catch (Exception e) {
            System.err.println("Erro ao configurar a bomba 1: " + e.getMessage());
        } finally {
            System.out.println("Processamento da bomba 1 finalizado.");
        }
    }

    // Configura a bomba 2
    public void setWater_pump2() {
        try {
            water_pump2 = getPump2();
            pump2WorkTime();
        } catch (Exception e) {
            System.err.println("Erro ao configurar a bomba 2: " + e.getMessage());
        } finally {
            System.out.println("Processamento da bomba 2 finalizado.");
        }
    }

    // Operação da bomba 1
    public void pump1WorkTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        try {
            if (water_pump1 == 1) {
                startTimePump1 = LocalDateTime.now();
                System.out.println("Bomba 1 ligada em: " + startTimePump1.format(formatter));
            } else {
                endTimePump1 = LocalDateTime.now();
                System.out.println("Bomba 1 desligada em: " + endTimePump1.format(formatter));
                calculateOperatingPump1Time();
                dbHelper.savePumpOperation(1, startTimePump1, endTimePump1, Pump1TotalWorkedTime, Pump1TotalOffTime);
            }
            } catch (Exception e) {
            System.err.println("Erro durante a operação da bomba 1: " + e.getMessage());
          } finally {
            System.out.println("Operação da bomba 1 finalizada.");

            // Calcular tempo de desligamento
            calculateOffTimePump1();
           // Calcular tempo de operação
            calculateOperatingPump1Time();
            
                    }
                }
            
     // Cálculo do tempo total de operação da bomba 1
    private long calculateOperatingPump1Time() {
        try {
            if (startTimePump1 != null && endTimePump1 != null) {
                Duration duration = Duration.between(startTimePump1, endTimePump1);
                long minutes = duration.toMinutes();
                Pump1TotalWorkedTime += minutes;
                System.out.println("Tempo total acumulado de Bomba 1: " + Pump1TotalWorkedTime + " minutos.");
                return Pump1TotalWorkedTime;
            } else {
                System.out.println("Não foi possível calcular o tempo de operação para Bomba 1.");
                return Pump1TotalWorkedTime;
            }
        } catch (Exception e) {
            System.err.println("Erro ao calcular o tempo de operação da bomba 1: " + e.getMessage());
            return Pump1TotalWorkedTime;
        }
    }

    // Operação da bomba 2
    public void pump2WorkTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        try {
            if (water_pump2 == 1) {
                startTimePump2 = LocalDateTime.now();
                System.out.println("Bomba 2 ligada em: " + startTimePump2.format(formatter));
            } else {
                endTimePump2 = LocalDateTime.now();
                System.out.println("Bomba 2 desligada em: " + endTimePump2.format(formatter));
                calculateOperatingPump2Time();
                dbHelper.savePumpOperation(2, startTimePump2, endTimePump2, Pump2TotalWorkedTime, Pump2TotalOffTime);
            }
        } catch (Exception e) {
            System.err.println("Erro durante a operação da bomba 2: " + e.getMessage());
        } finally {
            System.out.println("Operação da bomba 2 finalizada.");
        }
    }




     // calcula o tempo que a bomba 1 está desligada
    private long calculateOffTimePump1() {
        try {
            if (startTimePump1 != null && endTimePump1 != null) {
                Duration duration = Duration.between(startTimePump1, endTimePump1);
                long minutes = duration.toMinutes();
                Pump1TotalOffTime += minutes;
                System.out.println("Tempo total desligada da Bomba 1: " + Pump1TotalOffTime + " minutos.");
                return Pump1TotalOffTime;
            } else {
                System.out.println("Não foi possível calcular o tempo de desligamento para a Bomba 1.");
                return Pump1TotalOffTime;
            }
        } catch (Exception e) {
            System.err.println("Erro ao calcular o tempo de desligamento da bomba 1: " + e.getMessage());
            return Pump1TotalOffTime;
        }
    }



    // calcula o tempo que a bomba 2 está desligada

    private long calculateOffTimePump2() {
        try {
            if (startTimePump2 != null && endTimePump2 != null) {
                Duration duration = Duration.between(startTimePump2, endTimePump2);
                long minutes = duration.toMinutes();
                Pump2TotalOffTime += minutes;
                System.out.println("Tempo total desligada da Bomba 2: " + Pump2TotalOffTime + " minutos.");
                return Pump2TotalOffTime;
            } else {
                System.out.println("Não foi possível calcular o tempo de desligamento para a Bomba 2.");
                return Pump2TotalOffTime;
            }
        } catch (Exception e) {
            System.err.println("Erro ao calcular o tempo de desligamento da bomba 2: " + e.getMessage());
            return Pump2TotalOffTime;
        }
    }

    // Cálculo do tempo total de operação da bomba 2
    private long calculateOperatingPump2Time() {
        try {
            if (startTimePump2 != null && endTimePump2 != null) {
                Duration duration = Duration.between(startTimePump2, endTimePump2);
                long minutes = duration.toMinutes();
                Pump2TotalWorkedTime += minutes;
                System.out.println("Tempo total acumulado de Bomba 2: " + Pump2TotalWorkedTime + " minutos.");
                return Pump2TotalWorkedTime;
            } else {
                System.out.println("Não foi possível calcular o tempo de operação para Bomba 2.");
                return Pump2TotalWorkedTime;
            }
        } catch (Exception e) {
            System.err.println("Erro ao calcular o tempo de operação da bomba 2: " + e.getMessage());
            return Pump2TotalWorkedTime;
        }
    }

    // Métodos públicos para obter os dados
    public long getPump1TotalWorkedTime() {
        return Pump1TotalWorkedTime;
    }

    public long getPump2TotalWorkedTime() {
        return Pump2TotalWorkedTime;
    }

    public String getPump1Status() {
        return water_pump1 == 1 ? "Ligada" : "Desligada";
    }

    public String getPump2Status() {
        return water_pump2 == 1 ? "Ligada" : "Desligada";
    }

    public void startPumps() {
        setWater_pump1();
        setWater_pump2();
    }

    public void simulatePumpOperations() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    
        try {
            // Simulação da Bomba 1
            System.out.println("Simulando operação da Bomba 1...");
            startTimePump1 = LocalDateTime.now();
            System.out.println("Bomba 1 ligada em: " + startTimePump1.format(formatter));
    
            // Simulando um tempo desligado de 1 minuto
            Thread.sleep(60000); // 1 minuto em milissegundos
            endTimePump1 = LocalDateTime.now();
            System.out.println("Bomba 1 desligada em: " + endTimePump1.format(formatter));
    
            // Calcular tempos
            calculateOperatingPump1Time();  // Calcula tempo ligado
            calculateOffTimePump1();       // Calcula tempo desligado
    
            // Salvar no banco de dados
            dbHelper.savePumpOperation(1, startTimePump1, endTimePump1, Pump1TotalWorkedTime, Pump1TotalOffTime);
    
            // Simulação da Bomba 2
            System.out.println("Simulando operação da Bomba 2...");
            startTimePump2 = LocalDateTime.now();
            System.out.println("Bomba 2 ligada em: " + startTimePump2.format(formatter));
    
            // Simulando um tempo desligado de 1 minuto
            Thread.sleep(60000); // 1 minuto em milissegundos
            endTimePump2 = LocalDateTime.now();
            System.out.println("Bomba 2 desligada em: " + endTimePump2.format(formatter));
    
            // Calcular tempos
            calculateOperatingPump2Time();  // Calcula tempo ligado
            calculateOffTimePump2();        // Calcula tempo desligado
    
            // Salvar no banco de dados
            dbHelper.savePumpOperation(2, startTimePump2, endTimePump2, Pump2TotalWorkedTime, Pump2TotalOffTime);
    
        } catch (InterruptedException e) {
            System.err.println("Erro na simulação: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Erro geral: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Simulação das operações das bombas finalizada.");
        }
    }
}