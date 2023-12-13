package Controllers;

import Domain.Utilizador;
import Model_Repository.UtilizadorRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class LoginController {

    private ArrayList<Utilizador> utilizadorSistema;

    public LoginController() throws FileNotFoundException {
        this.utilizadorSistema = new UtilizadorRepository("src/Files/login_grandesNegocios.csv").getUtilizadorSistema();
    }

    public boolean validarLogin(String tipoUser, String username, String password){

        for (Utilizador utilizadorAtual : this.utilizadorSistema){

            if (username.equals(utilizadorAtual.getUsername()) && password.equals(utilizadorAtual.getPassword()) && tipoUser.equals(utilizadorAtual.getTipoConta())){

                return true;

            }
        }
        return false;

    }
}
