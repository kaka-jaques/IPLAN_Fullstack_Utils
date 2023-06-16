package br.com.kalil.objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "causeItem")
public class CauseItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Boolean isCPL;
	private Boolean isCPE;
	private Boolean isIsentoDeTaxa;
	private Boolean isIMSuspensa;
	private Boolean isGuiaPaga;
	
}
