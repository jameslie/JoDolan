package com.example.jodolan.datawisata;

import com.example.jodolan.R;

import java.util.ArrayList;

public class DataWisata {
    private static String[] wisataNames = {
            "Malioboro",
            "Candi Prambanan",
            "Candi Borobudur",
            "Tebing Breksi",
            "The Lost World Castle",
            "Blue Lagoon",
            "Pantai Parangtritis",
            "Candi Ratu Boko",
            "Tamansari Yogyakarta",
            "Tugu Yogyakarta",
            "Pantai Glagah"

    };

    private static String[] wisataGmaps = {
            "https://goo.gl/maps/YuwGaEhNos5txtpb6",
            "https://goo.gl/maps/chDNNLLe1RsB7thX6",
            "https://goo.gl/maps/JwqVsoWXeF517xvw5",
            "https://g.page/tebing-breksi-kabupaten-sleman?share",
            "https://g.page/the-lost-world-castle?share",
            "https://goo.gl/maps/sw51cmHPAiadpXVc9",
            "https://goo.gl/maps/TGahFHpXi66Spi3i6",
            "https://goo.gl/maps/r2Yq6yYTzC2WEBGL7",
            "https://goo.gl/maps/TRjDMnc9BwbG21o5A",
            "https://goo.gl/maps/ASah8oP88rBCFNgx7",
            "https://goo.gl/maps/FEqbFgLsrMHQ99BY7"
    };

    private static String[] wisataAlamat = {
            "Jl. Malioboro No.60, Sosromenduran, Gedong Tengen, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55271",
            "Jl. Raya Solo - Yogyakarta No.16, Kranggan, Bokoharjo, Kec. Prambanan, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55571",
            "Jl. Badrawati, Kw. Candi Borobudur, Borobudur, Kec. Borobudur, Magelang, Jawa Tengah",
            "Unnamed Road, Gn. Sari, Sambirejo, Kec. Prambanan, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55572",
            "Petung, Kepuharjo, Kec. Cangkringan, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55583",
            "Area Sawah, Widodomartani, Kec. Ngemplak, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55584",
            "Pantai, Parangtritis, Kec. Kretek, Bantul, Daerah Istimewa Yogyakarta",
            "Jl. Raya Piyungan - Prambanan No.KM.2, Gatak, Bokoharjo, Kec. Prambanan, Kabupaten Sleman, Daerah Istimewa Yogyakarta",
            "Wisata Taman Sari Jalan Tamanan, Patehan, Kecamatan Kraton, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55133",
            "Gowongan, Kec. Jetis, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55233",
            "Glagah, Kec. Temon, Kabupaten Kulon Progo, Daerah Istimewa Yogyakarta 55654"
    };

    private static int[] wisataImages = {
            R.drawable.malioboro,
            R.drawable.prambanan,
            R.drawable.borobudur,
            R.drawable.tebingbreksi,
            R.drawable.thelostworld_castle,
            R.drawable.bluelagoon,
            R.drawable.parangtritis,
            R.drawable.ratuboko,
            R.drawable.tamansari,
            R.drawable.tugu,
            R.drawable.pantaiglagah

    };

    private static String[] wisataWaktu = {
      "24 jam",
      "08.00 - 17.00 WIB",
      "06.00 - 17.00 WIB",
      "04.00 - 00.00 WIB",
      "07.00 - 18.00 WIB",
      "06.00 - 17.00 WIB",
      "24 jam",
      "06.00 - 17.00 WIB",
      "09.00 - 15.00 WIB",
      "24 jam",
      "06.00 - 17.00 WIB"
    };

