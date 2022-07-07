package dev.nyakuar.twitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }
    fun displayContacts(){

        var twitter=Twitter("Rehema Ephraim","@ray_nanda 2d","AkiraChix graduation class of 2022 ","33","34","87","33","44","ss","sawa","34","Akirachix class of 2020","678")
        var twitter1=Twitter("Sara John","@sara_john123  1hr","Akira ","33","56","87","33","44","ss","sawa","45","Tanzania has more than 100 tribes and more than 34 regions and many national parks","234")
        var twitter2=Twitter("Martha Saimon","@martha_cute","AkiraChix graduation class of 2022","277","22","33","200","44","ss","sawa","60","Jacinta Wangare is able to call her supervisor easily for a long duration","89")
        var twitter3=Twitter("Ephraim Nanda","@enanda 3w","AkiraChix graduation class of 2022","777","344","900","2k","44","ss","sawa","66k","Form six results most of the students gets the grade to join University","667k")
        var twitter4=Twitter("Bertha Bariko","@B_Bariko  24mins","AkiraChix graduation class of 2022","33","77","87","33","44","ss","sawa","72","my name is Bertha Bariko from Tanzania ","56")
        var twitter5=Twitter("Rehema Adam","@a_rehema 1d","AkiraChix graduation class of 2022","33","90","87","33","44","ss","sawa","33","@code,learn and lough","88k")
        var twitter6=Twitter("Anna samwel","@anna_s 1d","AkiraChix graduation class of 2022","33","90","87","33","44","ss","sawa","39","I love eating and playing football","188")
        var twitter7=Twitter("Amon Nanda","@a_Amon 4hrs","AkiraChix graduation class of 2022","33","90","87","33","44","ss","sawa","33","@we love coding and eating","88")
        var twitter8=Twitter("Ephy Phiona","@ephy_phy 3hrs","AkiraChix graduation class of 2022","33","90","87","33","44","ss","sawa","33","@I love android development because I can create something which can be used by the community","88k")
        var twitter9=Twitter("Happines JOhn","@a_Happy 5hrs","AkiraChix graduation class of 2022","33","90","87","33","44","ss","sawa","33","@code,learn and lough","18k")
        var twitter10=Twitter("Innocent George","@G_inno 7hrs","AkiraChix graduation class of 2022","33","90","87","33","44","ss","sawa","33","@live don't forget to eat and laugh","8")





        var twitterList= listOf(twitter,twitter1,twitter2,twitter3,twitter4,twitter5,twitter6,twitter7,twitter8,twitter9,twitter10)
        var twitterAdapter=TweeterRvAdapter(twitterList)
        binding.rvTwitter.layoutManager=LinearLayoutManager(this)
        binding.rvTwitter.adapter=twitterAdapter
    }
}