package DAL;

public interface IMongoDBService<ID,T> {

        Iterable<T> GetAllItems();
        
        T GetItem(ID id);
        
        void AddItem(T model);
        
        boolean UpdateItem(T model);
        
        boolean RemoveItem(ID id);
        
        boolean RemoveAllItems();
        
}
