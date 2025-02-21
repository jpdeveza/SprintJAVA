package br.com.chatbot;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "direcao")

public class Direção {
	

	
	public class Direcao {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "tipo")
	    private String tipo;

	    @Column(name = "diametro_minimo_giro")
	    private double diametroMinimoGiro;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public double getDiametroMinimoGiro() {
			return diametroMinimoGiro;
		}

		public void setDiametroMinimoGiro(double diametroMinimoGiro) {
			this.diametroMinimoGiro = diametroMinimoGiro;
		}

	
	}
}
