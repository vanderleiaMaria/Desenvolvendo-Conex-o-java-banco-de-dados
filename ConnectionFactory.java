package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
    
    //implementando um método de uma classe connection 
    
    public Connection conecta(){
        
        //para conectar
        try {
            
            //faz a conexao
            return DriverManager.getConnection("jdbc:mysql://localhost/bdcadastro","root","");
        } catch (SQLException e) {
            
            throw new RuntimeException(e);
        }
        
    }
    
    
}