    private static String[] wisataDeskripsi = {
            "Malioboro adalah nama salah satu jalan yang berada di pusat kota Yogyakarta. Jalan Malioboro adalah nama salah satu jalan dari tiga jalan di Kota Yogyakarta yang membentang dari Tugu Yogyakarta hingga ke perempatan Kantor Pos Yogyakarta. Secara keseluruhan terdiri dari Jalan Pangeran Mangkubumi, Jalan Malioboro dan Jalan Jend. A. Yani. Jalan ini merupakan poros Garis Imajiner Kraton Yogyakarta.",
            "Candi Prambanan adalah kompleks candi Hindu terbesar di Indonesia yang dibangun pada abad ke-9 masehi. Candi ini dipersembahkan untuk Trimurti, tiga dewa utama Hindu yaitu Brahma sebagai dewa pencipta, Wisnu sebagai dewa pemelihara, dan Siwa sebagai dewa pemusnah. Berdasarkan prasasti Siwagrha nama asli kompleks candi ini adalah Siwagrha (bahasa Sanskerta yang bermakna 'Rumah Siwa'), dan memang di garbagriha (ruang utama) candi ini bersemayam arca Siwa Mahadewa setinggi tiga meter yang menujukkan bahwa di candi ini dewa Siwa lebih diutamakan.",
            "Candi Borobudur adalah sebuah candi Buddha yang terletak di Borobudur, Magelang, Jawa Tengah, Indonesia. Candi ini terletak kurang lebih 100 km di sebelah barat daya Semarang, 86 km di sebelah barat Surakarta, dan 40 km di sebelah barat laut Yogyakarta. Candi berbentuk stupa ini didirikan oleh para penganut agama Buddha Mahayana sekitar tahun 800-an Masehi pada masa pemerintahan wangsa Syailendra. Borobudur adalah candi atau kuil Buddha terbesar di dunia, sekaligus salah satu monumen Buddha terbesar di dunia.",
            "Taman wisata Tebing Breksi adalah tempat wisata alam di Jogja. Sesuai dengan namanya, tempat wisata ini merupakan perbukitan batuan breksi. Tebing batuan breksi yang memiliki corak yang indah menjadi daya tarik tersendiri bagi wisatawan. Sebelum menjadi tempat wisata, lokasi Taman Tebing Breksi sebelumnya adalah tempat penambangan batuan alam. Kegiatan penambangan ini dilakukan oleh masyarakat sekitar. Di sekitar lokasi penambangan terdapat tempat-tempat pemotongan batuan hasil penambangan untuk dijadikan bahan dekorasi bangunan.\n" +
                    "\n" +
                    "Sejak tahun 2014, kegiatan penambangan di tempat ini ditutup oleh pemerintah. Penutupan ini berdasarkan hasil kajian yang menyatakan bahwa batuan yang ada di lokasi penambangan ini merupakan batuan yang berasal dari aktivitas vulkanis Gunung Api Purba Nglanggeran. Kemudian lokasi penambangan ditetapkan sebagai tempat yang dilindungi dan tidak diperkenankan untuk kegiatan penambangan.\n" +
                    "\n" +
                    "Setelah penutupan aktivitas tambang tersebut, masyarakat mendekorasi lokasi bekas pertambangan ini menjadi tempat wisata yang layak untuk dikunjungi. Tepatnya pada bulan Mei 2015, Tebing Breksi ini diresmikan oleh Sri Sultan Hamengku Buwono X sebagai tempat wisata baru di Jogja.\n",
            "The Lost World Castle merupakan salah satu objek wisata di kawasan lereng Gunung Merapi yang terletak di Dusun Petung, Desa Kepuharjo Cangkringan, Sleman, Daerah Istimewa Yogyakarta, Indonesia. Objek wisata ini dibangun menyerupai Benteng Takeshi dan dibangun di atas lahan 1,3 hektare pada tahun 2016.\n" +
                    "Pengunjung yang ingin memasuki kawasan The Lost World Castle akan dikenakan biaya sebesar Rp 25.000 tiap orang dan belum termasuk biaya parkir. Biaya parkir mobil sebesar Rp5.000,00, sementara biaya parkir untuk sepeda motor sebesar Rp2.000,00. Di dalam The Lost World Casle, pengunjung disuguhkan potret gagahnya Gunung Merapi. Selain itu, di dalam objek wisata ini terdapat berbagai latar untuk mengambil foto yang menarik, di antaranya taman koboi, awan putih, sepeda motor terbang, sayap bidadari, dan lain-lain. Selain itu, ada juga latar foto trik tiga-dimensi berupa air terjun, permadani terbang, dan beberapa bunga sakura tiruan yang turut menghidupkan suasana.\n",
            "Blue Lagoon merupakan mata air atau kedung dengan hamparan air jernih biru kehijauan. Pemandangan yang indah dan tempatnya yang asyik menjadikan pemandian alami ini ramai dikunjungi wisatawan dari berbagai tempat.\n" +
                    "\n" +
                    "Berenang atau berendam di kolam tatkala suhu udara memanas tentunya menjadi hal yang sangat menyenangkan. Apalagi jika air dari kolam tersebut berasal dari mata air alami yang mengalir sepanjang tahun tanpa henti. Ya, kini kenikmatan itu bisa Anda dapatkan di Blue Lagoon, sebuah pemandian alami yang mulai popular di kalangan wisatawan.\n" +
                    "\n" +
                    "Nama resmi pemandian ini adalah Pemandian Setia Budi. Namun karena airnya yang jernih dan berwarna kebiruan, anak-anak muda yang kerap berkunjung ke kawasan ini pun menyebutnya Blue Lagoon. Pemandian ini berbentuk ceruk atau kedung dengan bebatuan alami di sekitarnya. Di salah satu sisi pemandian terdapat bendungan kecil yang bisa digunakan berseluncur menggunakan ban sewaan. Jika memiliki nyali, wisatawan pun bisa melompat dari ketinggian atau melakukan backflip. Air kedung yang dalam membuat aktivitas ini cukup aman dilakukan.\n",
            "Parangtritis merupakan objek wisata yang cukup terkenal di Yogyakarta selain objek pantai lainnya seperti Samas, Baron, Kukup, Krakal dan Glagah. Parangtritis mempunyai keunikan pemandangan yang tidak terdapat pada objek wisata lainnya yaitu selain ombak yang besar juga adanya gunung-gunung pasir di sekitar pantai, yang biasa disebut gumuk. Objek wisata ini sudah dikelola oleh pihak Pemkab Bantul dengan cukup baik, mulai dari fasilitas penginapan maupun pasar yang menjajakan souvenir khas Parangtritis.",
            "Candi Ratu Boko adalah situs purbakala yang merupakan kompleks sejumlah sisa bangunan yang berada kira-kira 3 km di sebelah selatan dari kompleks Candi Prambanan, 18 km sebelah timur Kota Yogyakarta atau 50 km barat daya Kota Surakarta, Jawa Tengah, Indonesia. Situs Ratu Boko terletak di sebuah bukit pada ketinggian 196 meter dari permukaan laut. Luas keseluruhan kompleks adalah sekitar 25 ha.\n" +
                    "Situs ini menampilkan atribut sebagai tempat berkegiatan atau situs permukiman, namun fungsi tepatnya belum diketahui dengan jelas. Ratu Boko diperkirakan sudah dipergunakan orang pada abad ke-8 pada masa Wangsa Sailendra (Rakai Panangkaran) dari Kerajaan Medang (Mataram Hindu). Dilihat dari pola peletakan sisa-sisa bangunan, diduga kuat situs ini merupakan bekas keraton (istana raja). Pendapat ini berdasarkan pada kenyataan bahwa kompleks ini bukan candi atau bangunan dengan sifat religius, melainkan sebuah istana berbenteng dengan bukti adanya sisa dinding benteng dan parit kering sebagai struktur pertahanan.Sisa-sisa permukiman penduduk juga ditemukan di sekitar lokasi situs ini.\n",
            "Tamansari Jogjakarta adalah situs bekas taman atau kebun istana Keraton Ngayogyakarta Hadiningrat, yang dapat dibandingkan dengan Kebun Raya Bogor sebagai kebun Istana Bogor. Kebun ini dibangun pada zaman Sultan Hamengku Buwono I (HB I) pada tahun 1758-1765/9. Awalnya, taman yang mendapat sebutan \"The Fragrant Garden\" ini memiliki luas lebih dari 10 hektare dengan sekitar 57 bangunan baik berupa gedung, kolam pemandian, jembatan gantung, kanal air, maupun danau buatan beserta pulau buatan dan lorong bawah air. Kebun yang digunakan secara efektif antara 1765-1812 ini pada mulanya membentang dari barat daya kompleks Kedhaton sampai tenggara kompleks Magangan. Namun saat ini, sisa-sisa bagian Taman Sari yang dapat dilihat hanyalah yang berada di barat daya kompleks Kedhaton saja.",
            "Tugu Yogyakarta adalah sebuah tugu atau monumen yang sering dipakai sebagai simbol atau lambang dari kota Yogyakarta. Tugu ini dibangun oleh pemerintah Belanda setelah tugu sebelumnya runtuh akibat gempa yang terjadi waktu itu. Tugu sebelumnya yang bernama Tugu Golong-Gilig dibangun oleh Hamengkubuwana I, pendiri kraton Yogyakarta. Tugu yang terletak di perempatan Jalan Jenderal Sudirman dan Jalan Margo Utomo ini, mempunyai nilai simbolis dan merupakan garis yang bersifat magis menghubungkan laut selatan, kraton Jogja dan gunung Merapi. Pada saat melakukan meditasi, konon Sultan Yogyakarta pada waktu itu menggunakan tugu ini sebagai patokan arah menghadap puncak gunung Merapi.",
            "Pantai Glagah merupakan primadona di Kulonprogo. Di pantai ini pengunjung dapat bermain kano di laguna, naik motorcross di hamparan pasir besi, memancing di atas tetrapod yang berfungsi sebagai pemecah ombak, hingga memetik buah naga di agrowisata.\n" +
                    "\n" +
                    "Selama ini Kabupaten Kulonprogo seringkali terlupa di kalangan wisatawan. Padahal di Kabupaten ini terdapat sebuah pantai yang indah dengan fasilitas yang sangat beragam, Pantai Glagah namanya. Destinasi wisata ini hanya berjarak sekitar 40 km arah barat Yogyakarta, berbatasan dengan Kabupaten Purworejo, Jawa Tengah.\n" +
                    "\n" +
                    "Berbeda dengan pantai-pantai di Gunungkidul yang dibatasi bukit karang, tepian Pantai Glagah terlihat sangat panjang tanpa penghalang. Sejauh mata memandang yang terlihat adalah hamparan pasir besi kehitaman. Ombak di Pantai Glagah terbilang cukup besar. Karena itu di kawasan pantai ini dibangun sebuah dermaga panjang dengan tetrapod di kanan kirinya. Tetrapod tersebut berfungsi sebagai pemecah ombak.\n"

    };

    public static ArrayList<Wisata> getWisataList(){
        Wisata wisata = null;

        ArrayList<Wisata> list = new ArrayList<>();

        for (int i = 0; i<wisataNames.length; i++){
            wisata = new Wisata();
            wisata.setWisataName(wisataNames[i]);
            wisata.setWisataImage(wisataImages[i]);
            wisata.setWisataWaktu(wisataWaktu[i]);
            wisata.setWisataAlamat(wisataAlamat[i]);
            wisata.setWisataDeskripsi(wisataDeskripsi[i]);
            wisata.setWisataGmaps(wisataGmaps[i]);

            list.add(wisata);
        }
        return list;
    }
}
