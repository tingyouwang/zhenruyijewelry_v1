package tw.zhenruyijewelry.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tw.zhenruyijewelry.model.ProductList;

public interface ProductListRepo extends JpaRepository<ProductList, Integer> {
	@Query(value="from ProductList p where p.type= :type1 and p.material= :material1" )
	public List<ProductList> allProductlist( @Param("material1") String material,@Param("type1") String type);
	

	
}
