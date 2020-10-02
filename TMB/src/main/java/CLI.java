import java.util.Scanner;


public class CLI {

    public void bienvenida(User user){
        Scanner scan = new Scanner(System.in);
        System.out.println("Benvingut a l'aplicació de TMBJson! Si us plau, introdueix les dades que se't demanen");
        System.out.println("Nom d'usuari: ");
        user.name = scan.nextLine();
        System.out.println("Correu electrònic: ");
        user.email = scan.nextLine();
        System.out.println("Any de naixement: ");
        user.born = scan.nextInt();
        System.out.println("La informació s'ha registrat amb èxit!");
    }

    public int menuPrincipal(String name){
        System.out.println("Benvingut de nou a l'aplicació de TMBJson "+name+" !");
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Gestió d'usuari");
        System.out.println("2. Buscar localitzacions");
        System.out.println("3. Planejar ruta");
        System.out.println("4. Temps d'espera del bus");
        System.out.println("5. Sortir\n");

        System.out.println("Selecciona una opció:");
        int option = scan.nextInt();
        return option;
    }
    public char gestioUsuarisCLI(){
        Scanner scan = new Scanner(System.in);
        System.out.println("a)Les meves localitzacions");
        System.out.println("b)Historial de localitzacions");
        System.out.println("c)Les meves rutes");
        System.out.println("d)Parades i estacions preferides");
        System.out.println("e)Estacions inaugurades el meu any de naixement");
        System.out.println("f)Tornar al menú principal \n");
        System.out.println("Selecciona opció: ");
        String option = scan.nextLine();
        char optionReturn = option.charAt(0);
        System.out.println("Char en funcion = "+optionReturn);
        return optionReturn;

    }

    public String getOrigen(DataModel locations) {
        String origen = null;
        double[] origenFloat;
        Scanner scan = new Scanner(System.in);
        System.out.println("Origen (lat,lon/nom localització)");
        origen = scan.nextLine();
        if (origen.matches("^(\\-?\\d+(\\.\\d+)?),\\s*(\\-?\\d+(\\.\\d+)?)$")) {
            return origen;
        } else {
            origenFloat = locations.getCoord(origen, locations);
            if(origenFloat == null){
                System.out.println("TMB està fent tot el possible perquè el bus i el metro facin aquesta ruta en un futur.\n");
                return "error";
            }
            origen = String.valueOf(origenFloat[1])+","+String.valueOf(origenFloat[0]);
            if (!origen.matches("^(\\-?\\d+(\\.\\d+)?),\\s*(\\-?\\d+(\\.\\d+)?)$")){
                System.out.println("TMB està fent tot el possible perquè el bus i el metro facin aquesta ruta en un futur.\n");
                return "error";
            }
            return origen;
        }
    }
    public String getDesti(DataModel locations) {
        String desti = null;
        double[] destiFloat;
        Scanner scan = new Scanner(System.in);
        System.out.println("Desti (lat,lon/nom localització)");
        desti = scan.nextLine();
        if (desti.matches("^(\\-?\\d+(\\.\\d+)?),\\s*(\\-?\\d+(\\.\\d+)?)$")) {
            return desti;

        } else {
            destiFloat = locations.getCoord(desti, locations);
            if(destiFloat == null){
                System.out.println("TMB està fent tot el possible perquè el bus i el metro facin aquesta ruta en un futur.\n");
                return "error";
            }
            desti = String.valueOf(destiFloat[1])+","+String.valueOf(destiFloat[0]);
            if(!desti.matches("^(\\-?\\d+(\\.\\d+)?),\\s*(\\-?\\d+(\\.\\d+)?)$")){
                System.out.println("TMB està fent tot el possible perquè el bus i el metro facin aquesta ruta en un futur.\n");
                desti = "error";
                return desti;
            }
            return desti;
        }

    }
    public String getSortidaArribada() {
        String sortidaArribada = "";
        boolean error = false;
        Scanner scan = new Scanner(System.in);
        while (error == false) {
            System.out.println("Dia/hora seran de sortida o d'arribada? (s/a))");
            sortidaArribada = scan.nextLine();
            error = ErrorCheck.combruebaSortidaArribada(sortidaArribada);
            if (error == true){
                return sortidaArribada;
            }
        }
        return null;
    }

    public String getFecha() {
        String data = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Dia? (MM-DD-YYYY)");

        data = scan.nextLine();
        if(data.matches("^(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])-(19|20)\\d{2}$")) {
            return data;
        }else{
            System.out.println("Error, hi ha algun paràmetre erroni :(\n");
            data = "error";
            return data;
        }

    }
    public String getHora() {
        String hora = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Hora? (HH:MMam/HH:MMpm)");

        hora = scan.nextLine();
        if(hora.matches("^(0[1-9]|1[012]):([0-5][0-9])(am|pm)$")) {
            return hora;
        }else{
            System.out.println("Error, hi ha algun paràmetre erroni :(");
            hora = "error";
            return hora;
        }

    }
    public int getmaxDistancia(){
        int maxDistancia = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Màxima distància caminant en metres?");
        maxDistancia = scan.nextInt();
        return maxDistancia;

    }
    public String findLocation(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introdueix el nom d'una localització: ");
        String nom = scan.nextLine();
        return nom;
    }
    public void printaRuta(Ruta ruta){

        if(ruta != null){
            System.out.println("Origen");
            System.out.println("|");
            for(int i = 0; i<ruta.getPasos().size();i++){
                if(ruta.getPasos().get(i).getModo().equals("WALK")){
                    System.out.println("caminar "+ruta.getPasos().get(i).getLegDuration());
                }else{
                    System.out.println(ruta.getPasos().get(i).getLinea()+" "+ruta.getPasos().get(i).getFrom()+" -> "+ruta.getPasos().get(i).getTo()+" ("+ruta.getPasos().get(i).getLegDuration()+")");
                }
//            System.out.println(ruta.getPasos().get(i).);
                System.out.println("|");
            }
            System.out.println("Desti\n");
        }else{
            System.out.println("Error en el sistema");
        }


    }
    public int esperaAutobus(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introdueix el codi de parada: ");
        int codiParada = scan.nextInt();
        return codiParada;
    }
}
