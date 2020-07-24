package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.drm.DrmStore;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;


import java.util.Arrays;
import java.util.Collections;

public class Games extends AppCompatActivity {

    ImageView img1, img2, img3, img4, img5, img6, img7, img8;

    private ImageSwitcher img;
    int kartupertama, kartukedua;
    int klikpertama, klikkedua;
    Integer[] Array = {101, 102, 103, 104, 201, 202, 203, 204};
    int gbr1, gbr2, gbr3, gbr4, gbr5, gbr6, gbr7, gbr8;
    int nomerkartu = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);
        img6 = findViewById(R.id.img6);
        img7 = findViewById(R.id.img7);
        img8 = findViewById(R.id.img8);


        img1.setTag("0");
        img2.setTag("1");
        img3.setTag("2");
        img4.setTag("3");
        img5.setTag("4");
        img6.setTag("5");
        img7.setTag("6");
        img8.setTag("7");


        gbr1 = R.drawable.ic_flag;
        gbr2 = R.drawable.ic_heart;
        gbr3 = R.drawable.ic_moon;
        gbr4 = R.drawable.ic_star;
        gbr5 = R.drawable.ic_flag;
        gbr6 = R.drawable.ic_heart;
        gbr7 = R.drawable.ic_moon;
        gbr8 = R.drawable.ic_star;

        Collections.shuffle(Arrays.asList(Array));

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int kartu = Integer.parseInt((String) v.getTag());
                gambar(img1, kartu);


            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int kartu = Integer.parseInt((String) v.getTag());
                gambar(img2, kartu);
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int kartu = Integer.parseInt((String) v.getTag());
                gambar(img3, kartu);
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int kartu = Integer.parseInt((String) v.getTag());
                gambar(img4, kartu);
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int kartu = Integer.parseInt((String) v.getTag());
                gambar(img5, kartu);
            }
        });
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int kartu = Integer.parseInt((String) v.getTag());
                gambar(img6, kartu);
            }
        });
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int kartu = Integer.parseInt((String) v.getTag());
                gambar(img7, kartu);
            }
        });
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int kartu = Integer.parseInt((String) v.getTag());
                gambar(img8, kartu);
            }
        });
    }

    private void gambar(ImageView img, int kar) {
        if (Array[kar] == 101) {
            img.setImageResource(gbr1);
        } else if (Array[kar] == 102) {
            img.setImageResource(gbr2);
        } else if (Array[kar] == 103) {
            img.setImageResource(gbr3);
        } else if (Array[kar] == 104) {
            img.setImageResource(gbr4);
        } else if (Array[kar] == 201) {
            img.setImageResource(gbr5);
        } else if (Array[kar] == 202) {
            img.setImageResource(gbr6);
        } else if (Array[kar] == 203) {
            img.setImageResource(gbr7);
        } else if (Array[kar] == 204) {
            img.setImageResource(gbr8);
        }


        if (nomerkartu == 1) {
            kartupertama = Array[kar];
            if (kartupertama > 200) {
                kartupertama = kartupertama - 100;
            }
            nomerkartu = 2;
            klikpertama = kar;

            img.setEnabled(false);
        } else if (nomerkartu == 2) {
            kartukedua = Array[kar];
            if (kartukedua > 200) {
                kartukedua = kartukedua - 100;
            }
            nomerkartu = 1;
            klikkedua = kar;

            img1.setEnabled(false);
            img2.setEnabled(false);
            img3.setEnabled(false);
            img4.setEnabled(false);
            img5.setEnabled(false);
            img6.setEnabled(false);
            img7.setEnabled(false);
            img8.setEnabled(false);
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {

                    calculate();
                }
            }, 500);
        }
    }

    private void calculate() {

        if (kartupertama == kartukedua) {
            if (klikpertama == 0) {
                img1.setVisibility(View.INVISIBLE);
            } else if (klikpertama == 1) {
                img2.setVisibility(View.INVISIBLE);
            } else if (klikpertama == 2) {
                img3.setVisibility(View.INVISIBLE);
            } else if (klikpertama == 3) {
                img4.setVisibility(View.INVISIBLE);
            } else if (klikpertama == 4) {
                img5.setVisibility(View.INVISIBLE);
            } else if (klikpertama == 5) {
                img6.setVisibility(View.INVISIBLE);
            } else if (klikpertama == 6) {
                img7.setVisibility(View.INVISIBLE);
            } else if (klikpertama == 7) {
                img8.setVisibility(View.INVISIBLE);
            }

            if (klikkedua == 0) {
                img1.setVisibility(View.INVISIBLE);
            } else if (klikkedua == 1) {
                img2.setVisibility(View.INVISIBLE);
            } else if (klikkedua == 2) {
                img3.setVisibility(View.INVISIBLE);
            } else if (klikkedua == 3) {
                img4.setVisibility(View.INVISIBLE);
            } else if (klikkedua == 4) {
                img5.setVisibility(View.INVISIBLE);
            } else if (klikkedua == 5) {
                img6.setVisibility(View.INVISIBLE);
            } else if (klikkedua == 6) {
                img7.setVisibility(View.INVISIBLE);
            } else if (klikkedua == 7) {
                img8.setVisibility(View.INVISIBLE);
            }

        } else {
            img1.setImageResource(R.drawable.ic_question);
            img2.setImageResource(R.drawable.ic_question);
            img3.setImageResource(R.drawable.ic_question);
            img4.setImageResource(R.drawable.ic_question);
            img5.setImageResource(R.drawable.ic_question);
            img6.setImageResource(R.drawable.ic_question);
            img7.setImageResource(R.drawable.ic_question);
            img8.setImageResource(R.drawable.ic_question);

        }
        img1.setEnabled(true);
        img2.setEnabled(true);
        img3.setEnabled(true);
        img4.setEnabled(true);
        img5.setEnabled(true);
        img6.setEnabled(true);
        img7.setEnabled(true);
        img8.setEnabled(true);


        cek();
    }

    private void cek() {
        if (img1.getVisibility() == View.INVISIBLE &&
                img2.getVisibility() == View.INVISIBLE &&
                img3.getVisibility() == View.INVISIBLE &&
                img4.getVisibility() == View.INVISIBLE &&
                img5.getVisibility() == View.INVISIBLE &&
                img6.getVisibility() == View.INVISIBLE &&
                img7.getVisibility() == View.INVISIBLE &&
                img8.getVisibility() == View.INVISIBLE) {
            AlertDialog.Builder alert = new AlertDialog.Builder(Games.this);
            alert.setTitle("Berhasil").setIcon(R.drawable.ic_tick).setMessage("Jika Kamu Ingin Bermain Lagi Klik New Game")
                    .setCancelable(false).setPositiveButton("NEW GAME", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(), Games.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("Keluar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
            AlertDialog alertDialog = alert.create();
            alertDialog.show();
        }
    }
}











