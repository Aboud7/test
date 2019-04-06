
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aboud Jeero
 */
public class thread implements Runnable {
    
    public void run(){
        Thread t = Thread.currentThread();
       // Thread th = new Thread();
        System.out.println(t.getName());
        
    }
    
}
