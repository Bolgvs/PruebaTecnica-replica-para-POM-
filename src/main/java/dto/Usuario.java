package dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;	
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="usuario")
public class Usuario {
	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="username")
	private String username;
	@Column(name="steam_profile")
	private String steamProfile;
	@Column(name="epicgames_profile")
	private String epicgamesProfile;

				
	// Constructors
	public Usuario() {
			
	}
			
	/**
	 * @param id
	 * @param name
	 * @param steamProfile
	 * @param epicgamesProfile
	 */
			
	public Usuario(Long id, String name, String username, String steamProfile, String epicgamesProfile) {
		//super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.steamProfile = steamProfile;
		this.epicgamesProfile = epicgamesProfile;
				
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

		public String getUsername() {
			return username;
		}
			
		public void setUsername(String username) {
			this.username = username;
		}
		

		public String getSteamProfile() {
			return steamProfile;
		}

		public void setSteamProfile(String steamProfile) {
			this.steamProfile = steamProfile;
		}

		public String getEpicgamesProfile() {
			return epicgamesProfile;
		}

		public void setEpicgamesProfile(String epicgamesProfile) {
			this.epicgamesProfile = epicgamesProfile;
		}

		@Override
		public String toString() {
			return "Sala [id=" + id + ", name=" + name + ", username=" + username + ", steamProfile=" + steamProfile + ", epicgamesProfile=" + epicgamesProfile + "]";
		}
}