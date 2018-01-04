package ie.gmit.sw;

public class Document 

{
	private int docId;
	private String document;
	
	public Document(int docId, String document){
		this.docId = docId;
		this.document = document;
}

	//gets and sets 
	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}//setDocument

	
	@Override
	public String toString() {
		return "Document [docId: " + docId + ", document content: " + document + "]";
	}
	
	
}//end class 