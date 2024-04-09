package epsum.curso.chat;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;



public class VentanaBorderFlow extends Frame {
	
	private Panel pSuperior, pInferior, pCentral, pIzquierdoSuperior, pIzquierdoInferior;
	private Label lNick, lUsuarios, lMensaje;
	private Button bRegistrar, bEnviar;
	private TextArea taUsuarios, taMensajes;
	private TextField tNick, tMensaje;
	
	public VentanaBorderFlow () {
	
	setSize(1500, 1050);
	
	//Panel Superior
	pSuperior = new Panel();
	pSuperior.setBackground(Color.BLUE);
	bRegistrar = new Button("Registrar");
	tNick = new TextField(20);
	lNick = new Label("Nick: ");
	lNick.setBackground(Color.WHITE);
	
	pSuperior.add(lNick);
	pSuperior.add(tNick);
	pSuperior.add(bRegistrar);
	
	
	//Panel Inferior
	pInferior = new Panel();
	pInferior.setBackground(Color.BLUE);
	lMensaje = new Label("Mensaje: ");
	lMensaje.setBackground(Color.WHITE);
	tMensaje = new TextField(50);
	bEnviar = new Button("Enviar");
	
	pInferior.add(lMensaje);
	pInferior.add(tMensaje);
	pInferior.add(bEnviar);
	
	
	//Panel Central
	pCentral = new Panel();
	taMensajes = new TextArea(59, 140);
	
	pCentral.add(taMensajes);
	
	
	//Panel izquierdo superior
	pIzquierdoSuperior = new Panel();
	lUsuarios = new Label("Usuarios");
	
	pIzquierdoSuperior.add(lUsuarios);
	
	//Panel izquierdo inferior
	pIzquierdoInferior = new Panel();
	taUsuarios = new TextArea();
	
	pIzquierdoInferior.add(taUsuarios);
	
	BorderLayout borderLayout = new BorderLayout();
	add(pSuperior, borderLayout.NORTH);
	add(pInferior, borderLayout.SOUTH);
	add(pCentral, borderLayout.CENTER);
	add(pIzquierdoSuperior, borderLayout.WEST);
	add(pIzquierdoInferior, borderLayout.WEST);

	
	}
}
