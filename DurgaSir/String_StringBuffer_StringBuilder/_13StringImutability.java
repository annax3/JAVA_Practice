class _13StringImutability{
	public static void main(String[] args) {
		String s1=new String("durga");

		String s2=s1.toLowerCase();
		String s3=s1.toUpperCase();

		System.out.println(s1==s2);
		System.out.println(s1==s3);
	}
}