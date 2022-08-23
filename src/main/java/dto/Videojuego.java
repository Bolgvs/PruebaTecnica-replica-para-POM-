package dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="videogame")
public class Videojuego {
	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="image")
	private String image; // I insert the image here, supposing that for the front-tend game image will be called from here

		
	// Constructors
	public Videojuego() {
		
	}
	
	/**
	 * @param id
	 * @param name
	 * @param image
	 */
	
	public Videojuego(Long id, String name, String image) {
		//super();
		this.id = id;
		this.name = name;
		this.image = image;
		
	}
	
	// Getters setters
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getImage() {
			return image;
		}

		public void setImage(String image) {
			this.image = image;
		}
		
		// To string
		@Override
		public String toString() {
			return "Videojuego [id=" + id + ", name=" + name + ", image=" + image + "]";
		}
		
}