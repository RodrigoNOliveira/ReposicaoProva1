package q4;
import java.util.ArrayList;

public class Time implements Comparable<Time> {
    private String nome;
    protected int vitorias;
    protected int qtdGols;
    protected ArrayList<Jogadores> listJogadores;
    protected Estadio[] vetorEstadio;
    private Jogadores capt;
    private int qtdEst;
    protected ArrayList<Integer> listGols;
    protected ArrayList<Integer> listVtr;

    public Time(String nome) {
        this.nome = nome;
        this.listJogadores = new ArrayList<Jogadores>();
        this.vetorEstadio = new Estadio[1];
        this.qtdEst = 0;
        this.vitorias = 0;
        this.qtdGols = 0;
        this.listGols = new ArrayList<Integer>();
        this.listVtr = new ArrayList<Integer>();

    }

    public void somarGols(int gol) {
        this.listGols.add(gol);

    }

    public void somarVitorias(int vitoria) {
        this.listVtr.add(vitoria);

    }

    public void adicionarJogador(Jogadores j) {
        this.listJogadores.add(j);
    }

    public void adicionarEstadio(Estadio e) {
        if (qtdEst < vetorEstadio.length) {
            this.vetorEstadio[this.qtdEst] = e;
            this.qtdEst++;
        }

    }

    public void capitao(Jogadores c) {
        this.capt = c;
    }

    public int ttGls() {
        qtdGols = 0;
        for (int i = 0; i < listGols.size(); i++) {

            if (listGols.get(i) != null) {
                qtdGols = qtdGols + listGols.get(i);
            }

        }
        return qtdGols;
    }

    public int ttVtr() {
        vitorias = 0;
        for (int i = 0; i < listVtr.size(); i++) {

            if (listVtr.get(i) != null) {
                vitorias = vitorias + listVtr.get(i);
            }

        }
        return vitorias;
    }

    public int ptcTt() {
        int ptsTt = 0;
        ptsTt = ttGls() + (ttVtr() * 2);
        return ptsTt;
    }

    public void geraInfo() {
        StringBuilder msg = new StringBuilder();
        msg.append("\n ------ Informações time ------\n");
        msg.append("\nTime: " + this.nome + " --------- Estádio: ");
        for (int i = 0; i < vetorEstadio.length; i++) {
            if (vetorEstadio[i] != null) {
                msg.append(vetorEstadio[i].getNome());
            } else {
                msg.append("Estádio não cadastrado");
            }
        }

        msg.append("\n\nGols  do time: ");
        msg.append(ttGls());
        msg.append("\n\nVitorias  do time: ");
        msg.append(ttVtr());
        msg.append("\n\nJogadores:");
        for (int i = 0; i < listJogadores.size(); i++) {
            if (listJogadores.get(i) != null) {
                msg.append(
                        "\n" + listJogadores.get(i).getNome());
            }

        }
        if (capt != null) {
            msg.append("\n\nCapitão do time: " + capt.getNome());
        } else {
            msg.append("\n\nCapitão não cadastrado");
        }

        System.out.println(msg.toString());
    }

    // Gets e Sets

    public ArrayList<Integer> getListVtr() {
        return listVtr;
    }

    public void setListVtr(ArrayList<Integer> listVtr) {
        this.listVtr = listVtr;
    }

    public Jogadores getCapt() {
        return capt;
    }

    public void setCapt(Jogadores capt) {
        this.capt = capt;
    }

    public ArrayList<Jogadores> getListJogadores() {
        return listJogadores;
    }

    public void setListJogadores(ArrayList<Jogadores> listJogadores) {
        this.listJogadores = listJogadores;
    }

    public Estadio[] getVetorEstadio() {
        return vetorEstadio;
    }

    public void setVetorEstadio(Estadio[] vetorEstadio) {
        this.vetorEstadio = vetorEstadio;
    }

    public int getQtdEst() {
        return qtdEst;
    }

    public void setQtdEst(int qtdEst) {
        this.qtdEst = qtdEst;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdGols() {
        return qtdGols;
    }

    public void setQtdGols(int qtdGols) {
        this.qtdGols = qtdGols;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public ArrayList<Integer> getListGols() {
        return listGols;
    }

    public void setListGols(ArrayList<Integer> listGols) {
        this.listGols = listGols;
    }

    @Override
    public int compareTo(Time tim) {
        return (tim.ptcTt() - ptcTt());
    }
}