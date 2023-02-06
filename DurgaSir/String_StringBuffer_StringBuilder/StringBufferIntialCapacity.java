class StringBufferIntialCapacity{
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer(1000);//StringBuffer sb=new StringBuffer(int initialCapacity)
		System.out.println(sb.capacity());//1000
		for(int i=1;i<=1000;i++){
			sb.append("a");
		}
		sb.append("b");
		System.out.println(sb.capacity());//2002
	}
}