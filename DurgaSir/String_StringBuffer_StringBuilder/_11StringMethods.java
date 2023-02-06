class _11StringMethods{
	public static void main(String[] args) {
		//find the index of first occurence of character in any string
		String s1="Ananaad";
		System.out.println(s1.indexOf('a'));//2
		System.out.println(s1.indexOf('b'));//-1

		//find the index of last occurence of character in any string
		String s2="Prashant";
		System.out.println(s2.lastIndexOf('a'));//5

		//toLowercase
		System.out.println(s2.toLowerCase());

		//toUpperCase
		System.out.println(s2.toUpperCase());
	}
}