package metodossetget;

public class MetodosSetGet {
    
    public static void main(String[] args) {
        Usuario u1 = new Usuario("fabrizio", "123");
        Usuario u2 = new Usuario("maria", "123");
        u1.mostrarDatos();
        u2.mostrarDatos();
        u1.setNombre("fabri");
        System.out.println("Retornando con el GET: "+u1.getNombre());
        u2.setClave("dfg");
        System.out.println("Retornando con el GET: "+u2.getClave());
    }
    
}
