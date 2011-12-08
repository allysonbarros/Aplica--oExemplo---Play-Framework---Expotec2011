package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.UniqueConstraint;

import play.data.validation.Required;
import play.data.validation.Unique;
import play.db.jpa.Model;

@Entity
public class Atividade extends Model {
	@Required @Unique
    public String titulo;
	
	@Required
    public String descricao;
	
    public int duracao;
    
    public String requisitos;
    
    @Required
    public String orientadorAtividade;
    
    @Required
    public String resposavelAtividade;
    
    @ManyToOne
    public TipoAtividade tipoAtividade;
    
    @OneToMany(mappedBy="atividade")
    public List<AlunosInscritos> alunosInscritos;
}
