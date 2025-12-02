public class AppInfluencerHub{

    public static void main(String[] args) {

        try {
            InfluencerNegocio inf = new InfluencerNegocio();
            //setters
            inf.setNombre("Juan");
            inf.setredSocial("Instagram");
            inf.setTarifaBasePorPost(100);
            inf.setSeguidores(1000);
            //getters
            System.out.println("nombre del influencer "+ inf.getNombre());
            System.out.println("red social: " + inf.getRedSocial());
            System.out.println("tarifa por post: " + inf.getTarifaBasePorPost());
            System.out.println("Número de seguidores: "+ inf.getseguidores());

            //método de cálculo de los ingresos mensuales
            double Tarifa = inf.calcularIngresosMes(5, true, 0.5f);
            System.out.print("la tarifa con las bonificaciones es: " + Tarifa+ "\n");

            //método de cálculo de el crecimientos de los seguidores
            int nSeguidores = inf.crecimientoSeguidoresProyectado(10);
            System.out.println("\ndebería tener " + nSeguidores);
            //método de el calendario
            String calendario = DecoradorCalendario.generarCalendarioPosts(5, 3);
            System.out.println(calendario);

            //excepciones
        } catch (IllegalArgumentException e) {
            System.out.println("excepción: " + e.getMessage());
        }
    }
}
