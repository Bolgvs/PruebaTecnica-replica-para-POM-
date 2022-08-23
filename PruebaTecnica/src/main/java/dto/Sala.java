package dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="sala")
public class Sala {
	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="personas_maximas")
	private String personasMaximas; 

	// Constructors
	public Sala() {
		
	}
		
	/**
	 * @param id
	 * @param name
	 * @param personasMaximas
	 */
		
	public Sala(Long id, String name, String personasMaximas) {
		//super();
		this.id = id;
		this.name = name;
		this.personasMaximas = personasMaximas;
			
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

		public String getPersonasMaximas() {
			return personasMaximas;
		}

		public void setPersonasMaximas(String personasMaximas) {
			this.personasMaximas = personasMaximas;
		}
			
		// To string
		@Override
		public String toString() {
			return "Sala [id=" + id + ", name=" + name + ", personasMaximas=" + personasMaximas + "]";
		}
			
}

