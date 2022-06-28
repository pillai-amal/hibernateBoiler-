package infy_crud.infy_crud.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import or
import infy_crud.infy_crud.entity.Customer;

@Repository(value = "customerDao")
public class CustomerDAOImpl implements CustomerDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	public Integer addCustomer(Customer c) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer updateCustomer(Customer c) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer deleteCustomer(Integer cid) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Customer getCustomer(Integer cid) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	

}
