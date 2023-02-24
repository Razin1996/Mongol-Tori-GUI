/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mongol.tori;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import java.io.OutputStream;
import jssc.*;
/**
 *
 * @author Razin
 */
public class Helper {
    private static OutputStream output = null;
    
    static String logText = "";
    
//    public void writeData(String command) { String x = command;
//     byte[] data = x.getBytes();
//     try
//     {
//       output.write(data);
//       printMsg(x);
//     }
//     catch (IOException e)
//     { 
//       printMsg("Can't send data");
//     }
//   }
    
    public void hand(String dir) {
     String x = dir;
     byte[] data = x.getBytes();
     try
     {
       output.write(data);
     }
     catch (IOException e)
     {
       logText = "Can't send data";
     }
   }
    
    public void pwm(String pwm)
   {
     String x = pwm;
     byte[] data = x.getBytes();
     try
     {
       output.write(data);
     }
     catch (IOException e)
     {
       logText = "Can't send data";
     }
   }
    
//    private void printMsg(String msg) {
//     if (Main2.btn_debug.isSelected()) {
//       Main2.txt_msg.append(msg + "\n");
//     }
//   }
}
