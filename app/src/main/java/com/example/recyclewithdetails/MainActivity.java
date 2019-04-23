package com.example.recyclewithdetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private String title = "Mode List";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mDesc = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mImageDet = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate:started.");
        initImageBitmaps();
    }

    private void initImageBitmaps() {
        mImageUrls.add("https://i2.wp.com/aftercredits.com/wp-content/uploads/2018/12/AquamanPoster.jpg");
        mNames.add("Aquaman");
        mDesc.add("Action");
        mImageDet.add("Aquaman ini menceritakan tentang asal usul nya yang menjadi raja di kerajaan bawah laut. Arthur Curry yang memerankan Aquaman ini harus melawan saudaranya sendiri, Orm yang ingin menyatukan 7 kerajaan bawah laut untuk memerangi makhluk permukaan.");

        mImageUrls.add("https://cdn.traileraddict.com/content/warner-bros-pictures/rampage-2018-poster-3.jpg");
        mNames.add("Rampage");
        mDesc.add("Action");
        mImageDet.add("Rampage ini bercerita tentang Gorilla yang terbentuk karena rekayasa genetika. Gorilla tersebut ditemani ahli primata, Davis Okoye yang diperankan oleh Dwayne Jhonson.");

        mImageUrls.add("https://upload.wikimedia.org/wikipedia/en/2/2e/Bohemian_Rhapsody_poster.png");
        mNames.add("Bhohemian Rhapsody");
        mDesc.add("Biography, Drama, Music");
        mImageDet.add("Film ini menceritakan perjalanan karir dari seorang vokalis band legendaris Queen, Freddie Mercury. Freddie dikenal dengan nama asli Farrokh Bulsara. Di film ini kita akan diajak mengenal masa lalunya, bagaimana ketika bertemu dengan Roger Taylor dan Bryan May yang harus menjual mobil tua untuk menyewa studio.");

        mImageUrls.add("https://m.media-amazon.com/images/M/MV5BMTYxNDMyOTAxN15BMl5BanBnXkFtZTgwMDg1ODYzNTM@._V1_UY1200_CR90,0,630,1200_AL_.jpg");
        mNames.add("Crazy Rich Asian");
        mDesc.add("Comedy, Romance");
        mImageDet.add("Inti cerita film Crazy Rich Asians adalah tentang seorang professor muda bernama Rachel  yang pergi menemui pacarnya d kampung halamannya. Setibanya disana, Rachel merasa rendah diri terhadap apa yang dimiliki oleh pacarnya disana. Bahkan ia menjadi pujaan dan tidak sedikit orang yang ingin menjatuhkannya.");

        mImageUrls.add("https://z6mag.com/wp-content/uploads/2018/10/Dj8UGRJUYAA6sF6.jpg");
        mNames.add("Venom");
        mDesc.add("Action, Horror");
        mImageDet.add("Di film ini, Eddie Broke mengawali kisahnya yang menjadi seorang wartawan. Namun karirnya harus hancur karena dituduh membuat berita asal yang hanya mementingkan yayasan luar angkasa. Eddie menemukan sekutu barunya, Symbiote yang kemudian merubahnya menjadi manusia dengan kekuatan dahsyat. Dia pun juga bertemu dengan Symbiote lain yang dijadikan musuh. Konflik pun terjadi seperti film action seperti biasanya");

        mImageUrls.add("https://tse4.mm.bing.net/th?id=OIP.aGyfrTrUZkkFo0ML59R6jgHaK0&pid=Api&P=0&w=300&h=300");
        mNames.add("Ant man and The Wasp");
        mDesc.add("Action, Adventure, COmedy");
        mImageDet.add("Buat yang ketinggalan dan belum nonton, film ini melanjutkan kisahnya Scott Lang yang sedang menjalani tahanan rumah. Namun Dr Pym, si pemilik kostum Ant Man ini meminta tolong dia untuk membantunya menjemput istrinya yang terjebak di quantum realm. Karena dulu Scott Lang juga terjebak di quantum tapi bisa keluar dari sana.");

        mImageUrls.add("https://tse1.mm.bing.net/th?id=OIP.SS7QJ_6jCTmp5evO0aOU1gHaKK&pid=Api&P=0&w=300&h=300");
        mNames.add("Black Phanter");
        mDesc.add("Action, Adventure");
        mImageDet.add("Black Panther dengan nama T’Challa merupakan anak dari raja sebelumnya yang kemudian mendapatkan tahta untuk memimpin Wakanda. Suatu ketika, saudara jauhnya muncul dan ingin merebut tahta Wakanda tersebut. Disinilah konflik yang dihadirkan di film Black Panther. Pertempuran saudara untuk menjadi Raja Wakanda.");

        mImageUrls.add("https://tse2.mm.bing.net/th?id=OIP.EAF2Begwtp-Lx7isAb_aHwAAAA&pid=Api&P=0&w=300&h=300");
        mNames.add("Avenger : Infinity War");
        mDesc.add("Action, Adventure, Sci-Fi");
        mImageDet.add("Avengers Infinity War” bercerita tentang kisah kelanjutan petualangan para superhero yang tergabung dalam tim Avengers. Para anggota tim tersebut akan berhadapan dengan musuh yang berusaha menghancurkan bumi yakni Thanos. Aksi perlawanan yang dilakukan oleh tim Avengers ini akan mengalami kesulitan karena Thanos memiliki tentara alien yang kuat dengan jumlah yang banyak. Meskipun demikian mereka harus berusaha keras melawan Thanos hingga tiba bantuan dari tim Guardian of the Galaxy.");

        initRecyclerView();

    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecycleViewAdapter adapter = new RecycleViewAdapter(this, mNames, mImageUrls, mDesc, mImageDet);
        recyclerView.setAdapter(adapter);
    }

    private void showRecyleList() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListActivity adapter = new ListActivity(this, mNames, mImageUrls, mDesc, mImageDet);
        recyclerView.setAdapter(adapter);

    }

    private void showRecyclerGrid() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        GridActivity adapter = new GridActivity(this, mImageUrls);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_list:
                setActionBarTitle("Mode List");
                showRecyleList();
                break;
            case R.id.action_grid:
                setActionBarTitle("Mode Grid");
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                setActionBarTitle("Mode Card View");
                initRecyclerView();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);

    }
}