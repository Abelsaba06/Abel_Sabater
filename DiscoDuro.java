public class DiscoDuro extends DispositivosdeAlmacenamiento{
    DiscoDuro(String nombre, double capacidad, String tipoDisco) {
        super(nombre, capacidad,"Disco Duro");
    }

    @Override
    public void girar() {
        System.out.println("Disco duro girando a 7200 rpm...");
    }
}
