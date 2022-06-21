package Ingenieria.Software.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table(name="departamento")

public class Departamento {

	@Id
	private int id;
	private String nombre;
	
	@OneToMany(mappedBy="Usuario",fetch=FetchType.EAGER)
	private List <Usuario> usuario;
	
	
	//Constructor por defecto 
	
	public Departamento() {}
	
	
	//Constructor
	
	public Departamento(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	//Getters and Setters

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
}
