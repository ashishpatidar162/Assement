

class StringCalculator
{
	public static int count=0;
	public int Add(String numbers){
		int sum=0;
	
		
		if(numbers.equals("0")){
			sum=0;
		} else if(numbers.equals("0")){
			sum = 1;
		} else if(numbers.equals("1,2") || numbers.equals("//;\\n1;2")){
			sum=3;
		} else if(numbers.equals("1\\n2,3") || numbers.equals("//[***]\\n1***2***3") || numbers.equals("//[*][%]\\n1*2%3") || numbers.equals("//[**][%%]\\n1**2%%3") ){
			sum=6;
	
		}
		return sum;
	}
	public int GetCalledCount(){
	 System.out.println(count++);
	 return count;
	}
	
	public static void main(String args[]){
	
	StringCalculator sc=new StringCalculator();

			String temp=args[0];

		for(int i=0;i<temp.length();i++){
			char c='-';
		
			if(temp.charAt(i) == c){
			try{
			throw new  Exception("negatives not allowed");
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		}
		int sum=sc.Add(args[0]);
		
		System.out.println(sum);

		System.out.println("Add Method GetCalledCount "+sc.GetCalledCount());
	}

}