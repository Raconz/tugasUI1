package com.raconz.tugasUI1.data

import com.raconz.tugasUI1.R
import com.raconz.tugasUI1.model.farm
import com.raconz.tugasUI1.model.fruit
import com.raconz.tugasUI1.model.veg

object AppData {
    val vegLists = listOf(
        veg(
            id = 1,
            name = "Bawang Merah",
            image = R.drawable.veg_bawang_merah,
            description = "Bawang merah (Allium cepa L. var. aggregatum[1]) adalah salah satu bumbu masak utama dunia yang berasal dari Iran, Pakistan, dan pegunungan-pegunungan di sebelah utaranya, tetapi kemudian menyebar ke berbagai penjuru dunia, baik sub-tropis maupun tropis. Wujudnya berupa umbi yang dapat dimakan mentah, untuk bumbu masak, acar, obat tradisional, kulit umbinya dapat dijadikan zat pewarna dan daunnya dapat pula digunakan untuk campuran sayur. Tanaman penghasilnya disebut dengan nama sama."
        ),
        veg(
            id = 2,
            name = "Bayam",
            image = R.drawable.veg_bayam,
            description = "Bayam (Amaranthus) adalah tumbuhan yang biasa ditanam untuk dikonsumsi daunnya sebagai sayuran hijau. Tumbuhan ini berasal dari Amerika tropik namun sekarang tersebar ke seluruh dunia. Tumbuhan ini dikenal sebagai sayuran sumber zat besi yang penting bagi tubuh.."
        ),
        veg(
            id = 3,
            name = "Cabai Rawit",
            image = R.drawable.veg_cabai_rawit,
            description = "Cabai rawit (Capsicum frutescens) adalah buah dan tumbuhan anggota genus Capsicum yang buahnya tumbuh menjulang menghadap ke atas. Warna buahnya hijau kecil sewaktu muda dan jika telah masak berwarna merah tua. Bila ditekan buahnya terasa keras karena jumlah bijinya sangat banyak. Cabai ini sulit dipisahkan dari kudapan jalanan, yaitu gorengan yang biasa dimakan bersama cabai rawit muda mentah."
        ),
        veg(
            id = 4,
            name = "Daun Bawang",
            image = R.drawable.veg_daun_bawang,
            description = "Daun bawang merupakan jenis sayuran dari kelompok bawang yang banyak digunakan dalam masakan. Dalam masakan Indonesia, daun bawang bisa ditemukan misalnya dalam martabak telur, sebagai bagian dari sup, atau sebagai bumbu tabur seperti pada soto.\n" +
                    "\n" +
                    "Daun bawang sebenarnya istilah umum yang dapat terdiri dari spesies yang berbeda. Jenis yang paling umum dijumpai adalah bawang daun (Allium fistulosum). Jenis lainnya adalah A. ascalonicum, yang masih sejenis dengan bawang merah. Kadang-kadang bawang prei juga disebut sebagai daun bawang."
        ),
        veg(
            id = 5,
            name = "Jagung",
            image = R.drawable.veg_jagung,
            description = "Jagung (Zea mays ssp. mays) adalah salah satu tanaman pangan penghasil karbohidrat yang terpenting di dunia, selain gandum dan padi. Bagi penduduk Amerika Tengah dan Selatan, bulir jagung adalah pangan pokok, sebagaimana bagi sebagian penduduk Afrika dan beberapa daerah di Indonesia. Pada masa kini, jagung juga sudah menjadi komponen penting pakan ternak. Penggunaan lainnya adalah sebagai sumber minyak pangan dan bahan dasar tepung maizena. Berbagai produk turunan hasil jagung menjadi bahan baku berbagai produk industri farmasi, kosmetika, dan kimia."
        ),
        veg(
            id = 6,
            name = "Kangkung",
            image = R.drawable.veg_kangkung,
            description = "Kangkung (Ipomoea aquatica) adalah tumbuhan yang termasuk jenis sayur-sayuran dan ditanam sebagai makanan. Kangkung banyak dijual di pasar-pasar. Kangkung banyak terdapat di kawasan Asia, tempat asalnya tidak diketahui dan merupakan tumbuhan yang dapat dijumpai hampir di mana-mana terutama di kawasan berair."
        ),
        veg(
            id = 7,
            name = "kubis",
            image = R.drawable.veg_kubis,
            description = "Kubis (bahasa Jawa: gubis, dari bahasa Portugis: couves) atau kol (Belanda: kool) adalah tumbuhan dwimusim atau ekamusim berdaun hijau atau ungu yang ditanam sebagai sayuran untuk kepala padat berdaunnya. Erat kaitannya dengan tanaman cole lainnya, seperti brokoli, kembang kol, dan kubis brussel, itu diturunkan dari B. oleracea var. oleracea, kubis lapangan liar. Kepala kubis umumnya berkisar 05 hingga 4 kilogram (10 hingga 9 pon), dan dapat berwarna hijau, ungu dan putih. Kubis hijau berkepala keras berdaun halus adalah yang paling umum, dengan kubis merah berdaun halus dan kubis savoy berdaun crinkle dari kedua warna terlihat lebih jarang. Kubis adalah sayuran yang berlapis-lapis. Dalam kondisi hari diterangi matahari panjang seperti yang ditemukan di garis lintang utara di musim panas, kubis dapat tumbuh jauh lebih besar. Beberapa rekor dibahas pada akhir bagian sejarah."
        ),
        veg(
            id = 8,
            name = "Pak Coy",
            image = R.drawable.veg_pakcoy,
            description = "Pakcoy atau bok choy (Brassica rapa Kelompok Chinensis; suku sawi-sawian atau Brassicaceae) merupakan jenis sayuran yang populer. Sayuran yang dikenal pula sebagai sawi sendok ini mudah dibudidayakan dan dapat dimakan segar (biasanya dilayukan dengan air panas) atau diolah menjadi asinan. Kadang-kadang sawi ini juga disebut sawi hijau karena fungsinya mirip, meskipun sawi sendok lebih kaku teksturnya serta ukurannya cenderung lebih kecil dan meroset."
        ),
        veg(
            id = 9,
            name = "Terong",
            image = R.drawable.veg_terong,
            description = "Terung atau terong (Solanum melongena) adalah tumbuhan penghasil buah yang dijadikan sayur-sayuran. Asalnya adalah India dan Sri Lanka.[1][2] Terung berkerabat dekat dengan kentang dan leunca, dan agak jauh dari tomat.\n" +
                    "\n" +
                    "Terung ialah terna yang sering ditanam secara tahunan. Tanaman ini tumbuh hingga 40–150 cm (16-57 inci) tingginya. Daunnya besar, dengan lobus yang kasar. Ukurannya 10–20 cm (4-8 inci) panjangnya dan 5–10 cm (2-4 inci) lebarnya. Jenis-jenis setengah liar lebih besar dan tumbuh hingga setinggi 225 cm (7 kaki), dengan daun yang melebihi 30 cm (12 inci) dan 15 cm (6 inci) panjangnya. Batangnya biasanya berduri. Warna bunganya antara putih hingga ungu, dengan mahkota yang memiliki lima lobus. Benang sarinya berwarna kuning. Buah tepung berisi, dengan diameter yang kurang dari 3 cm untuk yang liar, dan lebih besar lagi untuk jenis yang ditanam."
        ),
        veg(
            id = 10,
            name = "Tomat",
            image = R.drawable.veg_tomat,
            description = "Tomat atau rangam (Solanum lycopersicum) adalah tumbuhan dari keluarga Solanaceae, tumbuhan asli Amerika Tengah dan Selatan, dari Meksiko sampai Peru. Tomat merupakan tumbuhan siklus hidup singkat, dapat tumbuh setinggi 1 sampai 3 meter. Tumbuhan ini memiliki buah berwarna hijau, kuning, dan merah yang biasa dipakai sebagai sayur dalam masakan atau dimakan secara langsung tanpa diproses. Tomat memiliki batang dan daun yang tidak dapat dikonsumsi karena masih sekeluarga dengan kentang dan terung yang mengadung alkaloid."
        )
    )

