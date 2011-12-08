package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class Atividade extends Model {
    public String titulo;
    public String descricao;
    
    @ManyToOne
    public TipoAtividade tipoAtividade;
}
