package com.exilant.js;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JsTestEx02 {
	public static void main(String[] args) throws ScriptException, FileNotFoundException {
		ScriptEngineManager scriptEngineeManager = new ScriptEngineManager();
		
		ScriptEngine nashorn =scriptEngineeManager.getEngineByName("nashorn");
		
		nashorn.eval(new FileReader("resources/com/js/external.js"));
		System.out.println(nashorn.eval("fnTest()"));
		System.out.println(nashorn.eval("sayHello('harry')"));
}
}