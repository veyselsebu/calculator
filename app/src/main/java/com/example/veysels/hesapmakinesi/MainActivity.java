package com.example.veysels.hesapmakinesi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button bir,iki,uc,dort,bes,alti,yedi,sekiz,dokuz,sifir,arti,bol,cikar,carp,esittir,sifirla,sil,nokta;
private TextView ekran,ekran2;
private String d1,d2,d3,d4;
private double s1,s2,s3;
    private int oncekiIslem;
    private boolean ilkMi=true;
    private boolean esittirC=false;
    private boolean islemC=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bir=(Button)findViewById(R.id.bir);
        iki=(Button)findViewById(R.id.iki);
        uc=(Button)findViewById(R.id.uc);
        dort=(Button)findViewById(R.id.dort);
        bes=(Button)findViewById(R.id.bes);
        alti=(Button)findViewById(R.id.alti);
        yedi=(Button)findViewById(R.id.yedi);
        sekiz=(Button)findViewById(R.id.sekiz);
        dokuz=(Button)findViewById(R.id.dokuz);
        sifir=(Button)findViewById(R.id.sifir);
        arti=(Button)findViewById(R.id.arti);
        bol=(Button)findViewById(R.id.bol);
        cikar=(Button)findViewById(R.id.cikar);
        carp=(Button)findViewById(R.id.carp);
        esittir=(Button)findViewById(R.id.esittir);
        sifirla=(Button)findViewById(R.id.c);
        ekran=(TextView)findViewById(R.id.ekran);
        ekran2=(TextView)findViewById(R.id.ekran2);
        sil=(Button)findViewById(R.id.sil);
        nokta=(Button)findViewById(R.id.nokta);
        d1="";d2="";d3="";d4="";
        s2=999999.99999;
sifirla.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        d1="";d2="";d3="";d4="";
        ilkMi=true;esittirC=false;islemC=false;
    ekran.setText("0");
        ekran2.setText("0");

    }
});

        nokta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1+=".";
                EkraniYaz();
                islemC=false;
            }
        });
        bir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                d1+="1";
                EkraniYaz();
        islemC=false;
            }
        }
        );
        iki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1+="2";
                EkraniYaz();
                islemC=false;
            }
        });

        uc.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       d1+="3";
                                       EkraniYaz();
                                       islemC=false;
                                   }
                               }
        );
        dort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1+="4";
                EkraniYaz();
                islemC=false;
            }
        });
        bes.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       d1+="5";
                                       EkraniYaz();
                                       islemC=false;
                                   }
                               }
        );
        alti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1+="6";
                EkraniYaz();
                islemC=false;
            }
        });
        yedi.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       d1+="7";
                                       EkraniYaz();
                                       islemC=false;
                                   }
                               }
        );
        sekiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1+="8";
                EkraniYaz();
                islemC=false;
            }
        });
        dokuz.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       d1+="9";
                                       EkraniYaz();
                                       islemC=false;
                                   }
                               }
        );
        sifir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1+="0";
                EkraniYaz();
                islemC=false;
            }
        });
        sil.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       if(d1.length()==1)
                                           d1="0";
                                       else
                                       d1=d1.substring(0,d1.length()-1);
                                       EkraniYaz();
                                   }
                               }
        );
        bol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!islemC) {
                    if (ilkMi) {
                        s1 = Double.parseDouble(d1);
                        d3 = d3 + d1 + " / ";
                        ilkMi = false;
                        d4 = d1;
                    } else {
                        d3 = d3 + d1 + " / ";

                        s2 = Double.parseDouble(d1);
                        s1 = hesapla(s1, s2, oncekiIslem);
                        d4 = d1;
                        s2 = 999999.99999;
                    }
                    d1 = "";
                    oncekiIslem = 4;
                    EkraniYaz();
                }
                else{
                    d3=d3.substring(0,d3.length()-3);
                    d3+=" / ";
                    EkraniYaz();
                    oncekiIslem=4;
                }
                islemC=true;
            }
        });
        cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!islemC) {
                    if (ilkMi) {
                        s1 = Double.parseDouble(d1);
                        d3 = d3 + d1 + " - ";
                        ilkMi = false;
                        d4 = d1;
                    } else {
                        d3 = d3 + d1 + " - ";

                        s2 = Double.parseDouble(d1);
                        s1 = hesapla(s1, s2, oncekiIslem);
                        d4 = d1;
                        s2 = 999999.99999;
                    }
                    d1 = "";
                    oncekiIslem = 2;
                    EkraniYaz();
                } else{
                    d3=d3.substring(0,d3.length()-3);
                    d3+=" - ";
                    EkraniYaz();
                    oncekiIslem=2;
                }
                islemC=true;
            }
        });
        arti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!islemC) {
                    if (ilkMi) {
                        s1 = Double.parseDouble(d1);
                        d3 = d3 + d1 + " + ";
                        ilkMi = false;
                        d4 = d1;
                        s2 = 999999.99999;
                    } else {
                        d3 = d3 + d1 + " + ";

                        s2 = Double.parseDouble(d1);
                        s1 = hesapla(s1, s2, oncekiIslem);
                        d4 = d1;
                        s2 = 999999.99999;
                    }
                    d1 = "";
                    oncekiIslem = 1;
                    EkraniYaz();
                } else{
                    d3=d3.substring(0,d3.length()-3);
                    d3+=" + ";
                    EkraniYaz();
                    oncekiIslem=1;
                }
        islemC=true;
            }
        });
        carp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!islemC) {
                    if (ilkMi) {
                        s1 = Double.parseDouble(d1);
                        d3 = d3 + d1 + " X ";
                        ilkMi = false;
                        d4 = d1;
                    } else {
                        d3 = d3 + d1 + " X ";

                        s2 = Double.parseDouble(d1);
                        s1 = hesapla(s1, s2, oncekiIslem);
                        d4 = d1;
                        s2 = 999999.99999;
                    }
                    d1 = "";
                    oncekiIslem = 3;
                    EkraniYaz();
                }else{
                    d3=d3.substring(0,d3.length()-3);
                    d3+=" X ";
                    EkraniYaz();
                    oncekiIslem=3;
                }
                islemC=true;
            }
        });
esittir.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

if(d1.equals("")){



        }else{
            s2 = Double.parseDouble(d1);
            s1 = hesapla(s1, s2, oncekiIslem);

        }
        d3 += d1 + " = ";
        d1 = "" + s1;
        EkraniYaz();
        esittirC = true;
        ilkMi = true;
    }
});


    }
    private double hesapla(double sayi1,double sayi2,int komut){
        switch (komut){
            case 1:
                return sayi1+sayi2;

            case 2:
                return sayi1-sayi2;

            case 3:
                return sayi1*sayi2;

            case 4:
                return sayi1/sayi2;

        }

        return sayi1;
    }
    private void EkraniYaz(){
        ekran.setText(d1);
        ekran2.setText(d3);
    }

}
