package com.kvvssut.learnings.java.designpatterns.creationalpatterns;

import java.io.Serializable;

public class SingletonPatternWithSerialization implements Serializable {

	/*
	 * If the Singleton class implements the java.io.Serializable interface,
	 * when a singleton is serialized and then deserialized more than once,
	 * there will be multiple instances of Singleton created. In order to avoid
	 * this the readResolve method should be implemented.
	 */

	private static final long serialVersionUID = -3082928116874914764L;
	private static SingletonPatternWithSerialization instance;

	private SingletonPatternWithSerialization() {
		// initialization
	}

	public static synchronized SingletonPatternWithSerialization getInstance() {
		if (instance == null) {
			instance = new SingletonPatternWithSerialization();
		}

		return instance;
	}

	public void doSomething() {
		// do something
	}

	/*
	 * This method is called immediately after an object of this class is
	 * deserialized. This method returns the singleton instance.
	 */
	protected Object readResolve() {
		return getInstance();
	}

}
