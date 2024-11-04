public class Steve extends PersonajeMinecraft {
    private String herramienta;

    public Steve (String nombre, int salud, int nivel, String herramienta){
        super(nombre, salud, nivel);
        this.herramienta = herramienta;
    }
    @Override
    public void accion(){
        String mensaje = "Steve recolecta hierbas usando "+ herramienta;
        if(nivel>5){
            mensaje +=" y recolecta el doble de recursos";
        }
        System.out.println(mensaje);
        ganarExperiencia();
    }
}
