public class EstructurasControl{
    public static int Sumar(int numero1, int numero2){
        return numero1+numero2;
    }
    public static void Presentar(String nombre){
        System.out.println("Buenas tardes, soy "+nombre);
    } 
    public  static void main(String[] args) {
        /*
        Sintaxis de condicional
        if(condicional){
        
        }
        else if (condicional2) {
        }
        ...
        else if (condicionaln) {
        }
        else{
        }
        */

       /*
        int decesision;
        switch (decision) {
            case 1: 
               //instrucciones
               break;
            case 2:
                //instrucciones
                break;
        
            default:
               throw new AssertionError();
        }
        */
        /*
            for(int i=0;i<=ValorDeParo;i++){ 
                instrucciones
            }
            while(condición){
                instrucciones
                instruccion-> condicionParo
            }
            do{
                instrucciones
            }while(condicion);
        */
            // for(int i=0;i<=10;i++){ 
            //     if(i==7){
            //         continue;
            //     }
            //     else if(i == 9){
            //         System.out.println("Fin del ciclo");
            //         break;
            //     }
            //     System.out.println(i);

            // }       
        /*
        Ciclos "Foreach" para recorrer arreglos:
        Sintaxis: for (TypeData td: Array a){
        
        }

        String nombres[ ] ={"Enrique","Raúl","José","Daniel"};
        
        for(String nombre:nombres){
            System.out.println(nombre);
        }
        */
        /* 
        
            NivelAcceso TipoDatoReturn NombreFuncion(TipoDatoP p1,...,TipoDatoP pn)}{

            }
            void = vacio = no regresamos nada
            int
            float
            double
            char
            String

        */
       System.out.println(Sumar(1,12));
        /* 
            n! = 1*2*3*4*5*6*....*n Factorial
            Sn = n(n+1)/2   SumaN
        */

    }
}
                