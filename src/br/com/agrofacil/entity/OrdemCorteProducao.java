package br.com.agrofacil.entity;

import br.com.agrofacil.frames.SwingColumn;
import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author Kelson
 */
public class OrdemCorteProducao implements java.io.Serializable {

    @SwingColumn(description = "Id",colorOfBackgound="")    
    private Integer id;
    @SwingColumn(description = "Safra",colorOfBackgound="")
    private Safra safra;
    @SwingColumn(description = "Fazenda",colorOfBackgound="")
    private Fazenda fazenda;
    @SwingColumn(description = "Setor",colorOfBackgound="")
    private Setor setor;
    @SwingColumn(description = "Talhao",colorOfBackgound="")
    private Talhao talhao;
    @SwingColumn(description = "TipoCorte",colorOfBackgound="")
    private TipoPlantioColheita tipoCorte;
    @SwingColumn(description = "QtdEstimativa",colorOfBackgound="")
    private int qtdEstimativaTon;
    @SwingColumn(description = "QtdArea",colorOfBackgound="")
    private float qtdAreaOrdem;
    @SwingColumn(description = "TipoQueima",colorOfBackgound="")
    private TipoCorteQueima tipoQueima;
    @SwingColumn(description = "DataCorte",colorOfBackgound="")
    private Date dataCorte;
    @SwingColumn(description = "HoraCorte",colorOfBackgound="")
    private String horaCorte;
    @SwingColumn(description = "QtdThc",colorOfBackgound="")
    private float qtdThc;
    @SwingColumn(description = "TipoColheita",colorOfBackgound="")
    private TipoPlantioColheita tipoColheita;
    @SwingColumn(description = "Frente",colorOfBackgound="")
    private FrenteTransporte frenteTransporte;
    @SwingColumn(description = "DataQueima",colorOfBackgound="")
    private Date dataQueima;
    @SwingColumn(description = "HoraQueima",colorOfBackgound="")
    private String horaQueima;
    @SwingColumn(description = "CanaCrua",colorOfBackgound="")
    private boolean canaCrua;
    @SwingColumn(description = "QtdAreaTotal",colorOfBackgound="")
    private float qtdAreaTotal;
    @SwingColumn(description = "QtdToneladaEst",colorOfBackgound="")
    private int qtdToneladaEst;
    @SwingColumn(description = "DataFechamento",colorOfBackgound="")
    private Date dataFechamentoOrdem;

    public OrdemCorteProducao() {
    }

    public OrdemCorteProducao(Integer id) {
        this.id = id;
    }

    public OrdemCorteProducao(Integer id, Safra safra, Fazenda fazenda, Setor setor, Talhao talhao, TipoPlantioColheita tipoCorte, int qtdEstimativaTon, float qtdAreaOrdem, TipoCorteQueima tipoQueima, Date dataCorte, String horaCorte, float qtdThc, TipoPlantioColheita tipoColheita, FrenteTransporte frenteTransporte, Date dataQueima, String horaQueima, boolean canaCrua, float qtdAreaTotal, int qtdToneladaEst, Date dataFechamentoOrdem) {
        this.id = id;
        this.safra = safra;
        this.fazenda = fazenda;
        this.setor = setor;
        this.talhao = talhao;
        this.tipoCorte = tipoCorte;
        this.qtdEstimativaTon = qtdEstimativaTon;
        this.qtdAreaOrdem = qtdAreaOrdem;
        this.tipoQueima = tipoQueima;
        this.dataCorte = dataCorte;
        this.horaCorte = horaCorte;
        this.qtdThc = qtdThc;
        this.tipoColheita = tipoColheita;
        this.frenteTransporte = frenteTransporte;
        this.dataQueima = dataQueima;
        this.horaQueima = horaQueima;
        this.canaCrua = canaCrua;
        this.qtdAreaTotal = qtdAreaTotal;
        this.qtdToneladaEst = qtdToneladaEst;
        this.dataFechamentoOrdem = dataFechamentoOrdem;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Safra getSafra() {
        return safra;
    }

    public void setSafra(Safra safra) {
        this.safra = safra;
    }

    public Fazenda getFazenda() {
        return fazenda;
    }

    public void setFazenda(Fazenda fazenda) {
        this.fazenda = fazenda;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Talhao getTalhao() {
        return talhao;
    }

    public void setTalhao(Talhao talhao) {
        this.talhao = talhao;
    }

    public TipoPlantioColheita getTipoCorte() {
        return tipoCorte;
    }

    public void setTipoCorte(TipoPlantioColheita tipoCorte) {
        this.tipoCorte = tipoCorte;
    }

    public int getQtdEstimativaTon() {
        return qtdEstimativaTon;
    }

    public void setQtdEstimativaTon(int qtdEstimativaTon) {
        this.qtdEstimativaTon = qtdEstimativaTon;
    }

    public float getQtdAreaOrdem() {
        return qtdAreaOrdem;
    }

    public void setQtdAreaOrdem(float qtdAreaOrdem) {
        this.qtdAreaOrdem = qtdAreaOrdem;
    }

    public TipoCorteQueima getTipoQueima() {
        return tipoQueima;
    }

    public void setTipoQueima(TipoCorteQueima tipoQueima) {
        this.tipoQueima = tipoQueima;
    }

    public Date getDataCorte() {
        return dataCorte;
    }

    public void setDataCorte(Date dataCorte) {
        this.dataCorte = dataCorte;
    }

    public String getHoraCorte() {
        return horaCorte;
    }

    public void setHoraCorte(String horaCorte) {
        this.horaCorte = horaCorte;
    }

    public float getQtdThc() {
        return qtdThc;
    }

    public void setQtdThc(float qtdThc) {
        this.qtdThc = qtdThc;
    }

    public TipoPlantioColheita getTipoColheita() {
        return tipoColheita;
    }

    public void setTipoColheita(TipoPlantioColheita tipoColheita) {
        this.tipoColheita = tipoColheita;
    }

    public FrenteTransporte getFrenteTransporte() {
        return frenteTransporte;
    }

    public void setFrenteTransporte(FrenteTransporte frenteTransporte) {
        this.frenteTransporte = frenteTransporte;
    }

    public Date getDataQueima() {
        return dataQueima;
    }

    public void setDataQueima(Date dataQueima) {
        this.dataQueima = dataQueima;
    }

    public String getHoraQueima() {
        return horaQueima;
    }

    public void setHoraQueima(String horaQueima) {
        this.horaQueima = horaQueima;
    }

    public boolean getCanaCrua() {
        return canaCrua;
    }

    public void setCanaCrua(boolean canaCrua) {
        this.canaCrua = canaCrua;
    }

    public float getQtdAreaTotal() {
        return qtdAreaTotal;
    }

    public void setQtdAreaTotal(float qtdAreaTotal) {
        this.qtdAreaTotal = qtdAreaTotal;
    }

    public int getQtdToneladaEst() {
        return qtdToneladaEst;
    }

    public void setQtdToneladaEst(int qtdToneladaEst) {
        this.qtdToneladaEst = qtdToneladaEst;
    }

    public Date getDataFechamentoOrdem() {
        return dataFechamentoOrdem;
    }

    public void setDataFechamentoOrdem(Date dataFechamentoOrdem) {
        this.dataFechamentoOrdem = dataFechamentoOrdem;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OrdemCorteProducao other = (OrdemCorteProducao) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
            
}
