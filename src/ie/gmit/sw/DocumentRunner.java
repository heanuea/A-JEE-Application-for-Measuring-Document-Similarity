package ie.gmit.sw;

import java.io.IOException;

import com.db4o.*;
import com.db4o.config.*;
import com.db4o.query.*;
import com.db4o.ta.*;
import xtea_db4o.XTEA;
import xtea_db4o.XTeaEncryptionStorage;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

public class DocumentRunner {
	public static final String DB4OFILENAME = "";
	
	public static void main(String[] args)
	{
		ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), DB4OFILENAME);
		DatabaseImp dbImp = new DatabaseImp();//DatabaseImp


	}
	
}//end class
