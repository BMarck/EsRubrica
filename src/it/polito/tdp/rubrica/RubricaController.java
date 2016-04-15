package it.polito.tdp.rubrica;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.rubrica.model.RubricaModel;
import it.polito.tdp.rubrica.model.Voce;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RubricaController {
	
	 @FXML
	 private Label lblStato;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtMail;

    @FXML
    private TextField txtTel;

	private RubricaModel model;

    @FXML
    void doCerca(ActionEvent event) {
    	String nome=txtNome.getText();
    	if(nome.length()==0){
    		lblStato.setText("Dati mancanti");

    	}else {
    		
    		Voce v= model.findVoceByNome(nome);	
    		
    		if(v!=null){
    			txtMail.setText(v.getMail());
    			txtTel.setText(v.getTelefono());
    			lblStato.setText("Trovato");
    		}else{
    			txtMail.clear();;
    			txtTel.setText("");
    			lblStato.setText("NON Trovato");    			
    		}
    	}
    	

    }

    @FXML
    void doInserisci(ActionEvent event) {
    	
    	String nome= txtNome.getText();
    	String mail=txtMail.getText();
    	String tel=txtTel.getText();
    	
    	if(nome.length()==0 || (mail.length()==0 && tel.length()==0)){
    		lblStato.setText("Dati mancanti");
    		
    	}else{
    		boolean result=model.addVoce(new Voce(nome,mail,tel));
    		
    		if(result==false){
    			lblStato.setText("Voce gia in elenco");
    		}else
    			lblStato.setText("Voce inserita");
    	}
    	

    }

    public void setModel(RubricaModel model){
    	this.model=model;
    }
    
    @FXML
    void initialize() {
        assert txtNome != null : "fx:id=\"txtNome\" was not injected: check your FXML file 'Rubrica.fxml'.";
        assert txtMail != null : "fx:id=\"txtMail\" was not injected: check your FXML file 'Rubrica.fxml'.";
        assert txtTel != null : "fx:id=\"txtTel\" was not injected: check your FXML file 'Rubrica.fxml'.";

    }
}
