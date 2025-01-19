public abstract class DispositivosdeAlmacenamiento{
    private String nombre;
    private double capacidad;  // En GB
    private String contenido;
    private String tipoDisco;
    public DispositivosdeAlmacenamiento(String nombre, double capacidad, String tipoDisco) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipoDisco = tipoDisco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getTipoDisco() {
        return tipoDisco;
    }

    public void setTipoDisco(String tipoDisco) {
        this.tipoDisco = tipoDisco;
    }

    public void girar(){
        System.out.println(nombre+"girando...");
    }
    public void almacenar(String contenido, double coste){
        if(coste>capacidad){
            System.out.println("Error, "+contenido+" no se puede almacenar, en "+tipoDisco);
        }else {
            setCapacidad(capacidad-coste);
            System.out.println("Se ha almacenado: "+contenido);
        }
    }
    public void info(){
        System.out.println("-----");
        System.out.println("-----");
        girar();
        System.out.println("Nombre: "+nombre);
        System.out.println("Capacidad actual: "+getCapacidad()+" GB");

        if(contenido.isEmpty()){
            System.out.println("Contenido: Vacio");
        }else{
            System.out.println("Contenido: "+getContenido());
        }
        System.out.println("Tipo de disco: "+getTipoDisco());
    }
}
