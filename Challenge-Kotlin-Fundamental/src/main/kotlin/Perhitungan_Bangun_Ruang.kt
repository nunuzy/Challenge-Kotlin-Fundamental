import java.util.*

public var input = Scanner(System.`in`);

fun main() {
    println("============Identitas===============");
    print("Nama : ");
    var n: String? = input.nextLine();

    //input validation nama wajib di isi
    if (n.isNullOrEmpty()){
        println("Nama wajib di isi")
        main()
    }

    print("Kelas : ");
    var k: String = input.nextLine();
    print("Nomor Absen : ")
    var na: String = input.nextLine();
    print("Masukan nomorHP : ")

    //elvis operator
    val nomorHP:String? = null
    val nomorHPLength = nomorHP?.length ?:"Maaf saya lupa memberi program input untuk nomor HP"
    println(nomorHPLength)
    println("====================================");
    menu()
}

// menu pemlihan opsi
fun menu(){
    println("================Menu================");
    println("1. Balok \n2. Bola\n9. to exit")
    print ("Pilih Menu Diatas : ")
    val pill:Int? = input.nextInt()
    when (pill) {
        1 -> balok()
        2 -> bola()
        9 -> exit()
        else -> {
            println("Opps tidak ada")
            menu()
        }
    }
}

fun balok(){
    println("============Balok===============");
    print("Masukan Panjang Balok : ");
    val panjang:Double = input.nextDouble();
    print("Masukan Lebar Balok: ");
    val lebar:Double = input.nextDouble();
    print("Masukan Tinggi Balok: ");
    val tinggi:Double = input.nextDouble();

    //perhitungan
    val volume:Double =  panjang * lebar * tinggi;
    println ("Volume Balok Adalah $volume")
    //pembulatan 2 angka belakang
    System.out.printf("%.2f",volume)
    println()
    //back to menu
    menu()
    println("=================================");
}

fun bola(){
    println("============Bola===============");
    print("Masukan Jari-Jari Bola : ");
    val jari_jari :Double = input.nextDouble();

    //perhitungan
    val volume = (1.3333) * Math.PI * jari_jari* jari_jari* jari_jari
    println("Volume Bola adalah : $volume")
    //pembulatan 2 angka belakang
    System.out.printf("%.2f",volume)
    println()
    //back to menu
    menu()
}
fun exit(){
    System.exit(0)
}
