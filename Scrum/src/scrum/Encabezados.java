/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrum;

public class Encabezados {

   private String[] titulos={"QUE SON LAS METODOLOGIAS ÁGILES ",  "QUÉ ES SCRUM","ROLES EN SCRUM"," HERRAMIENTAS DE SCRUM"};  
   
   public String enviar(int posicion){
       return titulos[posicion];
   }
}
