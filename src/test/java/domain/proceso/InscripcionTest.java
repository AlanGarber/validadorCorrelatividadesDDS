package domain.proceso;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class InscripcionTest {

    @Test
    public void aprobada(){
        Materia AMI = new Materia("Analisis Matematico I",1);

        Materia AGA = new Materia("Algebra y Geometria Analitica",2);

        Materia AMII = new Materia("Analisis Matematico II",3);

        AMII.setCorrelativas(List.of(AMI, AGA));

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAlumno(new Alumno(2137290));
        inscripcion.getAlumno().agregarMateriasAprobadas(AMI, AGA);
        inscripcion.setMateriasInscripcion(List.of(AMII));

        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    public void noAprobada() {
        Materia AMI = new Materia("Analisis Matematico I",1);
        Materia AGA = new Materia("Algebra y Geometria Analitica",2);
        Materia AMII = new Materia("Analisis Matematico II",3);

        AMII.setCorrelativas(List.of(AMI, AGA));

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAlumno(new Alumno(2137290));
        inscripcion.getAlumno().agregarMateriasAprobadas(AMI);
        inscripcion.setMateriasInscripcion(List.of(AMII));

        Assertions.assertFalse(inscripcion.aprobada());
    }
}