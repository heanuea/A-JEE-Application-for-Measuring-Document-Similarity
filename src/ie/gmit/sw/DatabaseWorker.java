package ie.gmit.sw;
import java.io.IOException;
import com.db4o.*;

public class DatabaseWorker  {
	

	private static DatabaseWorker firstInstance = null;
	static boolean firstThread = true;
	private static final String DB4OFILENAME = "";
	private ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), DB4OFILENAME);
	private DatabaseInterface dbImpl = new DatabaseImp();
	
	
	private DatabaseWorker(){ }
	
	public static DatabaseWorker getInstance() {
		//If threads try to create instances of this class...
		if(firstInstance == null){
			
			firstThread = false;
			
			try {
				Thread.currentThread();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	
		synchronized(DatabaseWorker.class){
			if(firstInstance == null){
				firstInstance = new DatabaseWorker();
			}
		}
		return firstInstance;
	}

	
	public void storeDocument(Document document) throws IOException {
		dbImpl.retrieveAll(db);
	}
	public Document retrieveDocument(String id) throws IOException {
		Document doc = new Document("", "");
		doc = dbImpl.retrieveDocumentById(db, id);
		db.close();
		return doc;
	}//retrieveDocument
}//DatabaseHandler
