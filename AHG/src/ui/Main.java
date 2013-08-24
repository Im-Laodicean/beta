package ui;

import org.lwjgl.LWJGLException;

import engine.Engine;

public class Main {
	public static void main(String[]args){
		try {
			Engine.init();
			Engine.run();
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
