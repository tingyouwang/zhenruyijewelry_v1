package tw.zhenruyijewelry.service;

import java.util.List;

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
	public List<ProductList> allProductlist(String type){
		return plRepo.allProductlist(type);
	}
}
