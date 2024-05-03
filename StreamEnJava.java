package C24B5;

import java.util.Arrays;
import java.util.List;

public class StreamEnJava {

    public static void main(String[] args) {

        List<Integer> numeros= Arrays.asList(1,2,3,4,5,6,7,8,9);

        for(int i=0; i<numeros.size(); i++){
            if(numeros.get(i) % 2 ==0){
                System.out.println(numeros.get(i));
            }
        }
        System.out.println("================");

        for (int numero : numeros){
            if(numero % 2 ==0){
                System.out.println(numero);
            }
        }
        System.out.println("================");


        numeros.stream().filter(i-> i%2==0).forEach(System.out::println);
        System.out.println("================");

        //Suma de todos los valores pares
        int sumados = numeros.stream().filter(i-> i%2==0).mapToInt(Integer::intValue).sum();
        System.out.println(sumados);

    }

}