package tw.zhenruyijewelry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.zhenruyijewelry.model.ProductList;
import tw.zhenruyijewelry.service.ProductListService;

@RestController
public class ProductListController {
	@Autowired
	ProductListService plService;
	@GetMapping(value="/golden/wring")
	public List<ProductList> allProductList(){
		return plService.allProductlist(null);
	}
}
