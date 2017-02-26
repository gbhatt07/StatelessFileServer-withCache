package Client;

/* You can change implementation as you like. This is a simple one. */

public class fileHandle 
{
    /* The "filehandle" is simply an integer.  We keep a counter in a
       static variable "cnt" so that no duplication occurs.  When
       filehandle is discarded its number becomes 0. */

    private int index;
    private static int cnt = 1;

    public fileHandle()
    {
    	index=cnt++;
    }

    public boolean isAlive()
    {
    	return (this.index!=0);
    }

    /* checks two handles are equal or not. */
    public boolean Equals(fileHandle fh) 
    { 
    	return (fh.index==this.index);
    }

    /* discarding a filehandle. you do not have to use this. */
    public void discard()
    {
    	index=0;
    }
}