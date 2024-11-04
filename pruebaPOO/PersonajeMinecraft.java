public abstract class PersonajeMinecraft {
    protected String nombre;
    protected int  salud;
    protected int nivel;

    public PersonajeMinecraft(String nombre, int salud, int nivel){
        this.nombre = nombre;
        this.salud = salud;
        this.nivel = salud;
    }
    public abstract void accion();

    public final void perderSalud() {
        salud -= 10;
    }
    public void ganarExperiencia() {
        nivel++;
    }
    public int getSalud() {
        return salud;
    }
    public int getNivel() {
        return nivel;
    }
}