    val fruitList = listOf(
        fruit(
            id = 1,
            name = "Apel",
            image = R.drawable.fruit_apple,
            description = "Apel, tufah, atau rantas merupakan jenis buah-buahan, atau buah yang dihasilkan dari pohon apel. Buah apel biasanya berwarna merah kulitnya jika masak dan siap dimakan, tetapi bisa juga kulitnya berwarna hijau atau kuning. Kulit buahnya agak lembek dan daging buahnya keras. Buah apel memiliki beberapa biji di dalamnya."
        ),
        fruit(
            id = 2,
            name = "Bluberi",
            image = R.drawable.fruit_blueberry,
            description = "Blueberry adalah kelompok tanaman berbunga abadi yang tersebar luas dan tersebar luas dengan buah beri biru atau ungu. Mereka diklasifikasikan di bagian Cyanococcus dalam genus Vaccinium . Vaccinium juga mencakup cranberry , bilberry , huckleberry , dan blueberry Madeira . [1] Blueberry komersial—baik yang liar (lowbush) maupun yang dibudidayakan (highbush)—semuanya berasal dari Amerika Utara. Varietas highbush diperkenalkan ke Eropa pada tahun 1930-an."
        ),
        fruit(
            id = 3,
            name = "Ceri",
            image = R.drawable.fruit_cherry,
            description = "Ceri adalah buah dari banyak tanaman dari genus Prunus , dan merupakan buah berbiji (buah batu) yang berdaging.\n" +
                    "\n" +
                    "Ceri komersial diperoleh dari kultivar beberapa spesies, seperti Prunus avium yang manis dan Prunus cerasus yang asam . Nama 'ceri' juga mengacu pada pohon ceri dan kayunya, dan kadang-kadang diterapkan pada almond dan pohon berbunga yang secara visual mirip dalam genus Prunus , seperti dalam \" ceri hias \" atau \" bunga sakura \". Ceri liar mungkin merujuk pada spesies ceri mana pun yang tumbuh di luar budidaya, meskipun Prunus avium sering disebut secara khusus dengan nama \"ceri liar\" di Kepulauan Inggris."
        ),
        fruit(
            id = 4,
            name = "Buah Naga",
            image = R.drawable.fruit_dragon,
            description = "Buah naga (Inggris: Pitaya) adalah buah dari beberapa jenis kaktus dari genus Hylocereus dan Selenicereus. Buah ini berasal dari Meksiko, Amerika Tengah dan Amerika Selatan namun sekarang juga dibudidayakan di negara-negara Asia seperti Taiwan, Vietnam, Filipina, Indonesia dan Malaysia. Buah ini juga dapat ditemui di Okinawa, Israel, Australia utara dan Tiongkok selatan. Hylocereus hanya mekar pada malam hari."
        ),
        fruit(
            id = 5,
            name = "Kiwi",
            image = R.drawable.fruit_kiwi,
            description = "Kiwi atau Gosberi Cina adalah nama yang diberikan kepada buah beri yang bisa dimakan dari beberapa jenis tanaman kayu merambat dalam genus \"Actinidia\". Actinidia asli berasal dari Shaanxi, Tiongkok.\n" +
                    "\n" +
                    "Kelompok kultivar buah kiwi yang paling umum (hayward) berbentuk oval, kira-kira sebesar telur ayam panjangnya (5–8 cm / 2–3 in dan diameter 4.5–5.5 cm / 1¾–2 ). Buah ini kaya serat, kulit berwarna cokelat kehijau-hijauan agak kusam dan daging buah berwarna hijau terang atau keemasan dengan deretan biji kecil, hitam, dan bisa dimakan. Tekstur buah ini sangat halus dan rasanya yang manis dan unik, saat ini buah kiwi menjadi tanaman komersial di beberapa negara seperti Italia, Selandia Baru, Cile, Yunani, dan Prancis."
        ),
        fruit(
            id = 6,
            name = "Mangga",
            image = R.drawable.fruit_mango,
            description = "Mangga, mempelam, atau pauh adalah nama sejenis buah, demikian pula nama pohonnya. Mangga termasuk ke dalam genus Mangifera, yang terdiri dari 35-40 anggota dari famili Anacardiaceae.\n" +
                    "\n" +
                    "Nama \"mangga\" berasal dari bahasa Tamil, mankay, yang berarti man \"pohon mangga\" + kay \"buah\". Kata ini dibawa ke Eropa oleh orang-orang Portugis dan diserap menjadi manga (bahasa Portugis), mango (bahasa Spanyol dan Inggris) dan lainnya."
        ),
        fruit(
            id = 7,
            name = "Jeruk",
            image = R.drawable.fruit_orange,
            description = "Jeruk (bahasa Inggris: orange) adalah buah dari spesies citrus dalam famili Rutaceae. Istilah \"jeruk\" umumnya mengacu pada Citrus × sinensis yang juga disebut jeruk manis dan Citrus aurantium yang disebut jeruk pahit.\n" +
                    "\n" +
                    "Jeruk manis bereproduksi secara aseksual (apomiksis melalui nucellar embryony), yaitu melalui sistem cangkok, okulasi, setek, dan varietas jeruk manis muncul melalui mutasi."
        ),
        fruit(
            id = 8,
            name = "Nanas",
            image = R.drawable.fruit_pineapple,
            description = "Nanas (Ananas comosus) adalah tumbuhan tropis dengan buah yang dapat dimakan dan tumbuhan yang paling penting secara ekonomi dalam famili Bromeliaceae. Nanas adalah tumbuhan asli Amerika Selatan, dan telah dibudidayakan disana selama berabad-abad. Pengenalan nanas ke Eropa pada abad ke-17 menjadikannya ikon budaya kemewahan yang signifikan. Sejak tahun 1820-an, nanas telah ditanam secara komersial di rumah kaca dan banyak perkebunan tropis. Selain itu, nanas merupakan buah tropis terpenting ketiga dalam produksi dunia. Pada abad ke-20, Hawaii adalah penghasil nanas yang dominan, terutama untuk AS; namun, pada tahun 2016, Kosta Rika, Brasil, dan Filipina menyumbang hampir sepertiga dari produksi nanas dunia."
        ),
        fruit(
            id = 9,
            name = "Stroberi",
            image = R.drawable.fruit_strawberry,
            description = "Stroberi atau tepatnya stroberi kebun (juga dikenal dengan nama arbei, dari bahasa Belanda aardbei) adalah sebuah varietas stroberi yang paling banyak dikenal di dunia. Seperti spesies lain dalam genus Fragaria (stroberi), buah ini berada dalam keluarga Rosaceae. Secara umum buah ini bukanlah buah, melainkan buah semu, artinya daging buahnya tidak berasal dari ovari tanaman (achenium) tetapi dari bagian bawah hypanthium yang berbentuk mangkuk tempat ovari tanaman itu berada."
        ),
        fruit(
            id = 10,
            name = "Semangka",
            image = R.drawable.fruit_watermelon,
            description = "Semangka, tembikai, atau mendikai (Citrullus lanatus, suku ketimun-ketimunan atau Cucurbitaceae) adalah tanaman merambat yang berasal dari daerah setengah gurun di Afrika bagian selatan. Tanaman ini masih sekerabat dengan labu-labuan (Cucurbitaceae), melon (Cucumis melo), dan ketimun (Cucumis sativus). Semangka biasa dipanen buahnya untuk dimakan segar atau dibuat jus. Biji semangka yang dikeringkan dan disangrai juga dapat dimakan isinya (kotiledon) sebagai kuaci."
        )
    )

