package designpatterns.structuralpatterns.adapter;

import designpatterns.structuralpatterns.adapter.adapters.AdaptadorPiezaCuadrada;
import designpatterns.structuralpatterns.adapter.cuadrado.PiezaCuadrada;
import designpatterns.structuralpatterns.adapter.redondo.AgujeroRedondo;
import designpatterns.structuralpatterns.adapter.redondo.PiezaRedonda;

public class EjemploAdapter {
    public static void main(String[] args) {

        AgujeroRedondo agujero = new AgujeroRedondo(5);
        PiezaRedonda piezaP = new PiezaRedonda(5);

        if (agujero.encaja(piezaP)) {
            System.out.println("La pieza redonda encaja en el agujero");
        } else {
            System.out.println("La pieza redonda no encaja");
        }

        PiezaCuadrada piezaCuadradoPequenio = new PiezaCuadrada(2);
        PiezaCuadrada piezaCuadradoGrande = new PiezaCuadrada(20);
        // agujero.encaja(smallSqPeg); // no se compila

        // El adaptador resuelve el problema.
        AdaptadorPiezaCuadrada adaptadorPiezaCuadradaPequenia = new AdaptadorPiezaCuadrada(piezaCuadradoPequenio);
        AdaptadorPiezaCuadrada adaptadorPiezaCuadradaGrande = new AdaptadorPiezaCuadrada(piezaCuadradoGrande);
        if (agujero.encaja(adaptadorPiezaCuadradaPequenia)) {
            System.out.println("La pieza cuadrada encaja en el orificio redondo");
        }
        if (!agujero.encaja(adaptadorPiezaCuadradaGrande)) {
            System.out.println("La pieza cuadrada NO encaja en el orificio redondo");
        }

    }
}
