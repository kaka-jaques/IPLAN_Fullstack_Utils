package br.com.kalil.objects;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "knowledge")
public class Knowledge {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String solution;
	private List<CauseItem> cause;
	private List<TypeItem> type;
	private String description;
	
}
