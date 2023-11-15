package view;

import br.edu.fateczl.arvore.ArvoreChar.ArvoreChar;

public class Principal {

	public static void main(String[] args) {
		ArvoreChar arv = new ArvoreChar();
		char [] vetor = {'M', 'F', 'S', 'D', 'J', 'P', 'U', 'A', 'E', 'H', 'Q', 'T', 'W', 'K'};
		
		for (char i: vetor) {
			arv.insert(i);
		}
		
		try {
			arv.remove('F');
			arv.remove('U');
			arv.prefixSearch();
			arv.infixSearch();
			arv.postfixSearch();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
