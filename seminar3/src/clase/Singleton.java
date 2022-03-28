package clase;

//design pattern creational
public class Singleton {
    private static Singleton instanta; // 1) //=new Singleton(); versiune eager initializations =>dezavantaj: initializat prematur deci nu se foloseste spatiul alocat neaparat atunci cand referim clasa

    //singleton=INSTANTA UNICA/ OBIECT UNIC  =  constructorul va fi apelat o singura data
    private Singleton() { }; //important! de adaugat constructorul altfel se va crea unul automat public => nu mai e singleton

    //2)
//    public static Singleton getInstance(){
//        if(instanta==null) { //versiune lazy initialization (cea mai flosita)
//            instanta = new Singleton();
//        }
//        return instanta;
//    }

    //3) //versiune thread-safe initializations
    public static synchronized Singleton getInstance(){
        if(instanta==null) {
            instanta = new Singleton();
        }
        return instanta;
    }

}
