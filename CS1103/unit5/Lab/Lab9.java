package Lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

import javax.swing.JFileChooser;

public class Lab9 {

	public static void main(String[] args) {
		// Read file
		String FilePath = "words.txt";
		File f = new File(FilePath);
		// Create word dictionary
		HashSet<String> words = new HashSet<String>();
		try (Scanner filein = new Scanner(f)){
			while(filein.hasNext()) {
			      String tk = filein.next();
			      words.add(tk.toLowerCase());
			}
			System.out.println(words.size());
			checkWord(words);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
		
	}
	
	static void checkWord(HashSet<String> dic) {
		File selectedFile = getInputFileNameFromUser();
		try (Scanner selected = new Scanner(selectedFile)) {
			selected.useDelimiter("[^a-zA-Z]+");
			while (selected.hasNext()) {
				String tk = selected.next().toLowerCase();
				if (tk.isBlank() || tk.isEmpty())
					continue;
				if (!dic.contains(tk)) {
					System.out.println(tk+":"+spellCheck(tk,dic));
				}
		} }catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
     * Lets the user select an input file using a standard file
     * selection dialog box.  If the user cancels the dialog
     * without selecting a file, the return value is null.
     */
    static File getInputFileNameFromUser() {
       JFileChooser fileDialog = new JFileChooser();
       fileDialog.setDialogTitle("Select File for Input");
       int option = fileDialog.showOpenDialog(null);
       if (option != JFileChooser.APPROVE_OPTION)
          return null;
       else
          return fileDialog.getSelectedFile();
    }

    static TreeSet spellCheck(String badWord, HashSet dic) {
    	TreeSet<String> treeset = new TreeSet<String>();
    	for(int i=0;i<badWord.length();i++) {
    		String str = badWord.substring(0,i) + badWord.substring(i+1);
    		if(dic.contains(str)) {
    			
    		}
    	}
    	
    	for(int i=0;i<badWord.length();i++) {
    		for (char ch = 'a'; ch <= 'z'; ch++) {
    			String str = badWord.substring(0,i) + ch + badWord.substring(i+1);
    			if(dic.contains(str)){
    				treeset.add(str);
    			}
    		}
    	}
    	
    	for (int i=0; i<=badWord.length(); i++){
    		   for (char ch = 'a'; ch <= 'z'; ch++) {
    			   String str = badWord.substring(0,i) + ch + badWord.substring(i);
    			   if(dic.contains(str)){
    				  treeset.add(str);
    			   }
    		   }
	 	}
    	
    	for(int i=0; i< badWord.length()-1; i++){
    		String str = badWord.substring(0,i)+ badWord.substring(i+1, i+2) + badWord.substring(i,i+1)+ badWord.substring(i+2);
    		if(dic.contains(str)){
    			treeset.add(str);
    		}
    	}
    	
    	for (int i=1; i<badWord.length(); i++){
    		String str1 = badWord.substring(0,i);
    		String str2 = badWord.substring(i);
    		if(dic.contains(str1) && dic.contains(str2)) {
    			treeset.add(str1+" "+str2);
    		}  		
    	}
    	if(treeset.isEmpty()) {
    		treeset.add("no suggestions");
    	}
		return treeset;	
    }
}
