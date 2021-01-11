public class BinaryTree {
    
}

class simpul
    { String elemen;
    simpul kiri;
    simpul kanan;
    }

class pohon{ 
    public static simpul akar;
    public static void deklarasiPohon(){ 
        akar = null;
    }
    
    public static simpul tambahSimpul(simpul Penunjuk, String ELEMEN){ 
        if (Penunjuk == null)
        { simpul baru = new simpul();
        baru.elemen = ELEMEN;
        baru.kiri = null;
        baru.kanan = null;
        Penunjuk = baru;
        return(Penunjuk);
        }
        else
        { if (ELEMEN.compareTo(Penunjuk.elemen) < 0 )
            { Penunjuk.kiri = tambahSimpul(Penunjuk.kiri, ELEMEN);
                return(Penunjuk);
            }
            else
                { Penunjuk.kanan= tambahSimpul(Penunjuk.kanan, ELEMEN);
            return(Penunjuk);
            }
        }
    }
    // public static void main(String[] args)
    // {
    // deklarasiPohon();
    // }

    public static void preOrder(simpul Penunjuk){ 
        if(Penunjuk != null)
        { System.out.print(Penunjuk.elemen + ",");
            preOrder(Penunjuk.kiri);
            preOrder(Penunjuk.kanan);
        }
    }

    public static void inOrder(simpul Penunjuk)
        { if(Penunjuk != null)
            { inOrder(Penunjuk.kiri);
            System.out.print(Penunjuk.elemen + ",");
            inOrder(Penunjuk.kanan);
        }
    }
    public static void postOrder(simpul Penunjuk){ 
        if(Penunjuk != null)
        { postOrder(Penunjuk.kiri);
            postOrder(Penunjuk.kanan);
            System.out.print(Penunjuk.elemen + ",");
        }
    }
    public static void main(String[] args){
        deklarasiPohon();
        akar =tambahSimpul(akar,"2");
        akar =tambahSimpul(akar,"5");
        akar =tambahSimpul(akar,"7");
        akar =tambahSimpul(akar,"2");
        akar =tambahSimpul(akar,"9");
        akar =tambahSimpul(akar,"6");
        akar =tambahSimpul(akar,"5");
        akar =tambahSimpul(akar,"11");
        akar =tambahSimpul(akar,"4");

        preOrder(akar);
        System.out.println();
        inOrder(akar);
        System.out.println();
        postOrder(akar);
    }
}


