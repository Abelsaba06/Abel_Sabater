import java.util.Scanner;

public class Main {

    public static DiscoDuro discoDuro(){
        String nombre;
        String resposta;
        String cont;
        double quant;
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime com vols dir al disco");
        nombre=sc.nextLine();
        DiscoDuro discoDuro=new DiscoDuro(nombre,500,"Disco duro");
        System.out.println("Vols añadir algun contingut (S/N)?");
        resposta=sc.nextLine();
        if(resposta.toUpperCase().equals("S")){
            System.out.println("Que vols afegir");
            cont=sc.nextLine();
            discoDuro.setContenido(cont);
            System.out.println("Cuant ocupe (el espai que ocupe en GB per favor)");
            quant= sc.nextDouble();
            discoDuro.almacenar(cont,quant);
        }else{
            cont="Vacio";
            discoDuro.almacenar(cont,0);
        }
        return discoDuro;
    }

    public static Cd cd(){
        String nombre;
        String resposta;
        String cont;
        double quant;
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime com vols dir al disco");
        nombre=sc.nextLine();
        Cd cd=new Cd(nombre,0.68359375,"Disco CD");
        System.out.println("Vols añadir algun contingut (S/N)?");
        resposta=sc.nextLine();
        if(resposta.toUpperCase().equals("S")){
            System.out.println("Que vols afegir");
            cont=sc.nextLine();
            cd.setContenido(cont);
            System.out.println("Cuant ocupe (el espai que ocupe en GB per favor)");
            quant= sc.nextDouble();
            cd.almacenar(cont,quant);
        }else{
            cd.setContenido("");
            cd.almacenar("",0);
        }
        return cd;
    }

public static Vinilo vinilo(){
    String nombre;
    String resposta;
    String cont;
    double quant;
    Scanner sc=new Scanner(System.in);
    System.out.println("Dime com vols dir al disco");
    nombre=sc.nextLine();
    Vinilo vinilo=new Vinilo(nombre,0.29296875,"Vinilo");
    System.out.println("Vols añadir algun contingut (S/N)?");
    resposta=sc.nextLine();
    if(resposta.toUpperCase().equals("S")){
        System.out.println("Que vols afegir");
        cont=sc.nextLine();
        vinilo.setContenido(cont);
        System.out.println("Cuants kb te?");
        quant= sc.nextDouble();
        vinilo.almacenar(cont,quant);
    }else{
        vinilo.setContenido("");
        vinilo.almacenar("",0);
    }
    return vinilo;
}
public static BlueRay blueRay(){
    String nombre;
    String resposta;
    String cont;
    int capas;
    double quant;
    Scanner sc=new Scanner(System.in);
    System.out.println("Dime com vols dir al disco");
    nombre=sc.nextLine();
    System.out.println("Cuantas capas tiene");
    capas=sc.nextInt();
    sc.nextLine();
    BlueRay blueRay=new BlueRay(nombre, capas * 25,"Blue-Ray");
    blueRay.setCapas(capas);
    System.out.println("Vols añadir algun contingut (S/N)?");
    resposta=sc.nextLine();
    if(resposta.toUpperCase().equals("S")){
        System.out.println("Que vols afegir");
        cont=sc.nextLine();
        blueRay.setContenido(cont);
        System.out.println("Cuant ocupe (el espai que ocupe en GB per favor)?");
        quant= sc.nextDouble();
        blueRay.almacenar(cont,quant);
    }else{
        blueRay.setContenido("");
        blueRay.almacenar("",0);
    }
    return blueRay;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tipo;
        System.out.println("Dime de quin disco vols informacio (Disco duro/Cd/vinilo/blueRay)");
        tipo = sc.nextLine();
        if (tipo.toLowerCase().equals("cd")) {
            cd().info();
        }else if (tipo.toLowerCase().equals("disco duro")) {
            discoDuro().info();
        }else if (tipo.toLowerCase().equals("vinilo")) {
            vinilo().info();
        }else if (tipo.toLowerCase().equals("blue ray")) {
            blueRay().info();
        }
    }
}