import java.util.Scanner;

public class Vinilo extends DispositivosdeAlmacenamiento{
Vinilo(String nombre, double capacidad, String tipoDisco){
    super(nombre,capacidad,"Vinilo");
}
@Override
public void girar() {
    System.out.println("Vinilo girando a 33 rpm...");
}
@Override
public void almacenar(String contenido, double coste){
    contenido="Musica";
    Scanner sc=new Scanner(System.in);
    double resultado=(coste*3600)/(8*Math.pow(1024,6));
    if(resultado>getCapacidad()){
        System.out.println("Error, "+contenido+" no se puede almacenar, en "+getTipoDisco());
        setContenido("");
    }else {
        setCapacidad(getCapacidad()-resultado);
        System.out.println("Se ha almacenado: "+contenido);
    }
}
}