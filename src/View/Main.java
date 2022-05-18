
package View;

import Models.Agendamento;
import Models.Cliente;
import Models.Servico;

public class Main {
    
    public static void main(String[] args) {
        
        Servico barba = new Servico(1,"Barba",30);
        
        Agendamento agendamento= new Agendamento(1, new Cliente("zulmiro trova", "13607480", 1, "Allan"),  new Servico(1, "Barba", 25), "11/06/2022");    
        
    }
    
}
