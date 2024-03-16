package springIntro;

public class CustomerManager implements ICustomerService{
	
	private ICustomerDal customerDal;
	
	/*
	public CustomerManager(ICustomerDal customerDal) {
		
		this.customerDal = customerDal;
	}
	*/
	//setter injection
	public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		//iş kuralları çalışır
		
		customerDal.add();
	}

}
