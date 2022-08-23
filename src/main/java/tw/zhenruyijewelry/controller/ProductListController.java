package tw.zhenruyijewelry.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.util.http.parser.MediaType;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.node.ObjectNode;

import tw.zhenruyijewelry.model.ProductList;
import tw.zhenruyijewelry.service.ProductListService;

@RestController
public class ProductListController {
	@Autowired
	ProductListService plService;
	@GetMapping(value="/productlist/{material}/{type}")
	@ResponseBody
	public String allProductList(
			@PathVariable(name="material") String material, 
			@PathVariable(name="type") String type) {
		return plService.allProductlist(material,type).toString();
	}
}
