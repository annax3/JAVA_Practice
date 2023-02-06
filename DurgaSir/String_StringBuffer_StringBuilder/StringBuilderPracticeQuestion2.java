class StringBuilderPracticeQuestion2{
	public static void main(String[] args) {
		StringBuilder db=new StringBuilder("Durga");
		String str1=db.toString();
		String str2=str1;
		// String str2=new String(str1);//false
		System.out.println(str2==str1);
	}
}