class _4CheckStringArea{
	public static void main(String[] args){
		String s1=new String("You can not change me");
		String s2=new String("You can not change me");
		System.out.println(s1==s2);//false

		String s3="You can not change me";
		System.out.println(s1==s3);//false

		String s4="You can not change me";
		System.out.println(s4==s3);//true

		String s5="You can not " + "change me";//if both are constant than operation will performed compile time only
		System.out.println(s4==s5);//true

        String s6="you can not ";
        String s7=s6+"change me";//if one is variable then operation is performed run time only
        System.out.println(s4==s7);//false

        final String s8="You can not ";
        String s9=s8+"change me";//if final is used then one operation is performed in compile time only
        System.out.println(s4==s9);//true

        //Heap Area : s1(yccm),s2(yccm)
        //SCP : s3,s4,s5,s9(yccm),s6(you cannot),(change me)


	}
}