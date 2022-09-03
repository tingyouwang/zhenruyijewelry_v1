package tw.zhenruyijewelry.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity @Table(name="productlist")
@Component
public class ProductList {
	@Id @Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="material")
	private String material;
	@Column(name="material_chinese")
	private String materialChinese;
	@Column(name="type")
	private String type;
	@Column(name="type_name")
	private String typeName;
	@Column(name="img")
	private String img;


	
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}

	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getMaterialChinese() {
		return materialChinese;
	}
	public void setMaterialChinese(String materialChinese) {
		this.materialChinese = materialChinese;
	}

	
	
}
