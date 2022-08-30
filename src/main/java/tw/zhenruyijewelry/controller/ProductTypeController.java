package tw.zhenruyijewelry.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.node.ObjectNode;

import tw.zhenruyijewelry.model.ProductType;
import tw.zhenruyijewelry.service.ProductTypeService;

@RestController
public class ProductTypeController {
	@Autowired
	ProductTypeService ptService;
	//取得所有分類
	
	@GetMapping(value="/productlist" )
	@ResponseBody
	public String allProductType(){
		return ptService.allProductType().toString();
	}
}
