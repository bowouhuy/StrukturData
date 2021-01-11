public class ProgramTumpukan{ 
    public static int N = 5;
    public static int atas = 4;
    public static void PUSH (String tumpukan[], String data){ 
        if (atas == N-1) //jika tumpukan penuh
            { System.out.println("maap, tumpukan penuh, PUSH " + data
            + " tidak dapat dilakukan");
        }else //jika tumpukan tidak penuh
            { atas = atas + 1;
            tumpukan[atas] = data;
            System.out.println("PUSH " + data + " berhasil..");
        }
    }

    public static String POP (String tumpukan[]){
        String hasil;
        if (atas < 0 ) //jika tumpukan kosong
            { hasil = "TUMPUKAN KOSONG, POP GAGAL DILAKUKAN";
        }
        else //jika tumpukan tidak kosong
            { hasil = tumpukan[atas];
            atas = atas - 1;
        }
        return (hasil);
    }

    public static void LihatTumpukan(String tumpukan[]){
        System.out.println("");
        System.out.println("--TUMPUKAN:-");
        for (int i=atas; i>=0; i--)
            { System.out.println(tumpukan[i]);
        }
        System.out.println("--akhir tumpukan-");
        System.out.println("");
    }

    public static void main (String[] args){ 
        String tumpukan[] = new String[5];
        PUSH (tumpukan, "H");
        PUSH (tumpukan, "A");
        PUSH (tumpukan, "L");
        PUSH (tumpukan, "O");
        //menghapus 3 element
        LihatTumpukan(tumpukan);
        POP (tumpukan);
        POP (tumpukan);
        POP (tumpukan);
        LihatTumpukan(tumpukan);
        // Menambah T-E-M-A-N
        PUSH (tumpukan, "T");
        PUSH (tumpukan, "E");
        PUSH (tumpukan, "M");
        PUSH (tumpukan, "A");
        PUSH (tumpukan, "N");
        LihatTumpukan(tumpukan);
        //menghapus 2 element
        POP (tumpukan);
        POP (tumpukan);
        LihatTumpukan(tumpukan);
    }
}