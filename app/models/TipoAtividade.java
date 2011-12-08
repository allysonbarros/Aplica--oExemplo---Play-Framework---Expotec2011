package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class TipoAtividade extends Model {
    public String titulo;
    
    @OneToMany(mappedBy="tipoAtividade")
    public List<Atividade> ativides;
}
