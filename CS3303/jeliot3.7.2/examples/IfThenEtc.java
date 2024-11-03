import jeliot.io.Output;

class IfThenEtc {                                    
    static void main() {      
        long a = 3;
		long b = 20;
		long tmp;
		boolean less = false;

		do {
			if (less) {
				if (a > b) {
					tmp = a;
					a = b;
					b = tmp;
				}
			}
			else if (a < b) {
					tmp = a;
					a = b;
					b = tmp;
			} 			
			less = !less;	
		}
		while ( true );
    }                         
}                          
