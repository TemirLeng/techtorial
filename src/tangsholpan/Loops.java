package tangsholpan;

public class Loops {
	
	public void count() {
	
	int count = 1;
	
	while (count <= 10) {
		
	System.out.println(count);
	count++;
	} 
	
	}
	
	
	public String returnThreeFirst(String word){
		
		do {
			word=word.substring(0,2);
		}
		while(word.length()>=3);
		return word;
	}
	
	public int countStringLetter(String str) {
		int count=0;
		for(int i=0; i<str.length(); i++) {
			count+=str.charAt(i);
		}
		return count;
	}
	
	
	public void printElements(String[] days) {
		for (String d: days) {
			System.out.println(d);
		}
	}
	
	
}

