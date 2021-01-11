public class ProgramAntrian {
    public static int N = 5;
    public static int belakang = -1;
    public static void ENQUEUE (String antrian[], String data){ 
        if (belakang == N-1) //jika antrian penuh
        { System.out.println("maap, antrian penuh, ENQUEUE "
            + data + " tidak dapat dilakukan");
        }
        else //jika antrian tidak penuh
        { belakang = belakang + 1;
            antrian[belakang] = data;
        System.out.println("ENQUEUE " + data + " berhasil..");
        }
    }

    public static String DEQUEUE (String antrian[]){
        String hasil;
        if (belakang < 0 ) //jika antrian kosong
            { hasil = "ANTRIAN KOSONG, DEQUEUE GAGAL DILAKUKAN";
        }
        else //jika antrian tidak kosong
            { hasil = antrian[0];
            //----menggeser data kedua dst, maju selangkah ke depan
            for (int i=0; i<=belakang-1; i++)
                { antrian[i] = antrian[i+1];
                }
            belakang = belakang - 1;
        }
        return (hasil);
    }

    public static void LihatAntrian(String antrian[]){ 
        System.out.println("------------------------------------------");
        System.out.print("ISI ANTRIAN : (depan)");
        for (int i=0; i<=belakang; i++)
            { System.out.print(" " + antrian[i]);
            }
        System.out.println(" (belakang)");
        System.out.println("------------------------------------------");
    }
    public static void main (String[] args){ 
        String antrian[] = new String[5];
        ENQUEUE (antrian, "H");
        ENQUEUE (antrian, "A");
        ENQUEUE (antrian, "L");
        ENQUEUE (antrian, "O");
        //////////////////////////////////
        LihatAntrian(antrian);
        //menghapus 3 element
        DEQUEUE(antrian);
        DEQUEUE(antrian);
        DEQUEUE(antrian);
        LihatAntrian(antrian);
        // Menambah T-E-M-A-N
        ENQUEUE (antrian, "T");
        ENQUEUE (antrian, "E");
        ENQUEUE (antrian, "M");
        ENQUEUE (antrian, "A");
        ENQUEUE (antrian, "N");
        LihatAntrian(antrian);
        //menghapus 2 element
        DEQUEUE(antrian);
        DEQUEUE(antrian);
        LihatAntrian(antrian);
    }
}
