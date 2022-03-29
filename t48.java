public class t48 {
    public static void main(String args[]){

        Materia a;
        Materia b;
        a = new Materia();
        b = new Materia();

        a.setNombre("FISICA");
        a.setProfesor("Juan");
        b.setNombre("INGLES");
        b.setProfesor("Carlos");

        System.out.println("Nombre de materia a: " + a.getNombre());
        System.out.println("Nombre de materia b: " + b.getNombre());
    }
}
