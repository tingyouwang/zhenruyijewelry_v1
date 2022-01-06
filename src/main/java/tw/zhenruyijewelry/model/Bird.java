package tw.zhenruyijewelry.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity @Table(name="Bird")
@Component
public class Bird {
	@Id @Column(name = "BID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	@Column(name = "bname")
	private String bname;
	@Column(name = "size")
	private String size;
	@Column(name = "color")
	private String color;
	@Column(name = "age")
	private int age;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	
}
