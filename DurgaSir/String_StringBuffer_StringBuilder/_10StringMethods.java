class _10StringMethods{
	public static void main(String[] args) {

		//public boolean isEmpty()
		String s="";
		System.out.println(s.isEmpty());

		String s1="Anand";
		System.out.println(s1.isEmpty());

		//public int length();
		String s2="Prashant";
		System.out.println(s2.length()); 


		//public String replace()
		String s3="abba";
		System.out.println(s3.replace('a','b')); 

		//public String subString()
		String s4="carisbigcar";
		System.out.println(s4.substring(5));


		//public String substring(int begin,int end)
		System.out.println(s4.substring(0,5));



	}
}