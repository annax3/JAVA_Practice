class ImportantMethodsInStringBuffer{
	public static void main(String[] args) {
		String str="Prashant";
		String str1="bnand";
		StringBuffer sb=new StringBuffer(str);

		System.out.println(sb.length());//1st method
		System.out.println(sb.capacity());//2nd Method

		System.out.println(sb.charAt(4));
		// System.out.println(sb.charAt(30));//StringIndexOutOfBoundsException


		StringBuffer sb1=new StringBuffer(str1);
		System.out.println("BEFORE : "+sb1);
		sb1.setCharAt(0,'A');//3rd Method
		System.out.println("AFTER : "+sb1);

		StringBuffer sb2=new StringBuffer();
		sb2.append("PI Value is ");
		sb2.append(3.14);
		sb2.append("It is exactly ");
		sb2.append(true);
		System.out.println(sb2);

		
		
	}
}