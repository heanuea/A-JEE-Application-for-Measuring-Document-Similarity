package ie.gmit.sw;

public class Document 

{
	private int docId;
	private String document;
	
	public Document(int docId, String document){
		this.docId = docId;
		this.document = document;
}

	public Document(String id, Object document2) {
		// TODO Auto-generated constructor stub
	}

	//gets and sets 
	public int getDocId() {
		return docId;
	}

	public void setDocId(int newId) {
		this.docId = newId;
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