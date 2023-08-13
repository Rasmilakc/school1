package Test3;
import java.util.Arrays;
import java.util.List;

public class day20b {

	public static void main(String[] args) {
		// Stream - API testing 
		
				// count of blank strings
				List<String> names = Arrays.asList("chinmay","","sarika","ram","","sham");
				System.out.println(names.stream().filter(x -> x.isEmpty()).count());
				
				// taking the blank string to list
				List<String> name2 = Arrays.asList("chinmay","","sarika","ram","","sham");
				System.out.println(names.stream().filter(x -> x.isEmpty()).toList());
				
				//Only the string
				List<String> name3 = Arrays.asList("chinmay","","sarika","ram","","sham");
				System.out.println(names.stream().filter(x -> !x.isEmpty()).toList());
				
				// names starts with "S"
				List<String> name4 = Arrays.asList("chinmay","","sarika","ram","","sham");
				System.out.println(name4.stream().filter(x -> x.contains("i")).toList());
				
				// string greater then 4
				System.out.println(name4.stream().filter(x -> x.length() > 4).toList());
				
			
				// Working with every element of string 
				// ["rasmila","sabina","ravi"] ===> //["RASMILA","SABINA","RAVI"]
				// ["rasmila","sabina","ravi"] ===>  // ["rasmila","sabina"]
				
				List<Integer> transactions = Arrays.asList(100,-1900,78888,-900,-4523,98);
				
				System.out.println(transactions.stream().filter(tra -> tra >0).toList());
				System.out.println(transactions.stream().filter(tra -> tra < 0).toList());
				
				
				// Convert every list in map to Upper case()
				
				List<String> countries =Arrays.asList("USA","China","ameica","Africa","London");
				System.out.println(countries.stream().map(x -> x.toUpperCase()).toList());
				
				
				List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
				System.out.println(numbers.stream().map(x -> x * 2).toList());
				
				List<Integer> salary = Arrays.asList(6000,6000,6500,56777,9000);
				System.out.println(numbers.stream().map(x -> x * 2).toList());
				
				System.out.println(salary.stream().map(x -> x + x * 0.10).toList());
	}

}
