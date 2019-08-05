import DAL.MongoDBService;
import Models.VMProduct;
import Models.VMProductType;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Try To Insert New Product TO DB");
		
		VMProduct vmproduct = new VMProduct();
		vmproduct.setproductDescription("Coca Cola bottle");
		vmproduct.setproductType(VMProductType.COKE);

		MongoDBService mongoDBService =  MongoDBService.Instance;

		mongoDBService.AddItem(vmproduct);
	}

}
