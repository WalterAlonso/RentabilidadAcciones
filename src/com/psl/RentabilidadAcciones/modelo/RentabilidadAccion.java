package com.psl.RentabilidadAcciones.modelo;

import java.util.ArrayList;

/**
 * Calcula la rentabilidad entre varias acciones
 * @author WAlonsoR
 *
 */
public class RentabilidadAccion {
	
	private ArrayList<Integer> listAcciones;
		
		/**
		 * Ctor que recibe las acciones
		 * @param listAcciones
		 */
		public RentabilidadAccion(ArrayList<Integer> listAcciones) {
			this.listAcciones = listAcciones;
		}
		
		/**
		 * calcula la rentabilidad obtenida
		 * @return la rentabilidad generada
		 */
		public int darRentabilidad() {
			int rentabilidad = 0;
			for(int indice =0; indice < (listAcciones.size()-1); indice++)	{
				int accionHoy = listAcciones.get(indice);
				int accionManana = listAcciones.get(indice+1);
				int diferenciaRentabilidad = accionManana - accionHoy; 
				if (diferenciaRentabilidad > 0) {
					rentabilidad += diferenciaRentabilidad;
				}
			}
			return rentabilidad;		
		}
}
