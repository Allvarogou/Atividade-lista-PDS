package controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class PrincipalController {

    @FXML
    private Menu menuAjuda;

    @FXML
    private Menu menuArquivo;

    @FXML
    private Menu menuCalculadora;

    @FXML
    private MenuItem menuPesquisa;

    @FXML
    private MenuItem menuSair;

    @FXML
    private MenuItem menuSobre;

    @FXML
    private MenuItem menuSomar;

    @FXML
    void btnPesquisaClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new 
        FXMLLoader(getClass().getResource("/fxml/PesquisaView.fxml"));
        Parent root = loader.load();
        
        Stage telaNova = new Stage();

        Scene scene = new Scene(root);

        telaNova.setTitle("Pesquisa");
        telaNova.setScene(scene);
        telaNova.show();
    }

    @FXML
    void btnSairClick(ActionEvent event) {
           // System.out.println(fecharSistema());
            
        if (fecharSistema()) {
        System.exit(0);
        }else{
            event.consume();
        }
    }

    @FXML
    void btnSobreClick(ActionEvent event) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Sobre");
        alerta.setHeaderText("Informações do Sistema");
        alerta.setContentText("Sistema desenvolvido na aula de PDS-1");
        alerta.showAndWait();
    }

    @FXML
    void btnSomarClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new 
        FXMLLoader(getClass().getResource("/fxml/SomarView.fxml"));
        Parent root = loader.load();
        
        Stage novaTela = new Stage();

        Scene scene = new Scene(root);

        novaTela.setTitle("Somar");
        novaTela.setScene(scene);
        novaTela.show();
    }
    public boolean fecharSistema(){
    Alert confirmar = new Alert(Alert.AlertType.INFORMATION);
    confirmar.setTitle("Confirmação");
    confirmar.setHeaderText("Tem certeza que quer fechar a aplicação?");
    confirmar.setContentText("Todas as informações não salvas serão perdidas");
    return confirmar.showAndWait().filter(response -> response == ButtonType.OK).isPresent();
    }

}
