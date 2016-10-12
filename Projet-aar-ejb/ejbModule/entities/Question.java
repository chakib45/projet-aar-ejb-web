package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Question {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idQ;
	private String LaQuestion;
	private String prop1Q,prop2Q,prop3Q,prop4Q;
	public int getIdQ() {
		return idQ;
	}
	public void setIdQ(int idQ) {
		this.idQ = idQ;
	}
	public String getLaQuestion() {
		return LaQuestion;
	}
	public void setLaQuestion(String laQuestion) {
		LaQuestion = laQuestion;
	}
	public String getProp1Q() {
		return prop1Q;
	}
	public void setProp1Q(String prop1q) {
		prop1Q = prop1q;
	}
	public String getProp2Q() {
		return prop2Q;
	}
	public void setProp2Q(String prop2q) {
		prop2Q = prop2q;
	}
	public String getProp3Q() {
		return prop3Q;
	}
	public void setProp3Q(String prop3q) {
		prop3Q = prop3q;
	}
	public String getProp4Q() {
		return prop4Q;
	}
	public void setProp4Q(String prop4q) {
		prop4Q = prop4q;
	}
	
	

}
