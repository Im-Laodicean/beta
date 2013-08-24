package render;

import org.lwjgl.opengl.GL11;

public class Quad extends RenderableObject{
	public Quad(){
		super();
	}
	
	public Quad(int x, int y, int width, int height){
		super(x,y,width,height);
	}
	
	
	@Override
	public void renderSelf() {
		GL11.glColor3f(0.5f, 0.5f, 1.0f);
		GL11.glPushMatrix();
		GL11.glBegin(GL11.GL_QUADS);
			GL11.glVertex2f(x, y);
			GL11.glVertex2f(x+width, y);
			GL11.glVertex2f(x+width, y+height);
			GL11.glVertex2f(x, y+height);
		GL11.glEnd();
		GL11.glPopMatrix();
	}
	
}
