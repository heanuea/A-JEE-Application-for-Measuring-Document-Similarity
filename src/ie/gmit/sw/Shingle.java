
package ie.gmit.sw;

public class Shingle {
	private int docId;
	private int hashCode;
	
	public Shingle(int docId, int hashCode){
		this.docId = docId;
		this.hashCode = hashCode;
	}

	
	//get and set 
	
	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public int getHashCode() {
		return hashCode;
	}//getHashCode

	public void setHashCode(int hashCode) {
		this.hashCode = hashCode;
	}

	@Override
	public String toString() {
		return "Shingle [docId=" + docId + ", hashCode=" + hashCode + "]";
	}
	
}//end class 