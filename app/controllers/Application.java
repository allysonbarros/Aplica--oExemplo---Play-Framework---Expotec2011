package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
    	List<TipoAtividade> tipoAtividades = TipoAtividade.findAll();
    	List<Atividade> atividades = Atividade.findAll();
        render(tipoAtividades, atividades);
    }
    
    public static void visualizarAtividade(Long id) {
    	List<TipoAtividade> tipoAtividades = TipoAtividade.findAll();
    	Atividade atividade = TipoAtividade.findById(id);
    	render(tipoAtividades, atividade);
    }
}