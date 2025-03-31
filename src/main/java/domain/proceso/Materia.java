package domain.proceso;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private Integer idMateria;
    private String nombreMateria;
    private List<Materia> correlativas;

    public Materia(String nombreMateria, Integer idMateria) {
        this.nombreMateria = nombreMateria;
        this.idMateria = idMateria;
        this.correlativas = new ArrayList<>();
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }
    public Object getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }
}
