package org.example;

public class ExtractorDireccion {
    public String buscarDireccion(String texto) {
        String[] palabrasClave = {"para", "mi direccion es", "en", "hacia", "calle"};
        String[] delimitadoresFinales = {",", "\\.", "gracias", "quiero", "y", "me gustaria"};

        for (String clave : palabrasClave) {
            if (texto.contains(clave)) {
                int inicio = texto.indexOf(clave) + clave.length();
                String subcadena = texto.substring(inicio).trim();

                for (String delimitador : delimitadoresFinales) {
                    int fin = subcadena.indexOf(delimitador);
                    if (fin != -1) {
                        return subcadena.substring(0, fin).trim();
                    }
                }

                return subcadena;
            }
        }
        return null;
    }
}