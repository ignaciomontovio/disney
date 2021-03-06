package com.DisneyWorld.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity

//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@CrossOrigin("*")
//@JsonIdentityInfo(
//		  generator = ObjectIdGenerators.PropertyGenerator.class, 
//		  property = "id")
public class Genero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	private String imagen;
	
	@JsonBackReference
	@ManyToMany(mappedBy = "generos")
	private List<PeliculaSerie> peliculas;
	
	
	@Override
	public String toString() {
		String showMovies = "";
		
		if(peliculas != null)
			for (PeliculaSerie peliculaSerie : this.peliculas) {
				System.out.println(peliculaSerie.toString());
				showMovies=showMovies+peliculaSerie.toString();
			}
		return "Genero [id=" + id + ", nombre=" + nombre + ", imagen=" + imagen + ", peliculas=" + showMovies + "]";
		
	}

	public Genero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Genero(String nombre, String imagen) {
		super();
		this.nombre = nombre;
		this.imagen = imagen;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public Genero(Long id) {
		super();
		this.id = id;
	}

	public Genero(String nombre, String imagen, List<PeliculaSerie> peliculas) {
		super();
		this.nombre = nombre;
		this.imagen = imagen;
		this.peliculas = peliculas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public List<PeliculaSerie> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(List<PeliculaSerie> peliculas) {
		this.peliculas = peliculas;
	}

	
}
