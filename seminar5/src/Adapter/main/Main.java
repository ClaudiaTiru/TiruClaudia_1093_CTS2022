package Adapter.main;

import Adapter.clase.metrou.ValidatorMetrou;
import Adapter.clase.metrou.ValidatorScanare;
import Adapter.clase.stb.ValidatorAdapterDeClase;
import Adapter.clase.stb.ValidatorAdapterDeObiecte;
import Adapter.clase.stb.ValidatorNFC;
import Adapter.clase.stb.ValidatorSTB;


public class Main {
    private static void validareAbonamente(ValidatorSTB validator){
        validator.valideazaAbonament();
    }

    //daca avem 2 clase neaparat trb adapter de clase nu cel de obiecte
    //daca avem mai multe clase e recomandat sa-l facem pe cel de obiecte

    public static void main(String[] args) {

        //testare adapter de obiecte
        ValidatorScanare validatorScanare = new ValidatorScanare();
        ValidatorAdapterDeObiecte adapterDeObiecte = new ValidatorAdapterDeObiecte(validatorScanare);

        adapterDeObiecte.valideazaAbonament();
        adapterDeObiecte.valideazaBilet();

        //testare adapter de clase
        ValidatorAdapterDeClase adapterDeClase = new ValidatorAdapterDeClase();
        adapterDeClase.valideazaAbonament();
        adapterDeClase.valideazaBilet();


        //EXEMPLU MOTIV PT UTILIZARE ADAPTER:

        //pt met statica validareAbonamente:
        ValidatorSTB val = new ValidatorNFC();
        validareAbonamente(val);

        ValidatorMetrou valM = new ValidatorScanare();
       // validareAbonamente(valM);  -> nu permite; asta-i motivul pt care implementam adapterul

        //asadar:
        ValidatorAdapterDeClase validatorAdapterDeClase=new ValidatorAdapterDeClase();
        validareAbonamente(validatorAdapterDeClase);


    }
}
