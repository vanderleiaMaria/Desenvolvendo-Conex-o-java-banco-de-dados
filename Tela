package tela;

import dao.ClientesDao;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javabeans.Clientes;
import javax.swing.*;

public class FormClientes extends JFrame implements ActionListener {

    //declaração publica dos objetos
    public static JLabel lblControleClientes, lblNome, lblEmail, lblTelefone;
    public static JTextField txtNome, txtEmail, txtTelefone;
    public static JButton btnSalvar;
    public static Container container;
    
    public static Font fntLabel = new Font("Tahoma",Font.BOLD,20);
    public static Font fntText = new Font("Verdana",Font.PLAIN,22);

    public FormClientes() {//método construtor

        super("Controle de clientes");
        
        //tamanho da janela
        setSize(800,600);
    //    setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
        //construção e configuração
        
        container = new Container();// adicionamdo container a janela jframe
        container.setLayout(null);
        this.add(container);
        
        lblControleClientes = new JLabel("Controle de Clientes");
        lblControleClientes.setFont(fntLabel);
        lblControleClientes.setBounds(100,30,300,30);
        container.add(lblControleClientes);
        
        lblNome = new JLabel("Nome");
        lblNome.setFont(fntLabel);
        lblNome.setBounds(15, 80, 100, 30);
        container.add(lblNome);
        
        lblEmail = new JLabel("Email");
        lblEmail.setFont(fntLabel);
        lblEmail.setBounds(15, 120, 100, 30);
        container.add(lblEmail);
        
        
        lblTelefone = new JLabel("Telefone");
        lblTelefone.setFont(fntLabel);
        lblTelefone.setBounds(15, 160, 100, 30);
        container.add(lblTelefone);
        
        txtNome = new JTextField();
        txtNome.setBounds(150, 80, 200, 30);
        container.add(txtNome);
        
        txtEmail = new JTextField();
        txtEmail.setBounds(150, 120, 200, 30);
        container.add(txtEmail);
        
        txtTelefone = new JTextField();
        txtTelefone.setBounds(150, 160, 200, 30);
        container.add(txtTelefone);
        
        
        
        btnSalvar = new JButton("Salvar");
        btnSalvar.addActionListener(this);
        btnSalvar.setBounds(150,230,200,30);
        container.add(btnSalvar);
        
       

        this.repaint(); //atualizando a pagina
        
        
        
    }

  
    public void actionPerformed(ActionEvent ae) {

        
        try{
             
         if ( ae.getSource()==btnSalvar){
    
           
           //guardadr os dados no obj cliente
           Clientes obj = new Clientes();
           obj.setNone(txtNome.getText());
           obj.setEmail(txtEmail.getText());
           obj.setTelefone(txtTelefone.getText());
         
           
           //criar objeto do tipo dao
           ClientesDao dao = new ClientesDao();
           dao.cadastrarCliente(obj);
           JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso");
         }
           
        }catch(Exception erro){
            
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar"+ erro);
            
        }
           
           }
    
}
