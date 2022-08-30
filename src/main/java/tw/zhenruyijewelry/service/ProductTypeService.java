package tw.zhenruyijewelry.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.catalina.mapper.Mapper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import tw.zhenruyijewelry.model.ProductType;
import tw.zhenruyijewelry.repository.ProductTypeRepo;
@Service
@Transactional
public class ProductTypeService {
	@Autowired
	private ProductTypeRepo ptRepo;
	@Autowired 
	private ObjectMapper objectMapper;
	//第一層golden
	
	public ArrayList<JSONObject> allProductType() {
		List<JSONObject> result = new ArrayList<JSONObject>();
		JSONObject goldenjson = ProductTypeGolden();
		JSONObject platinumjson = ProductTypePlatinum();
		JSONObject diamondjson = ProductTypeDiamond();
		JSONObject couplejson = ProductTypeCouple();

		ArrayList<JSONObject> arrayList = new ArrayList<>();
		arrayList.add(goldenjson);
		arrayList.add(platinumjson);
		arrayList.add(diamondjson);
		arrayList.add(couplejson);
		
		return arrayList;
	}
	
	public JSONObject ProductTypeGolden() {
			
	List<ProductType> allProductType = ptRepo.ProductTypeGolden();
	//第一層json

	JSONObject json1 = new JSONObject();
	json1.put("materialchinese", allProductType.get(0).getMaterialchinese());
	json1.put("material", allProductType.get(0).getMaterial());
	//第二層json

	JSONObject json2 = new JSONObject();
	
	for(int i= 0;i<allProductType.size();i++) {
		json2.put("typechinses"+i, allProductType.get(i).getTypechinses());
		json2.put("type"+i, allProductType.get(i).getType());
	}

	json1.put("secondCategories", json2);
	return json1;

}
	
	public JSONObject ProductTypePlatinum() {
		
		List<ProductType> allProductType = ptRepo.ProductTypePlatinum();
		//第一層json
	
		JSONObject json1 = new JSONObject();

		json1.put("materialchinese", allProductType.get(0).getMaterialchinese());
		json1.put("material", allProductType.get(0).getMaterial());
		//第二層json
		
		JSONObject json2 = new JSONObject();
		
		for(int i= 0;i<allProductType.size();i++) {
			json2.put("typechinses"+i, allProductType.get(i).getTypechinses());
			json2.put("type"+i, allProductType.get(i).getType());
		}
		
		json1.put("secondCategories", json2);
		
		return json1;
	}
	
	public JSONObject ProductTypeDiamond() {	
		List<ProductType> allProductType = ptRepo.ProductTypeDiamond();
		
		JSONObject json1 = new JSONObject();
		json1.put("materialchinese", allProductType.get(0).getMaterialchinese());
		json1.put("material", allProductType.get(0).getMaterial());

		JSONObject json2 = new JSONObject();
		for(int i= 0;i<allProductType.size();i++) {
			json2.put("typechinses"+i, allProductType.get(i).getTypechinses());
			json2.put("type"+i, allProductType.get(i).getType());
		}
		
		json1.put("secondCategories", json2);
		
		return json1;
	}
	
	public JSONObject ProductTypeCouple() {
		
		List<ProductType> allProductType = ptRepo.ProductTypeCouple();
		//第一層json
		
		JSONObject json1 = new JSONObject();

		json1.put("materialchinese", allProductType.get(0).getMaterialchinese());
		json1.put("material", allProductType.get(0).getMaterial());
		//第二層json

		JSONObject json2 = new JSONObject();
		for(int i= 0;i<allProductType.size();i++) {
			json2.put("typechinses"+i, allProductType.get(i).getTypechinses());
			json2.put("type"+i, allProductType.get(i).getType());
		}
		
		json1.put("secondCategories", json2);
		
		return json1;
	}
}
