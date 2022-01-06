package tw.zhenruyijewelry.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tw.zhenruyijewelry.model.ProductList;

public interface ProductListRepo extends JpaRepository<ProductList, Integer> {
	@Query(value="Select * from ProductList p where p.type= :type1" )
	public List<ProductList> allProductlist(@Param("type1") String type);
}
