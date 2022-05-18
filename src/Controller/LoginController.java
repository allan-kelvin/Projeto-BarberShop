
package Controller;

import Controller.Helper.LoginHelper;
import Models.Usuario;
import View.Login;

/**
 * @author Allan.Kelvin.Santos
 */
public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
        
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
    
    public void entrarNoSistema(){

        
        // 2º PESQUISA USUARIO NO BANCO;
        // 3º SE USUARIO DA VIEW TIVER O MESMO USUARIO VINDO DO BANCO, REDIRECIONAR PARA O MENU PRINCIPAL;
        // SENAO MOSTRAR MENSAGEM AO USUARIO "DE SENHA INVALIDA";
        
        
        // 1º PEGA USUARIO DA VIEW;
        Usuario usuario = helper.obterModelo();
        
        
    }
}
