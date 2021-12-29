package q4;

import java.util.ArrayList;
import java.util.Collections;

public class Campeonato {

    private String nome;
    private int qtdPtds;
    private int anoCamp;
    protected ArrayList<Partidas> listPartidas;
    protected ArrayList<PartidasJogadas> listJogadas;
    protected ArrayList<Time> listTimes;
    private Time tim;
    private int qtdGols = 0;

    public Campeonato(String nome, int anoCamp) {
        this.qtdPtds = 0;
        this.nome = nome;
        this.anoCamp = anoCamp;
        this.listPartidas = new ArrayList<Partidas>();
        this.listJogadas = new ArrayList<PartidasJogadas>();
        this.listTimes = new ArrayList<Time>();

    }

    public void addTime(Time tim) {
        this.listTimes.add(tim);
    }

    public void addPtd(Partidas ptds) {
        if (this.qtdPtds < 10) {
            this.listPartidas.add(ptds);
            this.qtdPtds++;
        }
    }

    public void addPtdJgds(PartidasJogadas ptdsJgds) {
        if (this.qtdPtds < 10) {
            this.listJogadas.add(ptdsJgds);
            this.qtdPtds++;
        }
    }

    public void addGols(int gols) {
        qtdGols += tim.getQtdGols();
        this.tim.setQtdGols(qtdGols);
    }

    public void geraListaPtds() {
        StringBuilder msg = new StringBuilder();
        msg.append("\n ------ Lista de partidas ------\n");
        msg.append("\nCampeonato: " + this.nome + " --------- Ano de: " + this.anoCamp);
        msg.append("\n\n Partida ----------- Mandante ---------------- Visitante\n\n");
        for (int i = 0; i < listPartidas.size(); i++) {
            if (listPartidas.get(i) != null) {
                msg.append(
                        "\n" + listPartidas.get(i).getId() + " --------- " + listPartidas.get(i).getMandante()
                                + " ---------------- " + listPartidas.get(i).getVisitante());
            }

        }
        System.out.println(msg.toString());
    }

    public void geraListaJogadas() {
        StringBuilder msg = new StringBuilder();
        msg.append("\n ------- Lista de partidas Jogadas --------\n");
        msg.append("\nCampeonato: " + this.nome + " ----------- Ano de: " + this.anoCamp);
        msg.append("\n\nMandante --- Placar  --- Visitante ------- Vencedor ------- Estadio\n\n");
        for (int i = 0; i < listJogadas.size(); i++) {
            if (listJogadas.get(i) != null) {

                msg.append(
                        "\n" + listJogadas.get(i).getMandante() + " -------- " + listJogadas.get(i).getGolsMandante()
                                + " x "
                                + listJogadas.get(i).getGolsVisitante() + " -------- "
                                + listJogadas.get(i).getVisitante()
                                + " -------- " + listJogadas.get(i).getVencedor() + " -------- "
                                + listPartidas.get(i).getEstJgd());

            }

        }
        System.out.println(msg.toString());
    }

    public void geraListaClassificacao() {

        StringBuilder msg = new StringBuilder();
        msg.append("\n ----- Classificação -------\n");
        msg.append("\nCampeonato: " + this.nome + " - Ano de: " + this.anoCamp);
        msg.append("\n\nTime ------- Vitorias ------- Gols Feitos -------- Pontuação\n\n");

        Collections.sort(this.listTimes);

        for (int i = 0; i < this.listTimes.size(); i++) {
            if (listJogadas.get(i) != null) {
                msg.append(
                        "\n" + this.listTimes.get(i).getNome() + " -------- " + this.listTimes.get(i).ttVtr()
                                + " --------- " + this.listTimes.get(i).ttGls() + " -------- "
                                + this.listTimes.get(i).ptcTt());
            }

        }
        System.out.println(msg.toString());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdPtds() {
        return qtdPtds;
    }

    public void setQtdPtds(int qtdPtds) {
        this.qtdPtds = qtdPtds;
    }

    public ArrayList<Partidas> getListPartidas() {
        return listPartidas;
    }

    public void setListPartidas(ArrayList<Partidas> listPartidas) {
        this.listPartidas = listPartidas;
    }

    public int getAnoCamp() {
        return anoCamp;
    }

    public void setAnoCamp(int anoCamp) {
        this.anoCamp = anoCamp;
    }

    public ArrayList<PartidasJogadas> getListJogadas() {
        return listJogadas;
    }

    public void setListJogadas(ArrayList<PartidasJogadas> listJogadas) {
        this.listJogadas = listJogadas;
    }

}
