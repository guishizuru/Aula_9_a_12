public class Olimpiada_9_3_3 {
        public static void main(String[] args) {
            final  int tamanhovetor = 12;

           String [] tiposDeCarga = new String[tamanhovetor];

           for( int i = 0; i < tamanhovetor; i ++){
               if(i % 2 ==0 && i < 6){
                   tiposDeCarga[i] = "Leve";
               }else if(i % 2 == 0 && i >= 6){
                   tiposDeCarga[i] = "pesado";
               }else if (i % 2 != 0 && i < 6){
                   tiposDeCarga[i] = "fragil";
               }else if ( i % 2 != 0 && i >= 6 ) {
                   tiposDeCarga[i] = "perigoso";

               }
               System.out.print("[" + tiposDeCarga[i] + "]");
           }

        }
}


