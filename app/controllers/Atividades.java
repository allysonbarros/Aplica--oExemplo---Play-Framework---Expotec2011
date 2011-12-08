package controllers;

import java.util.List;

import models.Atividade;
import models.TipoAtividade;
import play.data.validation.Required;
import play.mvc.*;

public class Atividades extends Controller {

    public static void index() {
        Application.index();
    }
    
    public static void atividadesPorCategoria(String titulo) {
    	List<TipoAtividade> tipoAtividades = TipoAtividade.findAll();
    	List<Atividade> atividades = Atividade.find("byTipoAtividade.titulo", titulo).fetch();
    	render(tipoAtividades, atividades);
    }
    
    public static void visualizarAtividade(Long id) {
    	List<TipoAtividade> tipoAtividades = TipoAtividade.findAll();
    	Atividade atividade = TipoAtividade.findById(id);
    	render(tipoAtividades, atividade);
    }
}
