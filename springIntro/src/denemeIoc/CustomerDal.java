package denemeIoc;

public class CustomerDal implements ICustomerDal{

	@Override
	public void add() {
		System.out.println("PostgreSQL ile veri tabanına eklendi");
		
	}

}
