package tw.zhenruyijewelry.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tw.zhenruyijewelry.model.ProductType;

public interface ProductTypeRepo extends JpaRepository<ProductType, Integer> {
	//第一層黃金
	@Query(value="from ProductType p where material='golden'")
	public List<ProductType> ProductTypeGolden();
	
	//第一層白金
	@Query(value="from ProductType p where material='platinum'")
	public List<ProductType> ProductTypePlatinum();
	//第一層鑽石
	@Query(value="from ProductType p where material='diamond'")
	public List<ProductType> ProductTypeDiamond();
	
	//第一層對戒
	@Query(value="from ProductType p where material='couple'")
	public List<ProductType> ProductTypeCouple();
	
}
