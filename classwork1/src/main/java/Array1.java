public class Array1 {
    public static void main(String[] args) {
        int [] a= new int [30];
        int r;
        int counter1=0;
        int counter2=0;
        int counter3=0;
        int counter4=0;
        for(int i=0;i<a.length; i++ ){
            r=(int)(Math.random()*(200))-100;
            a[i]=r;
            if (a[i]%2!=0 && a[i]<0){
                counter1++;
            }
            else  if (a[i]%2==0 && a[i]<0){
               counter2++;
            }
            else  if (a[i]%2==0 && a[i]>0){
               counter3++;
            }
            else  if (a[i]%2!=0 && a[i]>0) {
                counter4++;
            }
        }
        // memory allocation target
        int [] array1= new int [counter1];
        int [] array2= new int [counter2];
        int [] array3= new int [counter3];
        int [] array4= new int [counter4];
        for(int i=0;i<a.length; i++ ){
            r=(int)(Math.random()*(200))-100;
            a[i]=r;
            if (a[i]%2!=0 && a[i]<0){
                a[i]=array1[i];
            }
            else  if (a[i]%2==0 && a[i]<0){
                a[i]=array2[i];
            }
            else  if (a[i]%2==0 && a[i]>0){
                a[i]=array3[i];
            }
            else  if (a[i]%2!=0 && a[i]>0) {
                a[i]=array4[i];
            }
        }

    }
}
