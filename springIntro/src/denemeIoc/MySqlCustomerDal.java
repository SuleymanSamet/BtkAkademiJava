package denemeIoc;

public class MySqlCustomerDal implements ICustomerDal{

	@Override
	public void add() {
		System.out.println("My SQL ile veri tabanına bağlandı");
		
	}

}
