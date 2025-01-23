package ecole.producer.model;

import com.opencsv.bean.CsvBindByName;
public class Ecolecsv {
    @CsvBindByName(column = "Rentrée scolaire")
    private Integer rentreescolaire;
    @CsvBindByName(column = "Région académique")
    private String region;
    @CsvBindByName(column = "Académie")
    private String academie;
    @CsvBindByName(column = "Département")
    private String departement;
    @CsvBindByName(column = "Commune")
    private String commune;
    @CsvBindByName(column = "Numéro de l'école")
    private Integer numeroecole;
    @CsvBindByName(column = "Dénomination principale")
    private String denominationprincipale;
    @CsvBindByName(column = "REP")
    private Integer rep;
    @CsvBindByName(column = "REP +")
    private Integer repp;
    @CsvBindByName(column = "Nombre total d'élèves")
    private Integer nbrtotal;
    @CsvBindByName(column = "Nombre d'élèves en pré")
    private Integer nbrelevepre;
    @CsvBindByName(column = "élémentaire hors ULIS")
    private Integer elemhorsULIS;
    @CsvBindByName(column = "Nombre d'élèves en élémentaire hors ULIS")
    private Integer nbrelevehorsULIS;
    @CsvBindByName(column = "Nombre d'élèves en ULIS")
    private Integer nbreleveULIS;
    @CsvBindByName(column = "Nombre d'élèves en CP hors ULIS")
    private Integer nbreleveCPhorsLIS;
    @CsvBindByName(column = "Nombre d'élèves en CE1 hors ULIS")
    private Integer nbrelevece1horUJIS;
   


    public Integer  getrentreescolaire() {
        return rentreescolaire;
    }
    public void setrentreescolaire(Integer rentreescolaire) {
        this.rentreescolaire = rentreescolaire;
    }
    public String getregion() {
        return region;
    }
    public void setregion(String region) {
        this.region = region;
    }
    public String getacademie() {
        return academie;
    }
    public void setacademie(String academie) {
        this.academie = academie;
    }
    public String commune() {
        return commune;
    }
    public void setcommune(String commune) {
        this.commune = commune;
    }
    public Integer getnumeroecole() {
        return numeroecole;
    }
    public void setnumeroecole(Integer numeroecole) {
        this.numeroecole = numeroecole;
    }
    public String getdenominationprincipale() {
        return denominationprincipale;
    }
    public void setSecteurAct3(String denominationprincipale) {
        this.denominationprincipale = denominationprincipale;
    }
    public String denominationprincipale() {
        return denominationprincipale;
    }
    public void rep(Integer rep) {
        this.rep = rep;
    }
    public Integer getrep() {
        return rep;
    }
    public void repp(Integer repp) {
        this.repp = repp;
    }
    public Integer getrepp() {
        return repp;
    }
    public void nbrtotal(Integer nbrtotal) {
        this.nbrtotal = nbrtotal;
    }
    public Integer getnbrtotal() {
        return nbrtotal;
    }
    public void elemhorsULIS(Integer elemhorsULIS) {
        this.elemhorsULIS = elemhorsULIS;
    }
    public Integer getnbrelevehorsULIS() {
        return nbrelevehorsULIS;
    }
    public void nbrelevehorsULIS(Integer nbrelevehorsULIS) {
        this.nbrelevehorsULIS = nbrelevehorsULIS;
    }
    public Integer nbreleveULIS() {
        return nbreleveULIS;
    }
    public void nbreleveULIS(Integer nbreleveULIS) {
        this.nbreleveULIS = nbreleveULIS;
    }
    public Integer getnbreleveULIS() {
        return nbreleveULIS;
    }
    public void nbrelevepre(Integer nbreleveULIS) {
        this.nbreleveULIS = nbreleveULIS;
    }
    public Integer getnbreleveCPhorsLIS() {
        return nbreleveCPhorsLIS;
    }
    public void setnbreleveCPhorsLIS(Integer nbreleveCPhorsLIS) {
        this.nbreleveCPhorsLIS = nbreleveCPhorsLIS;
    }
    public Integer getnbrelevece1horUJIS() {
        return nbrelevece1horUJIS;
    }
    public void setnbrelevece1horUJIS(Integer nbrelevece1horUJIS) {
        this.nbrelevece1horUJIS = nbrelevece1horUJIS;
    }
}
