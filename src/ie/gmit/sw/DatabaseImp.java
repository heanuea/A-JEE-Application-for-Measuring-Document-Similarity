package ie.gmit.sw;
import java.io.File;
import java.io.IOException;
import com.db4o.*;
import com.db4o.ext.StoredClass;


@SuppressWarnings({ "rawtypes", "unused" })

public class DatabaseImp implements DatabaseInterface {
	
	public static final String DB4OFILENAME = "";


	@Override
	public void retrieveAll(ObjectContainer db) throws IOException {
		System.out.println("Retrieving all documents...");
		 Document d = new Document(null, null);
		 ObjectSet result = db.queryByExample(d);
		 listResult(result);
	}
	
	@Override
	public void retrieveDocument(ObjectContainer db, Document d) throws IOException {
		ObjectSet result = db.queryByExample(d);
		listResult(result);
	}
	
	@Override
	public void storeDocument(ObjectContainer db, Document d) throws IOException {
		db.store(d);
		System.out.println("Saved document with ID: " + d.getDocId());
	}
	
	
	@Override
	public void deleteDb() throws IOException {
		System.out.println("Deleting database...");
			File file = new File(DB4OFILENAME);
			file.delete();
	}
	
	@Override
	public void deleteDocument(ObjectContainer db, String id) throws IOException {
		Document d = new Document(id, null);
		ObjectSet result = db.queryByExample(d);
		Document found = (Document) result.next();
		db.delete(found);
		System.out.println("Successfully deleted.");
	}
	
	@Override
	public void updateDocument(ObjectContainer db,String id, String newId) throws IOException {
		Document d = new Document(id, null);
		ObjectSet result = db.queryByExample(d);
		Document found = (Document) result.next();
		db.delete(found);
		found.setDocument(newId);
		db.store(found);
		System.out.println("Updated ID to: " + found.getDocId());
	}
	
	@Override
	public void listResult(ObjectSet result) {
		 System.out.println(result.size());
		 while(result.hasNext()) {
			 System.out.println(result.next());
		 }
	}

	
	@Override
	public Document retrieveDocumentById(ObjectContainer db, String id) throws IOException {
		System.out.println("Retrieving document with ID: " + id);
		Document d = new Document(id, null);
		ObjectSet result = db.queryByExample(d);
		Document found = (Document) result.next();
		d.setDocument(found.getDocument());
		return d;
	}
	
	@Override
	public int countDocuments(ObjectContainer db) throws IOException {
	    int numberOfObjects = 0;
	    for(StoredClass storedClass : db.ext().storedClasses())
	    {
	        //filter out db4o internal objects and objects which have a parent-class
	        if(!storedClass.getName().startsWith("com.db4o") &&
	                null == storedClass.getParentStoredClass()) {
	            numberOfObjects += storedClass.instanceCount();
	        }
	        
	    }
	    System.out.println("Number of objects stored is: " + numberOfObjects);
	    return numberOfObjects;
	}

	@Override
	public void accessDb() throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retrieveDocument() throws IOException {
		// TODO Auto-generated method stub
		
	}
}//DatabaseImpl