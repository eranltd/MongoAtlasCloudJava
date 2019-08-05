package DAL;

import org.bson.Document;

import com.google.gson.Gson;
import Models.VMProduct;

public class MongoDBService implements IMongoDBService<Long, VMProduct> {

    private final String mongoConnectionString = "mongodb+srv://vending_machine:vending_machine@cluster0-evjzx.mongodb.net/test?retryWrites=true&w=majority";
    private final String database = "vending_machine";
    private final String collection = "vending";
	
	
    private final MongoRepository _repository;

	
	 // Static attribute.
    // Making the "instance" attribute as "final" ensures that only one instance of the class exists.
    public static final MongoDBService Instance = new MongoDBService();
	
    // Private constructor.
    private MongoDBService() {
    	
        _repository = new MongoRepository(mongoConnectionString,database,collection);

    }
 
    // Static function.
    public static MongoDBService getInstance() {
        return Instance;
    }
	
	
	
	@Override
	public Iterable<VMProduct> GetAllItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VMProduct GetItem(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void AddItem(VMProduct model) {
		Gson gson = new Gson();
		String json = gson.toJson(model);    		
		_repository.Documents().insertOne(Document.parse(json));
	}

	@Override
	public boolean UpdateItem(VMProduct model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean RemoveItem(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean RemoveAllItems() {
		// TODO Auto-generated method stub
		return false;
	}

}
