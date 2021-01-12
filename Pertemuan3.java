
import java.util.Scanner;

class pertemuan3{ 
    
    public static int N=5;
//--------------------------------------------------
//--- Fungsi untuk mengentri data ke dalam Larik ---
//--------------------------------------------------
public static void ngentriData(formatBiodata biodataMahasiswa[]){
//bagian entri data ke dalam struktur larik ----------------
Scanner masukan = new Scanner(System.in);
// int bacaTombol=0;
for (int i=0; i<=N-1; i++)
{ System.out.print("Silakan masukkan nama anda : ");
biodataMahasiswa[i].nama = masukan.next();
// System.out.print("Silakan masukkan alamat anda : ");
// biodataMahasiswa[i].alamat = masukan.next();
// System.out.print("Silakan masukkan umur anda : ");
// biodataMahasiswa[i].umur = masukan.nextInt();
// System.out.print("Silakan masukkan Jenis Kelamin anda : ");
// try
// { bacaTombol = System.in.read();
// }
// catch(java.io.IOException e)
// {
// }
// biodataMahasiswa[i].jekel = (char)bacaTombol;
// System.out.println("Silakan masukkan hobi (maks 3) : ");
// System.out.print("hobi ke-0 : ");
// biodataMahasiswa[i].hobi[0] = masukan.next();

// System.out.print("hobi ke-1 : ");
// biodataMahasiswa[i].hobi[1] = masukan.next();
// System.out.print("hobi ke-2 : ");
// biodataMahasiswa[i].hobi[2] = masukan.next();
// System.out.print("Silakan masukkan IPK anda : ");
// biodataMahasiswa[i].ipk = masukan.nextFloat();
// System.out.println("");
}
}
//--------------------------------------------------
//--- Fungsi untuk menampilkan data ---
//--------------------------------------------------
public static void tampilkanData(formatBiodata biodataMahasiswa[])
{
//bagian menampilkan isi struktur Larik --------------------------
System.out.println("---------------------------------------------");
System.out.println("NAMA ALAMAT UMUR JEKEL HOBI1 HOBI2 HOBI3 IPK");
System.out.println("---------------------------------------------");
for (int i=0; i<=N-1; i++)
{ System.out.print (biodataMahasiswa[i].nama + " ");
// System.out.print (biodataMahasiswa[i].alamat + " ");
// System.out.print (biodataMahasiswa[i].umur + " ");
// System.out.print (biodataMahasiswa[i].jekel + " ");
// System.out.print (biodataMahasiswa[i].hobi[0] + " ");
// System.out.print (biodataMahasiswa[i].hobi[1] + " ");
// System.out.print (biodataMahasiswa[i].hobi[2] + " ");
// System.out.println(biodataMahasiswa[i].ipk);
}
System.out.println("---------------------------------------------");
}

public static void tambahDataDiDepan(formatBiodata biodataMahasiswa[])
{
//bagian membuat record sementara untuk menampung data baru-------------
formatBiodata biodataMahasiswaBaru = new formatBiodata();
//bagian entri data baru ke penyimpan sementara-----------------------
Scanner masukan = new Scanner(System.in);
// int bacaTombol=0;
System.out.print("Silakan masukkan nama anda : ");
biodataMahasiswaBaru.nama = masukan.next();
// System.out.print("Silakan masukkan alamat anda : ");
// biodataMahasiswaBaru.alamat = masukan.next();
// System.out.print("Silakan masukkan umur anda : ");
// biodataMahasiswaBaru.umur = masukan.nextInt();
// System.out.print("Silakan masukkan Jenis Kelamin anda : ");
// try
// { bacaTombol = System.in.read();
// }
// catch(java.io.IOException e)
// {
// }
// biodataMahasiswaBaru.jekel = (char)bacaTombol;
// System.out.println("Silakan masukkan hobi (maks 3) : ");
// System.out.print("hobi ke-0 : ");
// biodataMahasiswaBaru.hobi[0] = masukan.next();
// System.out.print("hobi ke-1 : ");
// biodataMahasiswaBaru.hobi[1] = masukan.next();
// System.out.print("hobi ke-2 : ");
// biodataMahasiswaBaru.hobi[2] = masukan.next();
// System.out.print("Silakan masukkan IPK anda : ");
// biodataMahasiswaBaru.ipk = masukan.nextFloat();
//bagian menggeser isi larik mulai dari Belakang s/d 0 selangkah ke bawah
for (int i=N-1; i>= 0; i--)
{ biodataMahasiswa[i+1] = biodataMahasiswa[i];
}
//bagian memindahkan data baru ke larik ke-0-----------------------
biodataMahasiswa[0] = biodataMahasiswaBaru;
//memperbaharui banyaknya data (N), banyaknya data bertambah satu------
N++;
}


//--------------------------------------------------
//--- Program Utama ---
//--------------------------------------------------
public static void main(String[] args)
{ //bagian deklarasi record berbasis LARIK -----------------------
    int x=1;
    for(int i =1; i<x; i++){
        
    }
    // biodataMahasiswa[1] = new formatBiodata();
    // biodataMahasiswa[2] = new formatBiodata();
    // biodataMahasiswa[3] = new formatBiodata();
    // biodataMahasiswa[4] = new formatBiodata();
    formatBiodata biodataMahasiswa[] = new formatBiodata[N];
    for(int i=0; i<N; i++){
        biodataMahasiswa[i] = new formatBiodata();
        tambahDataDiDepan(biodataMahasiswa);
    }
    ngentriData(biodataMahasiswa);
tampilkanData(biodataMahasiswa);
}
}