package engine;

import java.util.ArrayList;
import java.util.LinkedList;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;

import render.Renderable;


public class Engine {
	public static ArrayList<Renderable> toRender;
	public static boolean isFinished;
	public static void init() throws LWJGLException{
		toRender = new ArrayList<Renderable>();
		isFinished = false;
		
		Display.setTitle("WHEEE");
		Display.setFullscreen(false);
		Display.setVSyncEnabled(true);
		Display.create();
	}
	
	public static void addToQueue(Renderable r){
		toRender.add(r);
	}
	
	private static void render(){
		for(Renderable r : toRender)
			r.renderSelf();
	}
	
	public static void run(){
		while(!isFinished){
			Display.update();
			if(Display.isCloseRequested()){
				isFinished = true;
			}
			render();
			Display.sync(24);
		}
	}
}
