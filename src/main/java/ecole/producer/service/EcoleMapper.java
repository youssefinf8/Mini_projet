package ecole.producer.service;
import ecole.producer.model.Ecolecsv;
import ecole.producer.model.Ecolejson;



public class EcoleMapper {
   
  
    public static Ecolejson toJson(Ecolecsv csv) {
        Ecolejson json = new Ecolejson();

        json.setrentreescolaire(csv.getrentreescolaire());
        json.setregion(csv.getregion());
        json.setacademie(csv.getacademie());
        json.setcommune(csv.commune());
        json.setnumeroecole(csv.getnumeroecole());
        json.rep(csv.getrep());
        json.repp(csv.getrepp());
        json.nbrtotal(csv.getnbrtotal());
        json.nbrelevehorsULIS(csv.getnbrelevehorsULIS());
        json.nbreleveULIS(csv.getnbreleveULIS());
        json.setnbreleveCPhorsLIS(csv.getnbreleveCPhorsLIS());
        json.elemhorsULIS(csv.getnbrelevehorsULIS());
        json.setnbrelevece1horUJIS(csv.getnbrelevece1horUJIS());


        return json;
    }
    
}
