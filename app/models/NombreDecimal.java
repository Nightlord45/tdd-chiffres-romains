package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

public class NombreDecimal {
    @Required
    public int valeur;
    public NombreDecimal() {}
    public NombreDecimal(int n) {this.valeur = n; }
    public static String[] table_unites={"","I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XX"};
    
    
    public String en_romain(){
	return en_romain_unite(valeur);
    }

    public String en_romain_unite(int n){
	return table_unites[n];
    }

}

