package com.kvvssut.learnings.java.designpatterns.creationalpatterns;

import java.io.Serializable;

public class _t1_SingletonPattern_4_WithSerialization implements Serializable {

	/*
	 * If the Singleton class implements the java.io.Serializable interface,
	 * when a singleton is serialized and then deserialized more than once,
	 * there will be multiple instances of Singleton created. In order to avoid
	 * this the readResolve method should be implemented.
	 */

	private static final long serialVersionUID = -3082928116874914764L;
	private static _t1_SingletonPattern_4_WithSerialization instance;

	private _t1_SingletonPattern_4_WithSerialization() {
		// initialization
	}

	public static synchronized _t1_SingletonPattern_4_WithSerialization getInstance() {
		if (instance == null) {
			instance = new _t1_SingletonPattern_4_WithSerialization();
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
