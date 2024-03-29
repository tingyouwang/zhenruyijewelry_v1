package tw.zhenruyijewelry.service;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tw.zhenruyijewelry.model.ProductList;
import tw.zhenruyijewelry.repository.ProductListRepo;


@Service
@Transactional
public class ProductListService {
	@Autowired
	private ProductListRepo plRepo;
	//回傳 productname和 img
	public List<JSONObject> allProductlist(String material,String type){
		List<ProductList> allProductlist = plRepo.allProductlist(material,type);
		
		List<JSONObject> result = new ArrayList<JSONObject>();
		
		for (var product : allProductlist) {
			JSONObject json = new JSONObject();
			json.put("category", product.getMaterialChinese());
			json.put("type", product.getType());
			json.put("typeName", product.getTypeName());
			
			JSONObject json2 = new JSONObject();
			json2.put("imgName", product.getImg());
			
			json.put("productList", json2);

			result.add(json);
		}
		
		return result;
	}

}
