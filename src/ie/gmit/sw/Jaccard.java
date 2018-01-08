package ie.gmit.sw;

import java.util.List;




public interface Jaccard {
	public List<Shingle> createShingles(Document document, int id);
	public List<Integer> createHashCodes(Document document);
	public double jaccardSimilarity(Integer[] a, Integer[] b);
	public void minHash(List<Shingle> Shingles, List<Shingle> Shingles2);
}//Jaccard