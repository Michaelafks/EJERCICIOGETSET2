public class Proyecto {

    private String nombre;
    private int progreso;
    private String responsable;
    private boolean terminado;

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()){
            this.nombre = nombre;
        }
    }

    public String getNombre(){
        return nombre;
    }

    public void setProgreso(int progreso){
        if (progreso <= 100 && progreso >= 0){
            this.progreso = progreso;
        }
    }

    public int getProgreso(){
        return progreso;
    }

    public void setResponsable(String responsable){
        if (responsable != null && !responsable.trim().isEmpty()){
            this.responsable = responsable;
        }

    }

    public String getResponsable(){
        return responsable;
    }

    public void setTerminado(boolean terminado){
        this.terminado = terminado;
    }

    public boolean getTerminado(){
        return terminado;
    }

    public void avanzar(int porcentaje) {
        if (porcentaje > 0 && progreso + porcentaje <= 100) {
            progreso = progreso + porcentaje;
        }
    }


}
