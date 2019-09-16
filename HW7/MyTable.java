package Lesson7;

public class MyTable {

	private Entry[] entries=new Entry[26];
	//returns the String that is matched with char c in the table
	public String get(char c){
	//implement
		char cc= Character.toLowerCase(c);
		int index=cc-97;
		
	return entries[index].getStr();
	}
	//adds to the table a pair (c, s) so that s can be looked up using c
	public void add(char c, String s) {
	//implement
		char cc= Character.toLowerCase(c);
		int index=cc-97;
		entries[index]=new Entry(c,s);
	}
	//returns a String consisting of nicely formatted display
	//of the contents of the table
	public String toString() {
	//implement
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 26; ++i){
			if(entries[i] != null) {
				sb.append(entries[i].toString());
				sb.append(System.getProperty("line.separator"));
			}
		}
		return sb.toString();
	}
	private class Entry {
		private char ch;
		private String str;
		Entry(){
			
			
		}
		Entry(char ch, String str){
			this.ch=ch;
			this.str=str;
		//implement
		}
		
		public char getCh() {
			return ch;
		}

		public String getStr() {
			return str;
		}

		//returns a String of the form "ch->str"
		public String toString() {
		//implement 
		//	if (this==null) return "null";
			 return this.getCh() + "->" + this.str;
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('w',"Willie");
		System.out.println(t.get('b'));
		System.out.println(t.toString());

	}

}
