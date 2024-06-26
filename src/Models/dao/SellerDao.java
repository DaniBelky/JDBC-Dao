package Models.dao;

import java.util.List;

import ModelsEntities.Department;
import ModelsEntities.Seller;

public interface SellerDao {

	void insert(Seller obj);

	void update(Seller obj);

	void deleteById(Seller obj);

	Seller findById(Integer id);

	List<Seller> findAll();
	
	List<Seller> findByDepartment(Department department);
}
