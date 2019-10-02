import java.sql.Connection;
import javax.swing.JOptionPane;
import jdbc.ConnectionFactory;
import tela.FormClientes;

public class Main {

    public static void main(String[] args) {

        //testando a conexao
        try {

            JOptionPane.showMessageDialog(null, "Testando a conexão");

            Connection con = new ConnectionFactory().conecta();
            
            JOptionPane.showMessageDialog(null,"Está conectado");

        } catch (Exception e) {
                 
            JOptionPane.showMessageDialog(null,"Erro"+e);
        }
            FormClientes tela = new FormClientes();
    }
                
}
