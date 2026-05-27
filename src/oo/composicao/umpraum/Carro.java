package oo.composicao.umpraum;

public class Carro {

	final Motor motor;
	
	Carro(){
		this.motor = new Motor(this);
	}
	
	void acelerar() {
		if(motor.fatorInjecao < 2.6) {
			motor.fatorInjecao += 0.4;			
		}
	}
	
	void freiar() {
		if(motor.fatorInjecao < 0.6) {return;}
		motor.fatorInjecao -= 0.4;
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligado() {
		motor.ligado = false;		
	}
	
	boolean estaligado() {
		return motor.ligado;
	}
}
