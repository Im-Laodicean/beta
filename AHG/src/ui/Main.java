package ui;

import java.io.IOException;

import org.lwjgl.LWJGLException;

import render.PNGTexture;
import render.Quad;
import engine.Engine;

public class Main {
	public static void main(String[]args) throws IOException{
		try {
			Engine.init();
			Engine.addToRenderables(new PNGTexture("fiddle.png", 0, 0));
			Engine.addToRenderables(new Quad(500,500,100,100));
			Engine.run();
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
