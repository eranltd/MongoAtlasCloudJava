package DAL;

import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoRepository
{

	
	//Declaring mongo db
    private final MongoDatabase _database;
    private final String _collectionName;
    private final MongoClient _mongoClient;
    
    public MongoRepository(String connectionString, String dataBase, String collection) 
    {
//        try
//        {
            _collectionName = collection;
            
            _mongoClient = new MongoClient(new MongoClientURI(connectionString));
            
//            if (_mongoClient != null)
                _database = _mongoClient.getDatabase(dataBase);
//        }
//        catch (Exception ex)
//        {
//            throw new Exception("cannot access to MongoDb server.", ex);
//        }
    }
    
    public MongoCollection<Document> Documents() {
    	return _database.getCollection(_collectionName);
    }
   
}


