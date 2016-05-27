/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;

import org.havi.ui.*;
import java.awt.*;
/**
 *
 * @author student
 */
public class DrawImage extends HComponent
{
    private Image bmap;
    private MediaTracker mtrack;
    
    public DrawImage(String bitmap, int x, int y)
    {
        bmap = this.getToolkit().getImage(bitmap);
        mtrack = new MediaTracker(this);
        mtrack.addImage(bmap, 1);
        
        try
        {
            mtrack.waitForAll();
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        
        this.setBounds(x, y, 1000, 1000);
    } 
    
    public void paint(Graphics g)
    {
        g.drawImage(bmap, 0,0,null);
    }
}
