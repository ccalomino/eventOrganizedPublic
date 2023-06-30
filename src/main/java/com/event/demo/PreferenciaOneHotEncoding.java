package com.event.demo;

import java.util.*;

public class PreferenciaOneHotEncoding {
    public static void main(String[] args) {
        // Datos de ejemplo
        List<String> usuarios = Arrays.asList("Usuario1", "Usuario2", "Usuario3");
        List<String> vinos = Arrays.asList("Vino1", "Vino2", "Vino3");
        List<String> platos = Arrays.asList("Plato1", "Plato2", "Plato3");
        
        // Preferencia seleccionada
        String usuarioSeleccionado = "Usuario2";
        String vinoSeleccionado = "Vino3";
        String platoSeleccionado = "Plato1";
        
        // Aplicar One-Hot Encoding
        double[] encodedVector = oneHotEncode(usuarios, vinos, platos, usuarioSeleccionado, vinoSeleccionado, platoSeleccionado);
        
        // Imprimir el vector codificado
        System.out.println(Arrays.toString(encodedVector));
    }
    
    public static double[] oneHotEncode(List<String> usuarios, List<String> vinos, List<String> platos, String usuarioSeleccionado, String vinoSeleccionado, String platoSeleccionado) {
        int numUsuarios = usuarios.size();
        int numVinos = vinos.size();
        int numPlatos = platos.size();
        
        double[] encodedVector = new double[numUsuarios + numVinos + numPlatos];
        
        int usuarioIndex = usuarios.indexOf(usuarioSeleccionado);
        int vinoIndex = vinos.indexOf(vinoSeleccionado);
        int platoIndex = platos.indexOf(platoSeleccionado);
        
        encodedVector[usuarioIndex] = 1.0;
        encodedVector[numUsuarios + vinoIndex] = 1.0;
        encodedVector[numUsuarios + numVinos + platoIndex] = 1.0;
        
        return encodedVector;
    }
}
