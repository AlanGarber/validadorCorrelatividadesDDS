package domain.proceso;

import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materiasInscripcion;

    public Boolean aprobada(){

        if (materiasInscripcion.isEmpty()) {
            return false;
        }

        for (Materia materia : materiasInscripcion) {
            for (Materia correlativa : materia.getCorrelativas()) {
                if (!alumno.getMateriasAprobadas().contains(correlativa)) {
                    return false;
                }
            }
        }
        return true;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Materia> getMateriasInscripcion() {
        return materiasInscripcion;
    }

    public void setMateriasInscripcion(List<Materia> materiasInscripcion) {
        this.materiasInscripcion = materiasInscripcion;
    }
}
