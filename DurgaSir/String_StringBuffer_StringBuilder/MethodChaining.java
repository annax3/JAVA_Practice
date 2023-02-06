class MethodChaining{
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();

		sb.append("Prashant");
		System.out.println(sb);//Prashant


		StringBuilder sb1=new StringBuilder();
		sb1.append("Prashant").append("Anand");
		System.out.println(sb1);//PrashantAnand


		StringBuilder sb2=new StringBuilder();
		sb2.append("Prashant").append("Anand").reverse();
		System.out.println(sb2);//dnanAtnahsarP

		StringBuilder sb3=new StringBuilder();
		sb3.append("Prashant").append("Anand").reverse().insert(9,"-");
		System.out.println(sb3);//dnanAtnah-sarP


		sb.append("Prashant").append("Anand").reverse().insert(9,"-").delete(3,4);//dnaA tna-hsarP
		System.out.println(sb);//dnaAtnah-sarPtnahsarP
	}
}