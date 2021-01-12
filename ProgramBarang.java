
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class ProgramBarang {
       
    public static void inputBarang(String barang[], int qty[], int harga[], double subTotal[], int index){
        Scanner sc = new Scanner(System.in);

            System.out.print("Nama barang : ");
            barang[index]=sc.nextLine();
            System.out.print("Banyaknya : ");
            qty[index]=sc.nextInt();
            System.out.print("Harga Eceran : ");
            harga[index]=sc.nextInt();
            double total = harga[index] * qty[index];
            subTotal[index] = total;
    }

    public static void showBarang(String barang[], int qty[], int harga[], double subTotal[], int sort[]){
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);

        String tbl = "| %-2d | %-30s | %-9s | %-12s | %-16s |%n";

        System.out.format("+----+--------------------------------+-----------+--------------+------------------+%n");
        System.out.format("| No | Nama Barang                    | Banyaknya | Harga Eceran |     SubTotal     |%n");
        System.out.format("+----+--------------------------------+-----------+--------------+------------------+%n");
        for(int i=0; i<sort.length; i++){
            System.out.format(tbl, i+1, barang[sort[i]], qty[sort[i]], harga[sort[i]], kursIndonesia.format(subTotal[sort[i]]));
        }
        System.out.format("+----+--------------------------------+-----------+--------------+------------------+%n");
          
    }

    public static void main(String[] args){
        int row = 10;
        //Deklarasi array
        String [] barang = new String[row];  
        int [] qty = new int[row];
        int [] harga = new int[row];
        double [] subTotal = new double[row];
        int index =0;
        for(index=0; index<row; index++){
            inputBarang(barang, qty, harga, subTotal, index);
            
        }
        int [] dump = new int[row];
        for(int z=0; z<dump.length; z++){
            dump[z]=z;
        }
        System.out.println("DATA SEMUA BARANG");
        showBarang(barang, qty, harga, subTotal, dump);
        
        
        int a = 0;
        for(int i=0; i<subTotal.length; i++){
            if(subTotal[i]>15000){
                a=a+1;
            }
        }
        int [] sort = new int[a];
        int c = 0;
        for(int b=0; b<subTotal.length; b++){
            if(subTotal[b]>15000){
                sort[c]=b;
                c=c+1;
            }
        }

        
        System.out.println("DATA BARANG YANG DIATAS 15000");
        showBarang(barang, qty, harga, subTotal, sort);
    }
}
