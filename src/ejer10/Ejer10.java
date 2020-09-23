
package ejer10;

import javax.swing.JOptionPane;

public class Ejer10 {

    public static void main(String[] args) {
        
        int n,contar_des=0,des=0,contar_apr=0,apr=0,suma_notas=0;
        int promedio = 0;
        int nota_baja=0,nota_alta=0;
        int  notas[];
        int aux;
        
        do{
            n=Integer.parseInt(JOptionPane.showInputDialog("Digite cuantas notas va a ingresar: "));
            
       notas =new int[n];
        
            for(int i=0;i<n;i++){
      
                notas[i]=Integer.parseInt(JOptionPane.showInputDialog((i+1)+". Digite la nota: "));
                suma_notas+=notas[i];
               
                    if(notas[i]<5){//desaprobados
                        
                        contar_des+=notas[i];//la suma de las notas negativas
                        des++;
                        }
                    else if(notas[i]>10){//aprobados
                        contar_apr+=notas[i];
                        apr++;
                        }

                
            }
            //metodo burbuja para halalr el orden
            for(int i=0;i<n-1;i++){
                for(int j=0;j<n-1;j++){
                    if(notas[j]>notas[j+1]){
                      aux=notas[j];
                notas[j]=notas[j+1];
                notas[j+1]=aux;
                
                }  
                }
                
                  
            }
            
            promedio=suma_notas/n;
            JOptionPane.showMessageDialog(null, "Los Alumnos Aprobados: "+apr++);
            JOptionPane.showMessageDialog(null, "El promedio de notas: "+promedio);
            JOptionPane.showMessageDialog(null, "Los Alumnos desaprobados: "+des++);
            JOptionPane.showMessageDialog(null, "La nota mas baja es: "+notas[0]);
            JOptionPane.showMessageDialog(null, "La nota mas alta es: "+notas[n-1]);

        }while(n<0);
        
        
        
        
    }
    
}
