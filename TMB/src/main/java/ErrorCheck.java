public class ErrorCheck {

    public static boolean combruebaSortidaArribada(String data){
        if(data.equals("s") || data.equals(("a"))){
            return true;
        }else{
            System.out.println("Error! S'ha d'introduir \"s\" o \"a\"!");
            return false;
        }
    }

}
