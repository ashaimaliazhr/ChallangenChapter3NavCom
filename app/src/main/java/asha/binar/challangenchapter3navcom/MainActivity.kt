package asha.binar.challangenchapter3navcom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import asha.binar.challangenchapter3navcom.view.MyData

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController

    val MyData = arrayListOf(
       MyData('A', arrayListOf("Asha", "Adil", "Awan", "Awam", "Abalone")),
       MyData('B', arrayListOf("Bayam", "Baju", "Batik", "Bubur", "Balon")),
       MyData('C', arrayListOf("Cantik", "Cerah", "Curug", "Cacing", "Cicak")),
       MyData('D', arrayListOf("Daun", "Dilan", "Dmasiv", "Durian", "Datang")),
       MyData('E', arrayListOf("Edit", "Epexol", "Eceng", "Endapan", "Ebi")),
       MyData('F', arrayListOf("Frisian", "Flag", "Famous", "Fix You", "Favorite")),
       MyData('G', arrayListOf("Gundam", "Geli", "Gaduh", "Gamon", "Gartic")),
       MyData('H', arrayListOf("Hijau", "Hitam", "Hawa", "Hampa", "Hutan")),
       MyData('I', arrayListOf("Indah", "Ikan", "Ijazah", "Izin", "Ideal")),
       MyData('J', arrayListOf("Jagung", "Jemput", "Jalan", "Jadi", "Jual")),
       MyData('K', arrayListOf("Kelas", "Kayu", "Kursi", "Kampak", "Kuda")),
       MyData('L', arrayListOf("Lintas", "Lampu", "Linjur", "Lily", "Law")),
       MyData('M', arrayListOf("Musim", "Mayur", "Mimpi", "Muda", "Maya")),
       MyData('N', arrayListOf("Nasi", "Nyanyi", "Nenek", "Nafas", "Nitip")),
       MyData('O', arrayListOf("Objek", "Orang", "Obat", "Oyo", "Odeng")),
       MyData('P', arrayListOf("Payung", "Paparazi", "Papa", "Pipi", "Perut")),
       MyData('Q', arrayListOf("Queker Oats", "Quantum", "Qualified", "Quality", "Queen")),
       MyData('R', arrayListOf("Raja", "Ratu", "Rapi", "Riskan", "Rambut")),
       MyData('S', arrayListOf("Satu", "Suka", "Sedih", "Sirna", "Salon")),
       MyData('T', arrayListOf("Tunggu", "Titip", "Tiyan", "Tutup", "Train")),
       MyData('U', arrayListOf("Udang", "Ubi", "Ucup", "Uang", "Udah")),
       MyData('V', arrayListOf("Vallet", "Vendor", "Valid", "Vague", "Vast")),
       MyData('W', arrayListOf("Wow", "Wonderfull", "Whistle", "Wish", "Water")),
       MyData('X', arrayListOf("X-Ray", "Xenial", "Xilem", "Xeric", "Xenium")),
       MyData('Y', arrayListOf("Year", "Yes", "Yap", "Yummy", "Yuppi")),
       MyData('Z', arrayListOf("Zahra", "Zebra", "Ziggy", "Zagga", "Zizi")),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.fragmentContainerView) as NavHostFragment

        navController = navHostFragment.navController
        setupActionBarWithNavController(navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }




}