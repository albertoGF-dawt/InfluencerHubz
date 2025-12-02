public class InfluencerNegocio {
    private String Nombre;
    private String redSocial;
    private int seguidores;
    private float tarifaBasePorPost;
    private int Rdia;


    //setters
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public void setredSocial(String redSocial) {
        this.redSocial = redSocial;
    }

    public void setTarifaBasePorPost(float tarifaBasePorPost) {
        this.tarifaBasePorPost = tarifaBasePorPost;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    //getters
    public String getNombre() {
        return Nombre;
    }

    public String getRedSocial() {
        return redSocial;
    }

    public int getseguidores() {
        return seguidores;
    }

    public float getTarifaBasePorPost() {
        return tarifaBasePorPost;
    }


    double calcularIngresosMes(int numPost, boolean bonificacion, float rendimiento) {
        // Validaciones obligatorias
        if (numPost <= 0) {
            throw new IllegalArgumentException("El número de posts debe ser mayor que 0.");
        }

        if (rendimiento < 0.0f || rendimiento > 1.0f) {
            throw new IllegalArgumentException("El rendimiento debe estar entre 0.0 y 1.0");
        }
        double tarifaBaseMes = numPost * tarifaBasePorPost;
        System.out.println("La tarifa base multiplicado por el número de post SIN bonficación es de: " + tarifaBaseMes);
        if (bonificacion == true) {
            tarifaBaseMes = tarifaBaseMes + (tarifaBaseMes * 0.15);
            if (rendimiento > 0.7 && rendimiento < 0.9) {
                tarifaBaseMes = tarifaBaseMes + (tarifaBaseMes * 0.10);
            } else if (rendimiento > 0.9) {
                tarifaBaseMes = tarifaBaseMes + (tarifaBaseMes * 0.25);
            }

        }
        return tarifaBaseMes;
    }

    int crecimientoSeguidoresProyectado(int dias) {
        if (dias <= 0) {
            throw new IllegalArgumentException("el número debe ser superior a 0");
        }


        seguidores += 100 + (int) (seguidores * 0.01);


        if (dias == 1) {
            return seguidores;
        }
        Rdia= Rdia +1;
        System.out.println("en el día " + Rdia + "tendrá "+ seguidores);
        return crecimientoSeguidoresProyectado(dias - 1);
    }
}
