public class Alex extends PersonajeMinecraft {
    private String materialConstruccion;

    public Alex (String nombre, int salud, int nivel, String herramienta){
        super(nombre, salud, nivel);
        this.materialConstruccion = herramienta;
    }
    @Override
    public void accion(){
        String mensaje = "Alex construye un futuro junto a ella con "+ materialConstruccion;
        if(nivel>3){
            mensaje +=" y puede construir un futuro mas avanzado";
        }
        System.out.println(mensaje);
        ganarExperiencia();
    }
}
