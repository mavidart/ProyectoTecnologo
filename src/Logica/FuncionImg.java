package Logica;

import java.io.*;

public class FuncionImg {
       
    FileInputStream entrada;
    FileOutputStream salida;
    File archivo;    
    
public byte[] abrirImagen(File archivo){
       byte[] bytesImg = new byte[1024*100];
    try {
        entrada = new FileInputStream(archivo);
        entrada.read(bytesImg);
        
    } catch (Exception e) {}
    return bytesImg;
}

public boolean guardarImagen(File archivo, byte[] bytesImg){
       boolean resp=false;
    try {
        salida=new FileOutputStream(archivo);
        salida.write(bytesImg);
        resp=true;
    } catch (Exception e) {
    }
  return resp;
}


    
    
}
