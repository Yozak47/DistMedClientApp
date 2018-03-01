/*
 * Copyright 2017 Nicholas Moss
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to    
 * deal in the Software without restriction, including without limitation the  
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or 
 * sell copies of the Software, and to permit persons to whom the Software is   
 * furnishedto do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in   
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR   
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,     
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE  
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER       
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN   
 * THE SOFTWARE.
 */

/*
 * Senior Project - Team A
 * Distributed Medical Devices
 * Nick Moss, Aaron Neff, Matthew Smith
 */

package dist_med;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Nicholas Moss
 */
public class QueueThread implements Runnable
{
    volatile static Queue<String> dataQueue;

    
    public QueueThread()
    {
        dataQueue = new LinkedList< >( );
    }
    
    // Runs only once, implement some kind of loop
    // for( x : sizeof(x)) -> update stuff
    @Override
    public void run()
    {
        // Read data from the queue
        while(!dataQueue.isEmpty()) // while(true) -> sleep(100) or something
            // maybe I can use notify()?
        {
            System.out.println( dataQueue.remove());
            //UserInterface.updateInterface(dataQueue.remove());
        }
    } 
}
