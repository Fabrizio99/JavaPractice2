package metodossetget;

public class Usuario {
    String nombre;
    String clave;
    
    public Usuario(String nu, String cu){
        this.nombre = nu;
        this.clave  = cu;
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre de usurio : "+nombre);
        System.out.println("Su clave es: "+clave);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
}
