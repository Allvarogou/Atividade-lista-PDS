package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class PesquisaController {
    
  private Stage stagePesquisa;
  RadioButton botaolinguagemSelecionado;
    ToggleGroup tgLinguagem = new ToggleGroup();
    
  ToggleButton botaoSOSelecionado;
  ToggleGroup tgSistemaOperacional = new ToggleGroup(); // lembrar do parenteses
                
     @FXML
    private Button btnFechar;

     @FXML
    private Button btnSubmeterPesquisa;

    @FXML
    private CheckBox chkGostaProgramar;

    @FXML
    private CheckBox chkProgramaTodoDia;

    @FXML
    private RadioButton rdC;

    @FXML
    private RadioButton rdJava;

    @FXML
    private RadioButton rdPython;

    @FXML
    private ToggleButton tbLinux;

    @FXML
    private ToggleButton tbMac;

    @FXML
    private ToggleButton tbWindows;

    @FXML
    private TextField tfNomeCompleto;
    
     @FXML
    void onClickBtnFechar(ActionEvent event) {
        if(stagePesquisa != null){
        stagePesquisa.close();
        }

    }
    
     @FXML
    void onClickBtnSubmeterPesquisa(ActionEvent event) {
        System.out.print("\n\n");
        if (!tfNomeCompleto.getText().isEmpty()) {
          System.out.print("Nome completo; " + tfNomeCompleto.getText()); // rever
        }
        
        botaoSOSelecionado = (ToggleButton) tgSistemaOperacional.getSelectedToggle();
         System.out.print("Sistema Operacional selecionado: ");
         System.out.println(botaoSOSelecionado == null ? "Nap selecionado" : botaoSOSelecionado.getText());
        
        botaolinguagemSelecionado = (RadioButton) tgLinguagem.getSelectedToggle();
         System.out.println("linguagem deprogramação preferido");
         if (botaolinguagemSelecionado != null) {
             System.out.println(botaolinguagemSelecionado.getText());
         } else{
             System.out.println("Nao selecionado");}
        
         System.out.print("Programa todo dia? ");
         System.out.print(chkProgramaTodoDia.isSelected() == true ? "Sim" : "Nao");
       
         if (chkGostaProgramar.isSelected()) {
             System.out.println("Sim");
         }else{ 
             System.out.println("Nao");}
    }

    @FXML
    void txtNomeCompleto(ActionEvent event) {
       
    }

    void setStage(Stage telaNova) {
        this.stagePesquisa = telaNova;
    }

   void ajustarElementosJanela(){
      tgLinguagem.getToggles().addAll(rdJava, rdPython, rdC);
       tbWindows.setToggleGroup(tgSistemaOperacional);
       tbLinux.setToggleGroup(tgSistemaOperacional);
       tbMac.setToggleGroup(tgSistemaOperacional);
   }
}
