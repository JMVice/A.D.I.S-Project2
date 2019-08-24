package Logica;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

//Esta clase se encarga de generar imagenes QR con el texto que a esta se le
//pase.
public class QRModule {

    //Genera un objeto de tipo ImageIcon que corresponde a un codigo QR. El 
    //codigo QR es generado con el String que se la pasa al metodo.
    public ImageIcon generar_imagen_qr(String codigo) {
        try {
            //Objeto que escribe mapas de bits de codigo QR
            QRCodeWriter qrCodeWriter = new QRCodeWriter();
            //objeto que contiene el mapa de bits del codigo QR.
            BitMatrix bitMatrix = qrCodeWriter.encode(codigo, BarcodeFormat.QR_CODE, 350, 350);
            //Convertimos el mapa de bits del codigo QR a un objecto BufferedImage
            BufferedImage bfi = MatrixToImageWriter.toBufferedImage(bitMatrix);
            //Convertimos el bufferedImage a objeto de tipo Image y le cambiamos su tamanio
            //al mismo que el jlabel donde se mostraran los codigos QR.
            Image img = bfi.getScaledInstance(104, 104, Image.SCALE_SMOOTH);
            //Convertimos la imagen a codigo QR
            ImageIcon imageIcon = new ImageIcon(img);
            //retorna el ImageIcon para el jlabel
            return imageIcon;
        } catch (WriterException ex) {
            Logger.getLogger(QRModule.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
