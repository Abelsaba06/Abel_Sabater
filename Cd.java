public class Cd extends DispositivosdeAlmacenamiento{
    Cd(String nombre, double capacidad, String tipoDisco) {
        super(nombre,capacidad ,"Disco CD");
    }

    @Override
    public void girar() {
        System.out.println("Cd girando a 500 rpm...");
    }
}

