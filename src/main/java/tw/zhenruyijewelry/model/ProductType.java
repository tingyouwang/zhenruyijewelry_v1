package tw.zhenruyijewelry.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="producttype")
@Component
public class ProductType {
	@Id @Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="material")
	private String material;
	@Column(name="type")
	private String type;
	@Column(name="typechinses")
	private String typechinses;
	@Column(name="materialchinese")
	private String materialchinese;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTypechinses() {
		return typechinses;
	}
	public void setTypechinses(String typechinses) {
		this.typechinses = typechinses;
	}
	public String getMaterialchinese() {
		return materialchinese;
	}
	public void setMaterialchinese(String materialchinese) {
		this.materialchinese = materialchinese;
	}
	
}
