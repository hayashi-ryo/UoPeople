class Zigzag {                                    
    static void main() {      
       	int number = 123;
		
		int hundreds = number/100;
		int tens = (number/10)%10;
		int ones = number %10;

		int zigzag = ones*100 +
					 tens*10 +
					 hundreds;
    }                         
}                          
