class _9StringsMethods{
	public static void main(String[] args){

		//1.public char charAt(int index)
		String s="Prashant";
	    System.out.println(s.charAt(0));//p


	    //2.public String concat(String s)
	    System.out.println(s.concat("-Anand"));//Prashant-Anand

	    s=s+"Genius";
	    System.out.println(s);//PrashantGenius

	    s+="Anand2";
	    System.out.println(s);//PrashantGeniusAnand2


	    //3.public boolean equals(String sor Object o)
	    //it is override version of object class method
	    String s1="PRASHANT";
	    System.out.println(s1.equals("prashant"));//false



	    //4.public boolean equalsIgnoreCase(String s)
	    //it is not override version of object class it is specially designed for object class Where case is ignored
	    String s2="PRASHANT";
	    System.out.println(s2.equalsIgnoreCase("prashant"));//true
	}
}