package datastructure;

import databases.ConnectToSqlDB;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DataReader {

	public static void main(String[] args) throws Exception {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";
		System.out.println(textFile);
		FileReader fR=null;
		BufferedReader bR=null;
		List<String> lList=new LinkedList<String>();
		try {
			System.out.println(textFile);
			fR=new FileReader(textFile);
			bR= new BufferedReader(fR);
		} catch (Exception e) {
			System.out.println("File not Found");
		}
		String s="",st="";
		try {
			while ((st=bR.readLine())!=null) {
				s+=st;
			}
			lList=getWords(s);
		} catch (Exception e) {
			System.out.println("File either Empty or Wrong type");
		}
		finally {
			if (fR != null) { fR = null;}
			if (bR !=null) {bR = null;}
		}
		Iterator<String> itr = lList.iterator();
		//FIFo
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}
	public static List<String> getWords(String text) {
		List<String> words = new ArrayList<String>();
		BreakIterator breakIterator = BreakIterator.getWordInstance();
		breakIterator.setText(text);
		int lastIndex = breakIterator.first();
		while (BreakIterator.DONE != lastIndex) {
			int firstIndex = lastIndex;
			lastIndex = breakIterator.next();
			if (lastIndex != BreakIterator.DONE && Character.isLetterOrDigit(text.charAt(firstIndex))) {
				words.add(text.substring(firstIndex, lastIndex));
			}
		}

		return words;
	}

}

