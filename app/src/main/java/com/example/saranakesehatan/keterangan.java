package com.example.saranakesehatan;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class keterangan extends AppCompatActivity {
    private TextView GetNama, GetAlamat, GetLongitude, GetLatitude, GetNo, GetFasilitas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keterangan);
        getSupportActionBar().setTitle("Keterangan");
        GetNama = findViewById(R.id.getnama);
        GetAlamat = findViewById(R.id.getalamat);
        GetLongitude = findViewById(R.id.getlongitude);
        GetLatitude = findViewById(R.id.getlatitude);
        GetNo = findViewById(R.id.getno);
        GetFasilitas = findViewById(R.id.getfasilitas);
        showData();
    }
    @SuppressLint("SetTextI18n")
    private void  showData(){
        String nama = getIntent().getExtras().getString("MyName");
        switch (nama){
            case "Puskesmas Talaga":
                GetNama.setText("Nama Sarana Kesehatan : Puskesmas Talaga");
                GetAlamat.setText("Alamat : Jl.Jenderal Ahmad Yani, TalagaWetan, Talaga, 45463");
                GetLongitude.setText("Longitude : 108.311220");
                GetLatitude.setText("Latitude : -6.98331");
                GetNo.setText("No Telepon : (0233)319421");
                GetFasilitas.setText("Fasilitas : ");
                break;

            case "Puskesmas Cikijing":
                GetNama.setText("Nama Sarana Kesehatan : Puskesmas Cikijing");
                GetAlamat.setText("Alamat : Jl.Raya Kasturi No. 29, Kasturi, Cikijing, 45466");
                GetLongitude.setText("Longitude : 108.353577");
                GetLatitude.setText("Latitude : -7.011623");
                GetNo.setText("No Telepon : (0233)319082");
                GetFasilitas.setText("Fasilitas : ");
                break;

            case "Puskesmas Cingambul":
                GetNama.setText("Nama Sarana Kesehatan : Puskesmas Cingambul");
                GetAlamat.setText("Alamat : Jl.Raya Cingambul No.40, Cingambul");
                GetLongitude.setText("Longitude : 108.353160");
                GetLatitude.setText("Latitude : -7.043433");
                GetNo.setText("No Telepon : (0233)319520");
                GetFasilitas.setText("Fasilitas : ");
                break;

            case "Puskesmas Lemahsugih":
                GetNama.setText("Nama Sarana Kesehatan : Puskesmas Lemahsugih");
                GetAlamat.setText("Alamat : Lemahputih, Lemahsuguih, 45465");
                GetLongitude.setText("Longitude : 108.169710");
                GetLatitude.setText("Latitude : -7.011919");
                GetNo.setText("No Telepon : -");
                GetFasilitas.setText("Fasilitas : ");
                break;

            case "Puskesmas Margajaya":
                GetNama.setText("Nama Sarana Kesehatan : Puskesmas Margajaya");
                GetAlamat.setText("Alamat : Margajaya, Lemahsugih, 45465");
                GetLongitude.setText("Longitude : 108.189511");
                GetLatitude.setText("Latitude : -6.989079");
                GetNo.setText("No Telepon : 082319276903");
                GetFasilitas.setText("Fasilitas : ");
                break;

            case "Puskesmas Malausma":
                GetNama.setText("Nama Sarana Kesehatan : Puskesmas Malausma");
                GetAlamat.setText("Alamat : Jl.Kartabraja, Malausma, 45464");
                GetLongitude.setText("Longitude : 108.253330");
                GetLatitude.setText("Latitude : -7.044418");
                GetNo.setText("No Telepon : -");
                GetFasilitas.setText("Fasilitas : ");
                break;

            case "Puskesmas Bantarujeg":
                GetNama.setText("Nama Sarana Kesehatan : Puskesmas Bantarujeg");
                GetAlamat.setText("Alamat : Bantarujeg");
                GetLongitude.setText("Longitude : 108.241690");
                GetLatitude.setText("Latitude : -6.965283");
                GetNo.setText("No Telepon : -");
                GetFasilitas.setText("Fasilitas : ");
                break;

            case "Puskesmas Banjaran":
                GetNama.setText("Nama Sarana Kesehatan : Puskesmas Banjaran");
                GetAlamat.setText("Alamat : Banjaran, Majalengka, 45468");
                GetLongitude.setText("Longitude : 108.314236");
                GetLatitude.setText("Latitude : -6.961101");
                GetNo.setText("No Telepon : -");
                GetFasilitas.setText("Fasilitas : ");
                break;

            case "Puskesmas Argapura":
                GetNama.setText("Nama Sarana Kesehatan : Puskesmas Argapura");
                GetAlamat.setText("Alamat : Sukasari Kidul, Argapura, 45462");
                GetLongitude.setText("Longitude : 108.314419");
                GetLatitude.setText("Latitude : -6.909032");
                GetNo.setText("No Telepon : -");
                GetFasilitas.setText("Fasilitas : ");
                break;

            case "Puskesmas Maja":
                GetNama.setText("Nama Sarana Kesehatan : Puskesmas Maja");
                GetAlamat.setText("Alamat : Jl.Ds. Maja Selatan, Maja, 45461");
                GetLongitude.setText("Longitude : 108.304260");
                GetLatitude.setText("Latitude : -6.889281");
                GetNo.setText("No Telepon : -");
                GetFasilitas.setText("Fasilitas : ");
                break;

            case "Puskesmas Majalengka":
                GetNama.setText("Nama Sarana Kesehatan : Puskesmas Majalengka");
                GetAlamat.setText("Alamat : Jl.Ahmad Kusuma No.413, Cicurug, Majalengka, 45411");
                GetLongitude.setText("Longitude : 108.237997");
                GetLatitude.setText("Latitude : -6.839964");
                GetNo.setText("No Telepon : (0233)281657");
                GetFasilitas.setText("Fasilitas : ");
                break;

            case "Puskesmas Munjul":
                GetNama.setText("Nama Sarana Kesehatan : Puskesmas Munjul");
                GetAlamat.setText("Alamat : Jl.Kh. Abdul Halim No.69, Munjul, Majalengka, 45457");
                GetLongitude.setText("Longitude : 108.206072");
                GetLatitude.setText("Latitude : -6.831188");
                GetNo.setText("No Telepon : (0233)282093");
                GetFasilitas.setText("Fasilitas : ");
                break;

            case "Puskesmas Cigasong":
                GetNama.setText("Nama Sarana Kesehatan : Puskesmas Cigasong");
                GetAlamat.setText("Alamat : Jl.Tonjong Jatiwangi, Kutamanggu, Cigasong, 45478");
                GetLongitude.setText("Longitude : 108.251935");
                GetLatitude.setText("Latitude : -6.809019");
                GetNo.setText("No Telepon : (0233)284113");
                GetFasilitas.setText("Fasilitas : ");
                break;

            case "Puskesmas Sukahaji":
                GetNama.setText("Nama Sarana Kesehatan : Puskesmas Sukahaji");
                GetAlamat.setText("Alamat : Jl.Majalengka-Rajagaluh No.90, Sukahaji, 45471");
                GetLongitude.setText("Longitude : 108.281898");
                GetLatitude.setText("Latitude : -6.819008");
                GetNo.setText("No Telepon : -");
                GetFasilitas.setText("Fasilitas : ");
                break;

            case "Puskesmas Salagedang":
                GetNama.setText("Nama Sarana Kesehatan : Puskesmas Salagedang");
                GetAlamat.setText("Alamat : Salagedang, Rajagaluh, 45471");
                GetLongitude.setText("Longitude : 108.313116");
                GetLatitude.setText("Latitude : -6.800370");
                GetNo.setText("No Telepon : (0233)510564");
                GetFasilitas.setText("Fasilitas : ");
                break;

            case "Puskesmas Sindang":
                GetNama.setText("Nama Sarana Kesehatan :Puskesmas Sindang");
                GetAlamat.setText("Alamat : Jl. Ds. Sindang, Kec. Sindang, Majalengka, 45471");
                GetLongitude.setText("Longitude : 108.326942");
                GetLatitude.setText("Latitude : -6.829396");
                GetNo.setText("No Telepon : (0233)319421");
                GetFasilitas.setText("fasilitas : ");
                break;

            case "Puskesmas Rajagaluh":
                GetNama.setText("Nama Sarana Kesehatan : Puskesmas Rajagaluh ");
                GetAlamat.setText("Alamat : Jalan Yudapati, Teja, Rajagaluh, Majalengka, 45472");
                GetLongitude.setText("Longitude : 108.344993");
                GetLatitude.setText("Latitude : -6.787232");
                GetNo.setText("No Telepon : (0233) 510584");
                GetFasilitas.setText("fasilitas : ");
                break;

            case "Puskesmas Sindangwangi":
                GetNama.setText("Nama Sarana Kesehatan : Puskesmas Sindangwangi");
                GetAlamat.setText("Alamat : Jl. LawangGada, Sindangwangi, Kabupaten Majalengka, 45474");
                GetLongitude.setText("Longitude : 108.376785");
                GetLatitude.setText("Latitude : -6.791678");
                GetNo.setText("No Telepon : -");
                GetFasilitas.setText("fasilitas : ");
                break;

            case "Puskesmas Leuwimunding":
                GetNama.setText("Nama Sarana Kesehatan :Puskesmas Lewuimunding ");
                GetAlamat.setText("Alamat : Jl. Raya Rajagaluh, Mirat, Kec. Leuwimunding, Kabupaten Majalengka, Jawa Barat, 45473");
                GetLongitude.setText("Longitude : 108.347950");
                GetLatitude.setText("Latitude : -6.733796");
                GetNo.setText("No Telepon : -");
                GetFasilitas.setText("fasilitas : ");
                break;

            case "Puskesmas Waringin":
                GetNama.setText("Nama Sarana Kesehatan :Puskesmas Waringin ");
                GetAlamat.setText("Alamat : Jl. Raya WaringinDesa No.188, Waringin, Kec. Palasah, Kabupaten Majalengka, Jawa Barat, 45475");
                GetLongitude.setText("Longitude : 108.291142");
                GetLatitude.setText("Latitude : -6.747497");
                GetNo.setText("No Telepon : (0233)884889");
                GetFasilitas.setText("fasilitas : ");
                break;

            case "Puskesmas Jatiwangi":
                GetNama.setText("Nama Sarana Kesehatan :Puskesmas Jatiwangi ");
                GetAlamat.setText("Alamat : Jl. LanudSukani No.1, Jatisura, Kec. Jatiwangi, Kabupaten Majalengka, Jawa Barat, 45454");
                GetLongitude.setText("Longitude : 108.237997");
                GetLatitude.setText("Latitude : -6.839964");
                GetNo.setText("No Telepon : (0233)881030");
                GetFasilitas.setText("fasilitas : ");
                break;

            case "Puskesmas Loji":
                GetNama.setText("Nama Sarana Kesehatan :Puskesmas Loji Jatiwangi ");
                GetAlamat.setText("Alamat : Jl. Raya Cirebon - Bandung, Loji, Kec. Jatiwangi, Kabupaten Majalengka, Jawa Barat, 45454");
                GetLongitude.setText("Longitude : 108.276578");
                GetLatitude.setText("Latitude : -6.725339");
                GetNo.setText("No Telepon : (0233)881030");
                GetFasilitas.setText("fasilitas : ");
                break;

            case "Puskesmas Balida":
                GetNama.setText("Nama Sarana Kesehatan :Puskesmas Balida ");
                GetAlamat.setText("Alamat : Jalan Margasopana No.01, Balida, Kec. Dawuan, Kabupaten Majalengka, Jawa Barat, 45453");
                GetLongitude.setText("Longitude : 108.206919");
                GetLatitude.setText("Latitude : -6.727518");
                GetNo.setText("No Telepon : (0233)885393");
                GetFasilitas.setText("fasilitas : ");
                break;

            case "Puskesmas Kasokandel":
                GetNama.setText("Nama Sarana Kesehatan : Puskesmas Kasokandel ");
                GetAlamat.setText("Alamat : Jl. Raya Cirebon - Bandung No.1, Gunungsari, Kasokandel, Kabupaten Majalengka, Jawa Barat, 45453");
                GetLongitude.setText("Longitude : 108.225641");
                GetLatitude.setText("Latitude : -6.741212");
                GetNo.setText("No Telepon : (0233)883490");
                GetFasilitas.setText("fasilitas : ");
                break;

            case "Puskesmas Panyingkiran":
                GetNama.setText("Nama Sarana Kesehatan : Puskesmas Panyingkiran ");
                GetAlamat.setText("Alamat :Jl. Karyamukti, Panyingkiran, Kabupaten Majalengka, Jawa Barat, 45459");
                GetLongitude.setText("Longitude : 108.184907");
                GetLatitude.setText("Latitude : -6.803011");
                GetNo.setText("No Telepon : (0233)283249");
                GetFasilitas.setText("fasilitas : ");
                break;

            case "Puskesmas Kadipaten":
                GetNama.setText("Nama Sarana Kesehatan :Puskesmas Kadipaten");
                GetAlamat.setText("Alamat : Jl. Siliwangi No.11, Liangjulang, Kec. Kadipaten, Kabupaten Majalengka, Jawa Barat, 45452");
                GetLongitude.setText("Longitude : 108.311220");
                GetLatitude.setText("Latitude : -6.98331");
                GetNo.setText("No Telepon : (0233)661588");
                GetFasilitas.setText("fasilitas : ");
                break;

            case "Puskesmas Kertajati ":
                GetNama.setText("Nama Sarana Kesehatan : Puskesmas Kadipaten");
                GetAlamat.setText("Alamat :Jl.Kertajati, Kabupaten Majalengka, Jawa Barat, 45457");
                GetLongitude.setText("Longitude : 108.172517");
                GetLatitude.setText("Latitude : -6.665698");
                GetNo.setText("No Telepon : (0233)662554");
                GetFasilitas.setText("fasilitas : ");
                break;

            case "Puskesmas Sukamulya ":
                GetNama.setText("Nama Sarana Kesehatan : Puskesmas Sukamulya");
                GetAlamat.setText("Alamat :Jl. KasmanKarsono No.2, Mekarmulya, Kertajati, Kabupaten Majalengka, Jawa Barat, 45457");
                GetLongitude.setText("Longitude : 108.124846");
                GetLatitude.setText("Latitude : -6.637456");
                GetNo.setText("No Telepon : (-");
                GetFasilitas.setText("fasilitas : ");
                break;

            case "Puskesmas Jatitujuh":
                GetNama.setText("Nama Sarana Kesehatan :Puskesmas Jatitujuh");
                GetAlamat.setText("Alamat : JL Raya Jatitujuh, No. 31, JatiTujuh, Jatitengah, Kec. Majalengka, Kabupaten Majalengka, Jawa Barat, 45458");
                GetLongitude.setText("Longitude : 108.229305");
                GetLatitude.setText("Latitude : -6.645520");
                GetNo.setText("No Telepon : (0233)882791");
                GetFasilitas.setText("fasilitas : ");
                break;

            case "Puskesmas Panoongan":
                GetNama.setText("Nama Sarana Kesehatan : Puskesmas Panoongan");
                GetAlamat.setText("Alamat : JlPanongan, Jatitujuh, Panongan, Majalengka, Kabupaten Majalengka, Jawa Barat 45458");
                GetLongitude.setText("Longitude : 108.221163");
                GetLatitude.setText("Latitude : -6.678001");
                GetNo.setText("No Telepon : (-");
                GetFasilitas.setText("fasilitas : ");
                break;

            case "Puskesmas Ligung":
                GetNama.setText("Nama Sarana Kesehatan :Puskesmas Ligung");
                GetAlamat.setText("Alamat : Jl.LigungLor, Kec. Ligung, Kabupaten Majalengka, Jawa Barat, 45456");
                GetLongitude.setText("Longitude : 108.280152");
                GetLatitude.setText("Latitude : -6.651983");
                GetNo.setText("No Telepon : (0233)882822");
                GetFasilitas.setText("fasilitas : ");
                break;

            case "Puskesmas Sumberjaya":
                GetNama.setText("Nama Sarana Kesehatan :Puskesmas Sumber Jaya ");
                GetAlamat.setText("Alamat :JlPaningkiran, Kec. Sumberjaya, Kabupaten Majalengka, Jawa Barat, 45458");
                GetLongitude.setText("Longitude : 108.362148");
                GetLatitude.setText("Latitude : -6.703496");
                GetNo.setText("No Telepon : 081802224320");
                GetFasilitas.setText("fasilitas : ");
                break;

            case "RS Majalengka":
                GetNama.setText("Nama Sarana Kesehatan :Rumah Sakit Majalengka");
                GetAlamat.setText("Alamat :Jl. Kesehatan No.77, Majalengka Wetan, Kec. Majalengka, Kabupaten Majalengka, Jawa Barat 45411");
                GetLongitude.setText("Longitude : 108.233443");
                GetLatitude.setText("Latitude : -6.833867");
                GetNo.setText("No Telepon : (0233)281189");
                GetFasilitas.setText("fasilitas : ");
                break;

            case "RS Cideres":
                GetNama.setText("Nama Sarana Kesehatan :Rumah Sakit Majalengka");
                GetAlamat.setText("Alamat :Jl. Raya Barat Cideres No.180, Bojongcideres, Kec. Dawuan, Kabupaten Majalengka, Jawa Barat 45453");
                GetLongitude.setText("Longitude : 108.182964");
                GetLatitude.setText("Latitude : -6.800059");
                GetNo.setText("No Telepon : (0233)661003");
                GetFasilitas.setText("fasilitas : ");
                break;

            case "RS Bedah Budi Kasih":
                GetNama.setText("Nama Sarana Kesehatan : Rumah Sakit Bedah Budi Kasih");
                GetAlamat.setText("Alamat :JL. Raya Majalengka - Kadipaten, KM 7, Dawuan, Kadipaten, Majalengka, Kabupaten Majalengka, Jawa Barat, 45452");
                GetLongitude.setText("Longitude : 108.195024");
                GetLatitude.setText("Latitude : -6.760723");
                GetNo.setText("No Telepon : (0233)8665508");
                GetFasilitas.setText("fasilitas : ");
                break;
        }
    }
}
