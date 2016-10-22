package Logica;

public class Fabrica {
    
private static Fabrica instancia;
private Fabrica(){};
  
public static Fabrica getInstance(){
    if (instancia == null){
        instancia = new Fabrica();
    }
    return instancia;
}
    
public ISistema getISistema() {
    ISistema IS = new Sistema();
    return IS;
}
}
