public class EnemigoMinecraft implements Atacable {
    private String nombre;
    private int fuerzaAtaque;

    public EnemigoMinecraft(String nombre, int fuerzaAtaque){
        this.nombre = nombre;
        this.fuerzaAtaque = fuerzaAtaque;
    }
    @Override
    public void atacar(PersonajeMinecraft personaje){
        int daño = fuerzaAtaque;
        if(fuerzaAtaque > 50){
            daño *=2;
        }
        System.out.println("El enemigo "+nombre+" ataca a causando "+ daño + " de daño");
        personaje.perderSalud();
    }
}
