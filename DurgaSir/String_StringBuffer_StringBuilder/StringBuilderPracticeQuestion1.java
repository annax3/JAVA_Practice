class StringBuilderPracticeQuestion1{
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder(5);//creates an empty sb object with capacity is 5
		
		String s=" ";

		if(sb.equals(s)){//false
			System.out.println("Match 1");
		}

		else if(sb.toString().equals(s.toString())){
			System.out.println("Match 2");
		}

		else{
			System.out.println("No Match");
		}
	}
}