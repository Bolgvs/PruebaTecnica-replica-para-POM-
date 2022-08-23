package dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="mensaje")
public class Mensaje {
	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="sender")
	private String sender;
	@Column(name="text")
	private String text;
	@Column(name="hour")
	private int hour; 

	// Constructors
	public Mensaje() {
			
	}
			
	/**
	 * @param id
	 * @param sender
	 * @param text
	 * @param hour
	 */
			
	public Mensaje(Long id, String sender, String text, int hour) {
		//super();
		this.id = id;
		this.sender = sender;
		this.text = text;
		this.hour = hour;
				
	}
			
	// Getters setters
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}
				
		public String getSender() {
			return sender;
		}

		public void setSender(String sender) {
			this.sender = sender;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public int getHour() {
			return hour;
		}

		public void setHour(int hour) {
			this.hour = hour;
		}

		// To string
		@Override
		public String toString() {
			return "Sala [id=" + id + ", sender=" + sender + ", text=" + text + ", hour=" + hour + "]";
		}
}
