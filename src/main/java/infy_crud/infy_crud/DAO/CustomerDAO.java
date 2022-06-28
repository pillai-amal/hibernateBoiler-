package infy_crud.infy_crud.DAO;

import infy_crud.infy_crud.entity.Customer;

public interface CustomerDAO {
	public Integer addCustomer(Customer c) throws Exception;
	public Integer updateCustomer(Customer c) throws Exception;
	public Integer deleteCustomer(Integer cid) throws Exception;
	public Customer getCustomer(Integer cid) throws Exception;

}