package ie.gmit.sw;
import java.io.*;

import com.db4o.ObjectContainer;



public interface DatabaseInterface {
	
		public void accessDb() throws IOException;
		
		public void retrieveDocument() throws IOException;

		void retrieveDocument(ObjectContainer db, Document d) throws IOException;

		Document retrieveDocumentById(ObjectContainer db, String id);
		
}//end of Interface 

