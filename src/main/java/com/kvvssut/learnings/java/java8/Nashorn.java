package com.kvvssut.learnings.java.java8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Nashorn {

	public static void main(String[] args) {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("nashorn");

		/*
		 * 1. Using script as string -
		 */
		String script = "var welcome = 'Hello';"
				+ "welcome += ', Programmer!';" + "welcome;";

		String result;
		try {
			result = (String) engine.eval(script);
			System.out.println(result);
		} catch (ScriptException e) {
			System.out.println("There is a script error : " + e.getMessage());
		}

		/*
		 * 2. Reading script from a file -
		 */
		File file = new File("../Interview/src/readurl.js");
		Reader reader = null;
		try {
			reader = new FileReader(file);
		} catch (FileNotFoundException e1) {
			System.out.println(e1.getMessage());
		}

		try {
			result = (String) engine.eval(reader);
			System.out.println(result);
		} catch (ScriptException e) {
			System.out.println("There is a script error : " + e.getMessage());
		}
	}

}
