
public class RecursiveSyntax {

	static final String[] conjunction = {"and","or","but","because"};
	static final String[] proper_noun={"Fred","Jane","Richard Nixon","Miss America"};
	static final String[] common_noun={"man","woman","fish","elephant","unicorn"};
	static final String[] determiner={"a","the","every","some"};
	static final String[] adjective={"big","tiny","pretty","bald"};
	static final String[] intransitive_verb={"runs","jumps","talks","sleeps"};
	static final String[] transitive_verb={"loves","hates","sees","knows","looks for","finds"};
	
	public static void main(String[] args) {
		while (true) {
	         sentence();
		     System.out.println(".\n\n");
	         try {
	             Thread.sleep(3000);
	         }
	         catch (InterruptedException e) {
	         }
	      }
	}
	
	static void sentence() {
		/*
		 * BNF notion
		 * <sentence> ::= <simple_sentence> [ <conjunction> <sentence> ]
		 * */
		if(Math.random() > 0.2) {
			simpleSentence();
		} else {
			int conj = (int)(Math.random()*conjunction.length);
			System.out.print(" "+conjunction[conj]);
			sentence();
		}
		
	}
	static void simpleSentence() {
		/*
		 * <noun_phrase> <verb_phrase>
		 * */
		nounPhrase();
		verbPhrase();		
	}
	
	static void nounPhrase() {
		/*
		 * <noun_phrase> ::= <proper_noun> |<determiner> [ <adjective> ]. <common_noun> [ who <verb_phrase> ]
		 * */
		if(Math.random()<0.2) {
			int pn = (int)(Math.random()*proper_noun.length);
			System.out.print(" "+proper_noun[pn]);
		} else {
			int dn = (int)(Math.random()*determiner.length);
			System.out.print(" "+determiner[dn]);
			while(Math.random()<0.6) {
				int an = (int)(Math.random()*adjective.length);
				System.out.print(" "+adjective[an]);
			}
			int cn = (int)(Math.random()*common_noun.length);
			System.out.print(" "+common_noun[cn]);
			if(Math.random()<0.2) {
				System.out.print(" who");
				verbPhrase();
			}
		}
	}
	
	static void verbPhrase() {
		/*
		 * <verb_phrase> ::= <intransitive_verb> |<transitive_verb> <noun_phrase> |is <adjective> |believes that <simple_sentence>
		 * */
		double rand = Math.random();
		if(rand < 0.2) {
			int ivn = (int)(Math.random()*intransitive_verb.length);
			System.out.print(" "+intransitive_verb[ivn]);
		} else if(rand < 0.5) {
			int tvn = (int)(Math.random()*transitive_verb.length);
			System.out.print(" "+transitive_verb[tvn]);
			nounPhrase();
		} else if(rand < 0.7) {
			System.out.print(" is");
			int an = (int)(Math.random()*adjective.length);
			System.out.print(" "+adjective[an]);			
		} else {
			System.out.print(" believes that");
			simpleSentence();
		}
	}

}
