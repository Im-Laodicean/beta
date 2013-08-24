package render;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

import static org.lwjgl.opengl.GL11.*;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;
import org.newdawn.slick.Color;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;


public class PNGTexture extends RenderableObject{
	private ByteBuffer toDraw;
	private Texture texture;
	public PNGTexture(String filePath, int x, int y) throws IOException{
		texture = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream(filePath));
		width = texture.getImageWidth();
		height = texture.getImageHeight();
	}
	@Override
	public void renderSelf() {
		Color.white.bind();
		texture.bind();
		glPushMatrix();
		GL11.glBegin(GL11.GL_QUADS);
		{
			glTexCoord2f(0, 0);
			glVertex2f(x, y);

			glTexCoord2f(1, 0);
			glVertex2f(x+width, y);

			glTexCoord2f(1, 1);
			glVertex2f(x+width, y+height);

			glTexCoord2f(0, 1);
			glVertex2f(x, y+height);
		}
		glEnd();
		glPopMatrix();
		
	}

}
