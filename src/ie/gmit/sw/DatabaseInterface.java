package ie.gmit.sw;
import java.io.*;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;



public interface DatabaseInterface {
	
		public void accessDb() throws IOException;
		
		public void retrieveDocument() throws IOException;

		void retrieveDocument(ObjectContainer db, Document d) throws IOException;

		Document retrieveDocumentById(ObjectContainer db, String id) throws IOException;

		public void retrieveAll(ObjectContainer db) throws IOException;

		int countDocuments(ObjectContainer db) throws IOException;

		void storeDocument(ObjectContainer db, Document d) throws IOException;

		void deleteDb() throws IOException;

		void deleteDocument(ObjectContainer db, String id) throws IOException;

		void updateDocument(ObjectContainer db, String id, String newId) throws IOException;

		void listResult(ObjectSet result);
		
}//end of Interface 

