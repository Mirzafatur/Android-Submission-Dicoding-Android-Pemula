package com.example.mirzasubmissiondicoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_profil)
        btnMoveActivity.setOnClickListener(this)

        val imageList = listOf<Mufc>(
                Mufc(
                        R.drawable.ddg,
                        "David De Gea",
                        "David de Gea Quintana (lahir 7 November 1990; umur 29 tahun) adalah seorang pemain sepak bola Spanyol yang berposisi sebagai kiper utama di klub Manchester United. Lahir di Madrid, ia memulai karier berusia 10 dengan Atletico Madrid dan naik melalui sistem akademi di klub sebelum membuat debut seniornya pada tahun 2009. Setelah menjadi pilihan pertama kiper Atletico, ia membantu tim memenangkan kedua Liga Eropa UEFA dan Piala Super Eropa, dan penampilannya menarik perhatian dari Manchester United, ia bergabung pada Juni 2011. Dia juga kapten saat di timnas U21 Spanyol.De Gea membantu tim U-17 Spanyol memenangkan European Championship 2007, dan finis di urutan kedua di World Cup 2007"
                ),
                Mufc(
                        R.drawable.maguire,
                        "Harry Maguire",
                        "Jacob Harry Maguire (lahir 5 Maret 1993) adalah pemain sepak bola profesional Inggris yang bermain sebagai bek tengah dan juga kapten utama untuk klub Liga Premier Manchester United dan tim nasional Inggris. Dilahirkan di Sheffield, ia datang melalui sistem akademi di Sheffield United sebelum lulus ke tim utama pada 2011. Ia bermain total 166 pertandingan profesional untuk The Blades dan merupakan Pemain Terbaik mereka tiga kali berturut-turut, juga tampil di Tim PFA of the Year untuk League One berkali-kali. Pada 2014, ia pindah ke Hull City seharga £ 2,5 juta, lalu meminjamkannya ke Wigan Athletic pada tahun 2015. Ia bergabung dengan Leicester City pada tahun 2017 dengan biaya awal sebesar £ 12 juta. Dua tahun kemudian, ia pindah ke Manchester United dengan biaya yang diyakini £ 80 juta, biaya rekor dunia untuk seorang bek"
                ),
                Mufc(
                        R.drawable.lindelof,
                        "Victor Lindelof",
                        "Victor Jörgen Nilsson Lindelöf (Lahir 17 Juli 1994) adalah pemain sepakbola professional asal Swedia yang bermain sebagai bek di klub liga premier inggris Manchester United dan di tim nasional swedia. Posisi utama sebagai bek tengah dan dia dapat bermain sebagai bek kanan. Lindelof memulai karirnya di Swedia di Vasteras SK. membuat debut pada September 2010. di Desember 2011 dia setuju untuk pindah ke Benfica di Portugal, dan memulai di Benfica B. Setelah membuat debut tim utama pada September 2013, dia melanjutkan bermain untuk Benfica B dan membantu meraih gelar juara. Dia bergabung dengan Manchester United pada Juli 2017. Lindelof mewakili timnas swedia di umur 17, umur 19, umur 21 dan senior. Dia membuat debut internasional pada maret 2016 dan mewakili negaranya di euro 2016 dan FIFA WORLD CUP 2018"
                ),
                Mufc(
                        R.drawable.awb,
                        "Aaron Wan-Bissaka",
                        "Aaron Wan-Bissaka (lahir di Croydon, 26 November 1997; umur 22 tahun) adalah seorang pemain sepak bola berkewarganegaraan Inggris yang bermain untuk klub Manchester United F.C. pada posisi Bek. Dia memulai karir sepakbola dari akademi Crystal Palace Fc pada tahun 2009 hingga tahun 2017. Lalu dia pindah ke Manchester United Fc pada tahun 2019. Dia mewakili Tim nasional Inggris U-20 pada tahun 2018 dan U-21 pada tahun 2019"
                ),
                Mufc(
                        R.drawable.luke,
                        "Luke Shaw",
                        "Luke Paul Hoare Shaw (lahir 12 Juli 1995; umur 24 tahun) adalah pemain sepak bola Inggris yang bermain sebagai bek kiri untuk Manchester United dan tim nasional Inggris. Awalnya adalah anggota dari tim muda Southampton, Shaw membuat debut di tim utama pada Januari 2012, dan menandatangani kontrak profesional pertamanya pada bulan Mei tahun itu sebelum menjadi pemain reguler di tim Southampton. Pada tanggal 5 Maret 2014 ia membuat debut senior internasional dalam kemenangan 1-0 melawan Denmark pada pertandingan persahabatan. Dia terutama berposisi sebagai bek kiri."
                ),
                Mufc(
                        R.drawable.tominay,
                        "Scott McTominay",
                        "Scott Francis McTominay (lahir 8 December 1996) is a professional footballer who plays as a central midfielder for Premier League club Manchester United and the Scotland national team. McTominay is a graduate of the Manchester United youth academy and made his senior debut for the club in May 2017. Born in England, he qualified to play for Scotland through his Scottish-born father. He made his senior international debut in March 2018."
                ),
                Mufc(
                        R.drawable.fred,
                        "Fred Rodrigues",
                        "Frederico Rodrigues de Paula Santos (lahir 5 Maret 1993), dikenal sebagai Fred, adalah pemain sepak bola profesional Brasil yang bermain sebagai gelandang untuk klub Liga Premier Inggris Manchester United dan tim nasional Brasil . Fred memulai karirnya di klub Brasil Internacional, di mana ia memenangkan Campeonato Gaúcho dua kali. Pada 26 Juni 2013, ia menandatangani kontrak dengan klub Ukraina Shakhtar Donetsk, di mana ia memenangkan 10 trofi, termasuk empat gelar Liga Premier Ukraina. Pada tahun 2018, Fred menandatangani kontrak dengan Manchester United. Fred adalah bagian dari skuad Brasil untuk Copa América 2015 di Chili, dimulai dalam dua pertandingan terakhir Grup C saat mereka mencapai perempat final. Dia disebutkan dalam skuad 23-pemain terakhir Brasil untuk Piala Dunia FIFA 2018."
                ),
                Mufc(
                        R.drawable.bruno,
                        "Bruno Fernandes",
                        "Bruno Miguel Borges Fernandes (lahir 8 September 1994) adalah pemain sepak bola profesional Portugis yang bermain sebagai gelandang untuk klub Liga Premier Manchester United dan tim nasional Portugal.Dilahirkan di Maia, Porto, Fernandes memulai karirnya di klub Italia Serie B Novara tetapi segera pindah ke klub Serie A Udinese pada 2013, diikuti oleh Sampdoria tiga tahun kemudian. Setelah lima tahun di Italia, ia menandatangani kontrak dengan Sporting CP pada 2017, di mana ia diangkat menjadi kapten klub. Dia memenangkan Taças da Liga pada tahun 2018 dan 2019, serta Taça de Portugal, membuatnya terpilih sebagai Pemain Terbaik Liga Tahun Ini di kedua musim. Pada 2018-1919, ia mencetak rekor 33 gol di semua kompetisi, menjadikannya gelandang Portugis dengan skor tertinggi dan gelandang dengan skor tertinggi di Eropa dalam satu musim"
                ),
                Mufc(
                        R.drawable.james,
                        "Daniel James",
                        "Daniel Owen James (lahir 10 November 1997) adalah pemain sepak bola profesional yang bermain sebagai pemain sayap untuk klub Liga Premier Manchester United dan tim nasional Wales. Dia melakukan debut profesionalnya untuk Swansea City pada Februari 2018, dan menandatangani kontrak dengan Manchester United pada Juni 2019. Dia melakukan debut seniornya di Wales pada November 2018, setelah sebelumnya mewakili negara itu di berbagai level usia muda"
                ),
                Mufc(
                        R.drawable.rashford,
                        "Marcus Rashford",
                        "Marcus Rashford (lahir 31 Oktober 1997) adalah pemain sepak bola profesional Inggris yang bermain sebagai pemain depan untuk klub Liga Premier Manchester United dan tim nasional Inggris. Seorang pemain Manchester United dari usia tujuh tahun, ia mencetak dua gol pada debut tim pertamanya melawan Midtjylland di Liga Eropa UEFA pada Februari 2016 dan debut Liga Premier melawan Arsenal tiga hari kemudian. Dia juga mencetak gol dalam pertandingan derby Manchester pertamanya, pertandingan Piala EFL pertamanya dan pertandingan Liga Champions UEFA pertamanya. Bersama United, Rashford sejauh ini memenangkan Piala FA, Piala EFL, FA Community Shield, dan Liga Eropa UEFA. Rashford mencetak gol pada debutnya di Inggris pada Mei 2016, menjadi pemain Inggris termuda yang mencetak gol dalam pertandingan internasional senior pertamanya. Dia bermain di UEFA Euro 2016 sebagai pemain termuda turnamen, dan di Piala Dunia FIFA 2018."
                ),
                Mufc(
                        R.drawable.martial,
                        "Anthony Martial",
                        "Anthony Jordan Martial (Lahir 5 Desember 1995) adalah pemain sepak bola profesional Prancis yang bermain sebagai penyerang untuk klub Inggris Manchester United dan tim nasional Prancis. Dia adalah penerima Golden Boy Award 2015 untuk pemain U-21 terbaik di Eropa. Bermain sepakbola muda untuk Les Ulis, ia memulai karir profesionalnya di Lyon, kemudian ditransfer ke AS Monaco pada 2013 dengan bayaran € 6 juta. Dia adalah anggota pasukan Monaco selama dua musim, dan menandatangani kontrak dengan Manchester United pada tahun 2015 dengan biaya awal £ 36 juta yang berpotensi naik menjadi £ 57,6 juta. Ini adalah biaya tertinggi yang dibayarkan untuk seorang remaja dalam sejarah sepakbola bahkan sebelum potensi meningkat. Dia mencetak gol dalam pertandingan pertamanya untuk United, dan dinobatkan sebagai Pemain Liga Premier Bulan ini dalam bulan pertamanya di sepakbola Inggris"
                )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_utama)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ListMufcAdapter(this, imageList) {
            val intent = Intent(this, DetailPlayerActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)


        }
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_profil -> {
                val moveIntent = Intent(this@MainActivity, ProfileActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}
