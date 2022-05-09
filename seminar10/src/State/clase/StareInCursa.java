package State.clase;

public class StareInCursa implements Stare{
    @Override
    public void doAction(Autobuz autobuz) {
        if(autobuz.getStare() instanceof StareLaCapatDeLinie){
            System.out.println("autobuzul: "+ autobuz.getNrAutobuz()+ " pleaca in cursa");
            autobuz.setStare(this);
        }else{
            System.out.println("autobuzul: "+ autobuz.getNrAutobuz()+" nu poate pleca in cursa");
        }
    }
}
