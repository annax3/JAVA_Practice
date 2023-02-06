class StringBufferInsertMethod{
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("abcdeeijkl");
		sb.insert(5,"FGH");//abcdeFGHeijkl
		System.out.println(sb);

		sb.delete(8,13);
		System.out.println(sb);//abcdeFGH

		sb.deleteCharAt(7);
		System.out.println(sb);//abcdeFG

		sb.reverse();
		System.out.println(sb);//GFedcba
	}
}