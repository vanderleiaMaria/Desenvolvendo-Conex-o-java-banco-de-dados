package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javabeans.Clientes;
import jdbc.ConnectionFactory;


public class ClientesDao {
    
    //atributo que recebe a conexao
    private Connection conecta;
    
    //construtor, instacia o objeto e já executado
    public ClientesDao(){
        
        this.conecta = new ConnectionFactory().conecta();
        
        
    }
      //metodo para cadastrar o cliente
    public void cadastrarCliente(Clientes obj){
        
        try {
           
            //comando sql
           
            String cmdsql = "insert into cliente(none,email,telefone) values (?,?,?)";
       
        //organizar o comando e executa-lo
        PreparedStatement stmt = conecta.prepareStatement(cmdsql);
        stmt.setString(1, obj.getNone());
        stmt.setString(2,obj.getEmail());
        stmt.setString(3,obj.getTelefone());
        
        
        //executar o comando
        stmt.execute();
        
        
        stmt.close();
        
        }catch (SQLException erro) {
            throw new RuntimeException(erro);
            
        }
    
    }
    
    
    
}
