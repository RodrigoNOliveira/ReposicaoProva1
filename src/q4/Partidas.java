package q4;
public class Partidas {
    private String mandante;
    private String visitante;
    private int id;
    private String estJgd;
    private Time tim;

    public Time getTim() {
        return tim;
    }

    public void setTim(Time tim) {
        this.tim = tim;
    }

    public Partidas(int id, String mandante, String visitante, String estJgd) {
        this.id = id;
        this.mandante = mandante;
        this.visitante = visitante;
        this.estJgd = estJgd;

    }

    public String getEstJgd() {
        return estJgd;
    }

    public void setEstJgd(String estJgd) {
        this.estJgd = estJgd;
    }

    public String getMandante() {
        return mandante;
    }

    public void setMandante(String mandante) {
        this.mandante = mandante;
    }

    public String getVisitante() {
        return visitante;
    }

    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}