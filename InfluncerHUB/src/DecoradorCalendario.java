public class DecoradorCalendario {

    public static String generarCalendarioPosts(int numDias, int numPostsPorDia) {

        if (numDias <= 0 || numPostsPorDia <= 0) {
            throw new IllegalArgumentException("Los números introducidos deben ser superiores a 0");
        }

        StringBuilder calendario = new StringBuilder();

        StringBuilder linea = new StringBuilder();
        linea.append("+----------".repeat(numPostsPorDia));
        linea.append("+\n");


        for (int dias = 1; dias < numDias + 1; dias++) {
            calendario.append(linea);

            for (int posts = 1; posts < numPostsPorDia + 1; posts++) {
                calendario.append("| D").append(dias).append("-P").append(posts).append("    ");
            }
            calendario.append("|\n");
        }
        calendario.append(linea);

        return calendario.toString();
    }

}