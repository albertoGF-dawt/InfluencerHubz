public class InfluencerNegocio {
    private String Nombre;
    private String redSocial;
    private int seguidores;
    private float tarifaBasePorPost;


    //setters
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public void setredSocial(String redSocial) {
        this.redSocial = redSocial;
    }

    public void setTarifaBasePorPost(float tarifaBasePorPost){
        this.tarifaBasePorPost = tarifaBasePorPost;
    }

    public void setSeguidores(int seguidores){
        this.seguidores= seguidores;
    }


    double calcularIngresosMes(int numPost, boolean bonificacion,float rendimiento ){
        // Validaciones obligatorias
        if (numPost <= 0) {
            throw new IllegalArgumentException("El número de posts debe ser mayor que 0.");
        }

        if (rendimiento < 0.0f || rendimiento > 1.0f) {
            throw new IllegalArgumentException("El rendimiento debe estar entre 0.0 y 1.0");
        }
        double  tarifaBaseMes= numPost*tarifaBasePorPost;
        if (bonificacion== true){
            tarifaBaseMes=tarifaBaseMes+(tarifaBaseMes*0.15);
            if (rendimiento>0.7 && rendimiento<0.9){
                tarifaBaseMes=tarifaBaseMes+(tarifaBaseMes*0.10);
            } else if (rendimiento>0.9) {
                tarifaBaseMes=tarifaBaseMes+(tarifaBaseMes*0.25);
            }
        }
        return tarifaBaseMes;
    }
    int crecimientoSeguidoresProyectado(int dias){
        if (dias == 0) {
            return seguidores;
        }
        seguidores += 100 + (int)(seguidores * 0.01);
        return crecimientoSeguidoresProyectado(dias - 1);
    }
}

