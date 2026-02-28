/**
 * 
 */
package tiil.edu;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.concurrent.ConcurrentHashMap;


/**
 * 
 */
public class XuLyVanBan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = """
				Java is a powerful programming language.
				Java is used widely in enterprise applications.
				Parallel streams help Java process large data efficiently.
				""";
		String normalizedText = text.toLowerCase();
		List<String> words = Arrays.stream(normalizedText.split("\\W+"))
				.filter(w -> !w.isEmpty())
				.parallel()
				.collect(Collectors.toList());
		
		long wordCount = words.size();
		
		long sentenceCount = Arrays.stream(text.split("[.!?]"))
				.parallel()
				.filter(s -> !s.trim().isEmpty())
				.count();
		
		Map<String, Long> wordFrequency = words.parallelStream()
				.collect(Collectors.groupingByConcurrent(w -> w, Collectors.counting()));
		Map.Entry<String, Long> mostFrequentWord = wordFrequency.entrySet()
				.parallelStream()
				.max(Map.Entry.comparingByValue())
				.orElse(null);
		
		String reversedText = 
				Arrays.stream(text.split("")).parallel().reduce("",(a,b)->b + a);
		
		System.out.println("So tu: " + wordCount);
		System.out.println("So cau: " + sentenceCount);
		
		if(mostFrequentWord != null) {
			System.out.println("Tu xuat hien nhieu nhat: " + mostFrequentWord.getKey() + "("+ mostFrequentWord.getValue() + " lan)");
		}
		
		System.out.println("\nVan ban dao nguoc: ");
		System.out.println(reversedText);

	}

}
