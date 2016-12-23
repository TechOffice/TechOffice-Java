package com.ittechoffice.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import org.apache.lucene.queryparser.classic.ParseException;

/**
 * Lucene is search library. It help to create index of document and improve the query performance
 * This is an example of Lucene. 
 * In this example, It would create index for Data folder. The index would be stored in Index Folder.
 * 
 * @author Ben_c
 *
 */
public class Appl {
	public static void main(String[] args) throws IOException, ParseException{
		Indexer indexer = new Indexer("Index");
		indexer.indexFile(new File("Data/Testing.txt"));
		indexer.close();
		Searcher searcher = new Searcher("Index");
		searcher.search("Testing");
	}
}
