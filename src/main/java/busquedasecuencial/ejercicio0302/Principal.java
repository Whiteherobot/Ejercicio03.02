package busquedasecuencial.ejercicio0302;
//@michi-gaby

public class Principal {

    public static void main(String[] args) {
        var v1 = new Inscribete("Inscribete");
        v1.setVisible(true);
        var v2 = new DatosPersonales("Datos Personales");
        v2.setVisible(true);
        var v3 = new InformacionDeCarrera("Informacion carrera");
        v3.setVisible(true);
        var v4 = new CrearGrupo("Crear Grupo");
        v4.setVisible(true);
        var v5 = new Matricula("Matricula");
        v5.setVisible(true);
    }
}
