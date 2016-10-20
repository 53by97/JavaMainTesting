	package com.kvvssut.learnings.java.more;
	
	import java.util.HashMap;
	
	public class NgramModel
	{
		private HashMap<String,Integer> ngram = new HashMap <String, Integer>(); 
	
		public NgramModel() 
		{
			ngram.put("aa", 2);
		}
	
		public HashMap<String,Integer> getValue() {
			return ngram;
		}
	}