package ie.gmit.sw;
import java.io.File;
import java.io.IOException;
import com.db4o.*;


@SuppressWarnings({ "rawtypes", "unused" })

public class DatabaseImp implements DatabaseInterface {
	public static final String DB4OFILENAME = "";

	@Override
	public void accessDb() throws IOException {
		 ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), DB4OFILENAME);
		 try {
		
			 System.out.println("Accessing database...");
		 } finally {
			 db.close();
		 }
	}
	
	
	@Override
	public void retrieveDocument(ObjectContainer db, Document d) throws IOException {
		
	}

	@Override
	public void retrieveDocument() throws IOException {
		// TODO Auto-generated method stub
		
	}	
	
	@Override
	public Document retrieveDocumentById(ObjectContainer db, String id) {
	
		Document d = new Document(id, null);
		ObjectSet result = db.queryByExample(d);
		Document found = (Document) result.next();		
		d.setDocument(found.getDocument());
		
		return d;
	}


}//DatabaseImpl