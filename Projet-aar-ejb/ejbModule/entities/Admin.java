package entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Admin
 *
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Admin.findAll", query = "select a from Admin a"),
    @NamedQuery(name = "Admin.findByUsername", query = "select a from Admin a where a.login = :username")
})

public class Admin implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String login;
	private String password;
	private static final long serialVersionUID = 1L;

	public Admin() {
		super();
	}   
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}   
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
   
}
