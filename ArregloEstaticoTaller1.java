/*
 Diseñe un algortimo de tal manera que le permita la creación de un array 
de cadenas, instancie los meses del año en la matriz, e imprime cada mes.
 */
package arregloestaticotaller1;

/**
 *
 * @author ALEX BELTRAN
 */
public class ArregloEstaticoTaller1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declara una array de cadenas
        String[] arr;
        
        //asignando memoria para 12 cadenas
        arr=new String[12];
        
        //inicializa el primer elemento del array
        arr[0]="Enero";
        //inicializa el segundo elemento del array
        arr[1]="Febrero";
        //inicializa el tercero elemento del array
        arr[2]="Marzo";
        //inicializa el cuarto elemento del array
        arr[3]="Abril";
        //inicializa el quinto elemento del array
        arr[4]="Mayo";
        //inicializa el sexto elemento del array
        arr[5]="Junio";
        ///inicializa el septimo elemento del array
        arr[6]="Julio";
        //inicializa el octavo elemento del array
        arr[7]="Agosto";
        //inicializa el noveno elemento del array
        arr[8]="Septiembre";
        //inicializa el decimo elemento del array
        arr[9]="Octubre";
        //inicializa el onceavo elemento del array
        arr[10]="Noviembre";
        //inicializa el doceavo elemento del array
        arr[11]="Diciembre";
        
        //accediendo a los elementos del array
        for(int i=0; i<arr.length; i++){
            System.out.println("El mes en el indice "+i+" es "+arr[i]);
        }
    }  
}
