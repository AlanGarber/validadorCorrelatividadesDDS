package domain.proceso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private List<Materia> materiasAprobadas;
    private Integer legajo;

    public Alumno(Integer legajo) {
        this.materiasAprobadas = new ArrayList<>();
        this.legajo = legajo;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void agregarMateriasAprobadas(Materia ... materias){ // Similar al de aeropuertos
        Collections.addAll(this.materiasAprobadas, materias);
    }
}
