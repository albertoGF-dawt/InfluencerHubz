public class AppInfluencerHub{

    public static void main(String[] args) {

        try {
            InfluencerNegocio inf = new InfluencerNegocio();

            inf.setNombre("Juan");
            inf.setredSocial("Instagram");
            inf.setTarifaBasePorPost(100);
            inf.setSeguidores(1000);

            double ingresosMes = inf.calcularIngresosMes(5, true, 0.85f);
            System.out.println("Ingresos del mes: " + ingresosMes);

            int nSeguidores = inf.crecimientoSeguidoresProyectado(10);
            System.out.println("Se han obtenido " + nSeguidores + " seguidores");

            String calendario = DecoradorCalendario.generarCalendarioPosts(5, 3);
            System.out.println(calendario);

        } catch (IllegalArgumentException e) {
            System.out.println("excepción: " + e.getMessage());
        }
    }
}