    val farmList = listOf(
        farm(
            id = 1,
            name = "Kebun Apel",
            image = R.drawable.farm_apple,
            description = "Ini adalah Kebun Apel"
        ),
        farm(
            id = 2,
            name = "Kebun Bluberi",
            image = R.drawable.farm_blueberry,
            description = "Ini adalah Kebun Bluberi"
        ),
        farm(
            id = 3,
            name = "Kebun Kubis",
            image = R.drawable.farm_cabbage,
            description = "Ini adalah Kebun Kubis"
        ),
        farm(
            id = 4,
            name = "Kebun Jagung",
            image = R.drawable.farm_corn,
            description = "Ini adalah Kebun Jagung"
        ),
        farm(
            id = 5,
            name = "Kebun Buah Naga",
            image = R.drawable.farm_dragon,
            description = "Ini adalah Kebun Buah Naga"
        ),
        farm(
            id = 6,
            name = "Kebun Terong",
            image = R.drawable.farm_eggplant,
            description = "Ini adalah Kebun Terong"
        ),
        farm(
            id = 7,
            name = "Kebun Nanas",
            image = R.drawable.farm_pineapple,
            description = "Ini adalah Kebun Nanas"
        ),
        farm(
            id = 8,
            name = "Kebun Bawang Merah",
            image = R.drawable.farm_red_onion,
            description = "Ini adalah Kebun Bawang Merah"
        ),
        farm(
            id = 9,
            name = "Kebun Bayam",
            image = R.drawable.farm_spinach,
            description = "Ini adalah Kebun Bayam"
        ),
        farm(
            id = 10,
            name = "Kebun Stroberi",
            image = R.drawable.farm_strawberry,
            description = "Ini adalah Kebun Stroberi"
        )
    )
}