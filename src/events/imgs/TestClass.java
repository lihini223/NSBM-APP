/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events.imgs;

/**
 *
 * @author Rajatha
 */
public class TestClass {
    
}

/*
File file = File.createTempFile("upload-", ".bin", new File("/path/to/your/uploads"));
item.write(file);
*/

/*
File destination = new File("/path/to/your/uploads", file.getName());
file.renameTo(destination);
*/

/*
private void uploadImageActionPerformed(java.awt.event.ActionEvent evt) {                                            
    JFileChooser filechooser = new JFileChooser();
    filechooser.setDialogTitle("Choose Your File");
    filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    // below code selects the file 
    int returnval = filechooser.showOpenDialog(this);
    if (returnval == JFileChooser.APPROVE_OPTION)
    {
        File file = filechooser.getSelectedFile();
        BufferedImage bi;
        try {
            // display the image in a Jlabel
            bi = ImageIO.read(file);
            jLabel1.setIcon(new ImageIcon(bi));
        } catch(IOException e) {
           e.printStackTrace(); // todo: implement proper error handeling
        }
        this.pack();
    }
}
*/
