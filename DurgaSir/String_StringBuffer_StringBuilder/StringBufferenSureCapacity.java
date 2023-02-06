class StringBufferenSureCapacity{
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();

		System.out.println(sb.capacity());//default

		sb.ensureCapacity(1000);
		System.out.println(sb.capacity());//1000

		sb.append("ABC");

		sb.trimToSize();
		System.out.println(sb.capacity());//i dont want more memory after enter ABC so trimToSize is used
	}
}