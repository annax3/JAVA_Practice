class StringBufferCapacity{
	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1.capacity());//16
		sb1.append("ram1");
		sb1.append("rampal8");
		sb1.append("ram2");
		System.out.println(sb1.capacity());


		sb1.append("rampal7");
		System.out.println(sb1.capacity());
		sb1.append("ram3");
		sb1.append("rampal6");
		sb1.append("ram4");
		sb1.append("rampal5");
		sb1.append("ram5");
		sb1.append("rampal4");
		sb1.append("ram6");
		sb1.append("rampal3");
		sb1.append("ram7");
		sb1.append("rampal2");
		sb1.append("ram8");
		sb1.append("rampal1");
		System.out.println("eee");
		sb1.append("rampal9");
		sb1.append("ram6");
		sb1.append("rampal10");
		sb1.append("ram7");
		sb1.append("rampal11");
		sb1.append("ram8");
		sb1.append("rampal12");
		System.out.println(sb1);
	}
}