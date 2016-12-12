package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.validation.*;



/**
 * Company entity managed by Ebean
 */
@Entity 
public class Restaurante extends com.avaje.ebean.Model {

    private static final long serialVersionUID = 1L;

	@Id
    public Long id;
    
    @Constraints.Required
    public String name;
    
    public long cantidad;
    public long precio;
    
    /**
     * Generic query helper for entity Company with id Long
     */
    public static Find<Long,Restaurante> find = new Find<Long,Restaurante>(){};
    
    public static List<Restaurante> listadoBebidas() {
		return
		find.all();
		
	};

    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Restaurante c: Restaurante.find.orderBy("name").findList()) {
            options.put(c.id.toString(), c.name);
        }
        return options;
    }

}

