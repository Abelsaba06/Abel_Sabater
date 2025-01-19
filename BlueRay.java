public class BlueRay extends DispositivosdeAlmacenamiento{
private int capas;
BlueRay(String nombre, double capacidad, String tipoDisco){
    super(nombre,capacidad,"Blue-Ray");
}

public int getCapas() {
    return capas;
}

public void setCapas(int capas) {
    this.capas = capas;
}

@Override
public void girar() {
    System.out.println("Blue-Ray girando a 200 rpm...");
}
@Override
public void info(){
    System.out.println("-----");
    System.out.println("-----");
    girar();
    System.out.println("Nombre: "+getNombre());
    System.out.println("Capas: "+getCapas());
    System.out.println("Capacidad actual: "+getCapacidad()+" GB");

    if(getContenido().isEmpty()){
        System.out.println("Contenido: Vacio");
    }else{
        System.out.println("Contenido: "+getContenido());
    }
    System.out.println("Tipo de disco: "+getTipoDisco());
}
}
