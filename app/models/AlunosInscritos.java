package models;

import play.*;
import play.data.validation.Email;
import play.data.validation.Required;
import play.data.validation.Unique;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class AlunosInscritos extends Model {
	@Required
    public String cpf;
    
	public long matricula;
	
    @Required
	public String nome;
	
    @Required @Email
    public String email;
    
    @ManyToOne
    public Atividade atividade;
}
