public class Sistema{

    public void System(){
        DataModel locations = new DataModel();
        locations = locations.structureJson();
        int option = 0;
        User user = new User();
        CLI cli = new CLI();
        //System.out.println(locations.toString());
        cli.bienvenida(user);
        System.out.println(user.name);
        while(option != 5){
            option = cli.menuPrincipal(user.getName());
            switch (option){
                case 1:
                    gestioUsuaris(cli);
                    option = 0;
                    break;
                case 2:
                    String name = cli.findLocation();
                    locations.locationNameToString(name,locations);
                    break;
                case 3:
                    boolean error = true;
                    while (error == true) {
                        String origen = cli.getOrigen(locations);
                        if (origen.equals("error")) {
                            error = true;
                        } else {
                            String desti = cli.getDesti(locations);
                            if (desti.equals("error")) {
                                error = true;
                            } else {
                                String sortidaArribada = cli.getSortidaArribada();
                                if(sortidaArribada.equals("s")){
                                    sortidaArribada = "false";
                                }else{
                                    sortidaArribada = "true";
                                }
                                String data = cli.getFecha();
                                if (data.equals("error")) {
                                    error = true;
                                } else {
                                    String hora = cli.getHora();
                                    if (hora.equals("error")) {
                                        error = true;
                                    } else {
                                        int maxDistancia = cli.getmaxDistancia();
                                        ApiRequest apiReq = new ApiRequest();
                                        Ruta ruta = apiReq.planejarRuta(origen, desti, data, hora,sortidaArribada,maxDistancia);
                                        cli.printaRuta(ruta);
                                        error = false;
                                    }
                                }
                            }
                        }
                    }
                    break;
                case 4:
                    int codiParada = cli.esperaAutobus();
                    ApiRequest apiReq2 = new ApiRequest();
                    apiReq2.calcularEsperaBus(codiParada);

                    break;
            }
        }


    }

    private void gestioUsuaris(CLI cli){
        char option = ' ';
        while (option != 'f') {
            option=cli.gestioUsuarisCLI();
            switch (option){
                case 'a':

                    break;
                case 'b':

                    break;
                case 'c':

                    break;
                case 'd':

                    break;
            }
        }
    }


}
