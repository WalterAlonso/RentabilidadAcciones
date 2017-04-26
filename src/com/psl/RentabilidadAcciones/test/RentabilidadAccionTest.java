package com.psl.RentabilidadAcciones.test;

import java.util.ArrayList;

import org.json.JSONObject;
import org.json.JSONStringer;

import com.psl.RentabilidadAcciones.modelo.RentabilidadAccion;

import junit.framework.TestCase;

public class RentabilidadAccionTest extends TestCase {
	
	 /**
     * Se valida que la rentabilidad sea positiva
     */
    public void testValidarRentabilidadPositiva() {
    	ArrayList<Integer> preciosAccion = new ArrayList<Integer>();
    	preciosAccion.add(1100);
    	preciosAccion.add(1500);
    	preciosAccion.add(1200);
    	preciosAccion.add(1300);
    	preciosAccion.add(1700);
    	preciosAccion.add(1600);
    	preciosAccion.add(1400);
    	preciosAccion.add(1500);
    	
    	RentabilidadAccion rentabilidadAccion = new RentabilidadAccion(preciosAccion);
    	int rentabilidad = rentabilidadAccion.darRentabilidad();
    	
    	assertEquals( "El valor de la rentabilidad debe ser 1000", 1000, rentabilidad);
    }
    
	 /**
     * Se valida que la rentabilidad sea positiva
     */
    public void testValidarRentabilidadNegativa() {
    	ArrayList<Integer> preciosAccion = new ArrayList<Integer>();
    	preciosAccion.add(2000);
    	preciosAccion.add(1800);
    	preciosAccion.add(1600);
    	preciosAccion.add(1500);
    	preciosAccion.add(1400);
    	preciosAccion.add(1200);
    	
    	RentabilidadAccion rentabilidadAccion = new RentabilidadAccion(preciosAccion);
    	int rentabilidad = rentabilidadAccion.darRentabilidad();
    	
    	assertEquals( "El valor de la rentabilidad debe ser 0", 0, rentabilidad);
    }
}
