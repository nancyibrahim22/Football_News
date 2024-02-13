package com.example.myapplication2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ClubHelperClass extends SQLiteOpenHelper {
    public static String dataBaseName="ClubsDataBase";
    public String Egyptian= "create table Egyptianclubs" +
            "(team_ID integer primary key not null, Rank integer not null,"+
            "Name text not null, MatchesPlayed integer not null, Win integer not null, Draw integer not null," +
            "Lose integer not null, Points integer not null);";
    
    
    
    
    private String PREMIER= "create table PREMIERclubs" +
            "(team_ID integer primary key not null, Rank integer not null,"+
            "Name text not null, MatchesPlayed integer not null, Win integer not null, Draw integer not null," +
            "Lose integer not null, Points integer not null);";
    
    
    
    
    
    public String SPAINISH= "create table SPAINISHclubs" +
            "(team_ID integer primary key not null, Rank integer not null,"+
            "Name text not null, MatchesPlayed integer not null, Win integer not null, Draw integer not null," +
            "Lose integer not null, Points integer not null);";
    
    public String egy_team_players = "create table egyTeamPlayers"+
            "(player_id integer primary key not null ,"+
            "player_name text not null, "+
            "team_ID integer,foreign key(team_ID) references Egyptianclubs(team_ID));";
    
    /*public String pl_team_players = "create table plTeamPlayers"+
            "(player_id integer primary key not null ,"+
            "player_name text not null, "+
            "team_ID integer,foreign key(team_ID) references PREMIERclubs(team_ID));";
    
    public String sp_team_players = "create table spTeamPlayers"+
            "(player_id integer primary key not null ,"+
            "player_name text not null, "+
            "team_ID integer,foreign key(team_ID) references SPAINISHclubs(team_ID));";*/
    
    public SQLiteDatabase db;
    public ClubHelperClass(Context context){
        super(context,dataBaseName,null,4);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Egyptian);
        db.execSQL("insert into Egyptianclubs(team_ID,Rank,Name,MatchesPlayed,Win,Draw,Lose,Points)"+
                "values (101,1,'AL AHLY',30,23,3,4,72)");
        db.execSQL("insert into Egyptianclubs(team_ID,Rank,Name,MatchesPlayed,Win,Draw,Lose,Points)"+
                "values (102,2,'ZAMALEK',30,20,5,5,65)");
        db.execSQL("insert into Egyptianclubs(team_ID,Rank,Name,MatchesPlayed,Win,Draw,Lose,Points)"+
                "values (103,3,'PYRAMIDS',30,18,8,4,62)");
        db.execSQL("insert into Egyptianclubs(team_ID,Rank,Name,MatchesPlayed,Win,Draw,Lose,Points)"+
                "values (104,4,'AL MASRY',30,8,9,13,33)");
        db.execSQL("insert into Egyptianclubs(team_ID,Rank,Name,MatchesPlayed,Win,Draw,Lose,Points)"+
                "values (105,5,'ISMAILY',30,6,12,12,30)");
        db.execSQL("insert into Egyptianclubs(team_ID,Rank,Name,MatchesPlayed,Win,Draw,Lose,Points)"+
                "values (106,6,'SMOUHA',30,7,7,16,28)");
        
        
        db.execSQL(PREMIER);
        db.execSQL("insert into PREMIERclubs(team_ID,Rank,Name,MatchesPlayed,Win,Draw,Lose,Points)"+
                "values (201,1,'MAN CITY',37,28,6,3,90)");
        db.execSQL("insert into PREMIERclubs(team_ID,Rank,Name,MatchesPlayed,Win,Draw,Lose,Points)"+
                "values (202,2,'LIVERPOOL',37,27,8,2,89)");
        db.execSQL("insert into PREMIERclubs(team_ID,Rank,Name,MatchesPlayed,Win,Draw,Lose,Points)"+
                "values (203,3,'CHEALSEA',37,21,11,5,74)");
        db.execSQL("insert into PREMIERclubs(team_ID,Rank,Name,MatchesPlayed,Win,Draw,Lose,Points)"+
                "values (204,4,'TOTTENHAM',37,21,5,11,68)");
        db.execSQL("insert into PREMIERclubs(team_ID,Rank,Name,MatchesPlayed,Win,Draw,Lose,Points)"+
                "values (205,5,'ARSENAL',37,22,2,13,68)");
        db.execSQL("insert into PREMIERclubs(team_ID,Rank,Name,MatchesPlayed,Win,Draw,Lose,Points)"+
                "values (206,6,'MAN UNITED',37,16,10,12,58)");
        
        
        db.execSQL(SPAINISH);
        db.execSQL("insert into SPAINISHclubs(team_ID,Rank,Name,MatchesPlayed,Win,Draw,Lose,Points)"+
                "values (301,1,'REAL MADRID',15,12,2,1,38)");
        db.execSQL("insert into SPAINISHclubs(team_ID,Rank,Name,MatchesPlayed,Win,Draw,Lose,Points)"+
                "values (302,2,'BARCELONA',15,10,3,2,33)");
        db.execSQL("insert into SPAINISHclubs(team_ID,Rank,Name,MatchesPlayed,Win,Draw,Lose,Points)"+
                "values (303,3,'ATLETICO MADRID',15,8,4,3,28)");
        db.execSQL("insert into SPAINISHclubs(team_ID,Rank,Name,MatchesPlayed,Win,Draw,Lose,Points)"+
                "values (304,4,'SEVILLA',15,9,1,5,28)");
        db.execSQL("insert into SPAINISHclubs(team_ID,Rank,Name,MatchesPlayed,Win,Draw,Lose,Points)"+
                "values (305,5,'REAL BETIS',15,7,5,3,26)");
        db.execSQL("insert into SPAINISHclubs(team_ID,Rank,Name,MatchesPlayed,Win,Draw,Lose,Points)"+
                "values (306,6,'VALENCIA',15,3,7,5,16)");
        
        
        
        db.execSQL(egy_team_players);
        db.execSQL("insert into egyTeamPlayers(team_ID,player_id,player_name)"+
                "values(101,10101,'Mohamed el-Shennawy')");
        db.execSQL("insert into egyTeamPlayers(team_ID,player_id,player_name)"+
                "values(101,10102,'Amr el-Solia')");
        db.execSQL("insert into egyTeamPlayers(team_ID,player_id,player_name)"+
                "values(101,10103,'Alio Diang')");
        db.execSQL("insert into egyTeamPlayers(team_ID,player_id,player_name)"+
                "values(101,10104,'Mohamed Sherif')");
        db.execSQL("insert into egyTeamPlayers(team_ID,player_id,player_name)"+
                "values(101,10105,'Magdy Afsha')");
        db.execSQL("insert into egyTeamPlayers(team_ID,player_id,player_name)"+
                "values(101,10106,'Ayman Ashraf')");
        db.execSQL("insert into egyTeamPlayers(team_ID,player_id,player_name)"+
                "values(101,10107,'Yasser Ibrahim')");
        db.execSQL("insert into egyTeamPlayers(team_ID,player_id,player_name)"+
                "values(101,10108,'Ziad Tarek')");
        db.execSQL("insert into egyTeamPlayers(team_ID,player_id,player_name)"+
                "values(101,10109,'Salah Mohsen')");
        db.execSQL("insert into egyTeamPlayers(team_ID,player_id,player_name)"+
                "values(101,10110,'Ali Maloul')");
        db.execSQL("insert into egyTeamPlayers(team_ID,player_id,player_name)"+
                "values(101,10111,'Akram Tawfik')");
        
        
        db.execSQL("insert into egyTeamPlayers(team_ID,player_id,player_name)"+
                "values(102,10201,'Ahmed Sayed')");
        db.execSQL("insert into egyTeamPlayers(team_ID,player_id,player_name)"+
                "values(102,10202,'Shikabala')");
        db.execSQL("insert into egyTeamPlayers(team_ID,player_id,player_name)"+
                "values(102,10203,'Abou Gabal')");
        db.execSQL("insert into egyTeamPlayers(team_ID,player_id,player_name)"+
                "values(102,10204,'Emam Ashour')");
        db.execSQL("insert into egyTeamPlayers(team_ID,player_id,player_name)"+
                "values(102,10205,'Mahmoud Hamdy')");
        db.execSQL("insert into egyTeamPlayers(team_ID,player_id,player_name)"+
                "values(102,10206,'Mohamed Ashraf')");
        db.execSQL("insert into egyTeamPlayers(team_ID,player_id,player_name)"+
                "values(102,10207,'Mahmoud Alaa')");
        db.execSQL("insert into egyTeamPlayers(team_ID,player_id,player_name)"+
                "values(102,10208,'Ayman Hefny')");
        db.execSQL("insert into egyTeamPlayers(team_ID,player_id,player_name)"+
                "values(102,10209,'Ahmed Fattoh')");
        db.execSQL("insert into egyTeamPlayers(team_ID,player_id,player_name)"+
                "values(102,10210,'Seif Farouk')");
        db.execSQL("insert into egyTeamPlayers(team_ID,player_id,player_name)"+
                "values(102,10211,'Razack Cisse')");
        
        
        
        /* db.execSQL(pl_team_players);
        db.execSQL("insert into plTeamPlayers(team_ID,player_id,player_name)"+
                "values(201,20101,'haland')");
        db.execSQL("insert into plTeamPlayers(team_ID,player_id,player_name)"+
                "values(201,20102,'ederson')");
        db.execSQL("insert into plTeamPlayers(team_ID,player_id,player_name)"+
                "values(201,20103,'Walker')");
        db.execSQL("insert into plTeamPlayers(team_ID,player_id,player_name)"+
                "values(201,20104,'cancelo')");
        db.execSQL("insert into plTeamPlayers(team_ID,player_id,player_name)"+
                "values(201,20105,'Laporte')");
        db.execSQL("insert into plTeamPlayers(team_ID,player_id,player_name)"+
                "values(201,20106,'Stones')");
        db.execSQL("insert into plTeamPlayers(team_ID,player_id,player_name)"+
                "values(201,20107,'Kevin De Bruyne')");
        db.execSQL("insert into plTeamPlayers(team_ID,player_id,player_name)"+
                "values(201,20108,'Gundogan')");
        db.execSQL("insert into plTeamPlayers(team_ID,player_id,player_name)"+
                "values(201,20109,'Bernardo Silva')");
        db.execSQL("insert into plTeamPlayers(team_ID,player_id,player_name)"+
                "values(201,20110,'Foden')");
        db.execSQL("insert into plTeamPlayers(team_ID,player_id,player_name)"+
                "values(201,201011,'Mehrez')");*/
        
        
        /*db.execSQL("insert into plTeamPlayers(team_ID,player_id,player_name)"+
                "values(202,20201,'Alison')");
        db.execSQL("insert into plTeamPlayers(team_ID,player_id,player_name)"+
                "values(202,20202,'Vann Dijk')");
        db.execSQL("insert into plTeamPlayers(team_ID,player_id,player_name)"+
                "values(202,20203,'Robertson')");
        db.execSQL("insert into plTeamPlayers(team_ID,player_id,player_name)"+
                "values(202,20204,'Arnold')");
        db.execSQL("insert into plTeamPlayers(team_ID,player_id,player_name)"+
                "values(202,20205,'Matip')");
        db.execSQL("insert into plTeamPlayers(team_ID,player_id,player_name)"+
                "values(202,20206,'Thiago')");
        db.execSQL("insert into plTeamPlayers(team_ID,player_id,player_name)"+
                "values(202,20207,'Napy Keita')");
        db.execSQL("insert into plTeamPlayers(team_ID,player_id,player_name)"+
                "values(202,20208,'Jota')");
        db.execSQL("insert into plTeamPlayers(team_ID,player_id,player_name)"+
                "values(202,20209,'Luis Diaz')");
        db.execSQL("insert into plTeamPlayers(team_ID,player_id,player_name)"+
                "values(202,20210,'Darwin Nunez')");
        db.execSQL("insert into plTeamPlayers(team_ID,player_id,player_name)"+
                "values(202,20211,'Mohamed Salah')");*/
        
        
        
        /*db.execSQL(sp_team_players);
        db.execSQL("insert into sp_team_players(team_ID,player_id,player_name)"+
                "values(301,30101,'Courtois')");
        db.execSQL("insert into sp_team_players(team_ID,player_id,player_name)"+
                "values(301,30102,'Lunin')");
        db.execSQL("insert into sp_team_players(team_ID,player_id,player_name)"+
                "values(301,30103,'Carvajal')");
        db.execSQL("insert into sp_team_players(team_ID,player_id,player_name)"+
                "values(301,30104,'Militão')");
        db.execSQL("insert into sp_team_players(team_ID,player_id,player_name)"+
                "values(301,30105,'Alaba')");
        db.execSQL("insert into sp_team_players(team_ID,player_id,player_name)"+
                "values(301,30106,'Rodrygo')");
        db.execSQL("insert into sp_team_players(team_ID,player_id,player_name)"+
                "values(301,30107,'Luka Jović')");
        db.execSQL("insert into sp_team_players(team_ID,player_id,player_name)"+
                "values(301,30108,'Federico Valverde')");
        db.execSQL("insert into sp_team_players(team_ID,player_id,player_name)"+
                "values(301,30109,'Vinícius Júnior')");
        db.execSQL("insert into sp_team_players(team_ID,player_id,player_name)"+
                "values(301,30110,'Dani Ceballos')");
        db.execSQL("insert into sp_team_players(team_ID,player_id,player_name)"+
                "values(301,30111,'Mariano Díaz')");
        
        db.execSQL("insert into sp_team_players(team_ID,player_id,player_name)"+
                "values(302,30201,' Lionel Messi')");
        db.execSQL("insert into sp_team_players(team_ID,player_id,player_name)"+
                "values(302,30202,'Andrés Iniesta')");
        db.execSQL("insert into sp_team_players(team_ID,player_id,player_name)"+
                "values(302,30203,'Xavi')");
        db.execSQL("insert into sp_team_players(team_ID,player_id,player_name)"+
                "values(302,30204,' Carles Puyol')");
        db.execSQL("insert into sp_team_players(team_ID,player_id,player_name)"+
                "values(302,30205,'Luis Enrique')");
        db.execSQL("insert into sp_team_players(team_ID,player_id,player_name)"+
                "values(302,30206,'Sergi Barjuán')");
        db.execSQL("insert into sp_team_players(team_ID,player_id,player_name)"+
                "values(302,30207,' Pep Guardiola')");
        db.execSQL("insert into sp_team_players(team_ID,player_id,player_name)"+
                "values(302,30208,'Gheorghe Popescu')");
        db.execSQL("insert into sp_team_players(team_ID,player_id,player_name)"+
                "values(302,30209,'José Mari Bakero')");
        db.execSQL("insert into sp_team_players(team_ID,player_id,player_name)"+
                "values(302,30210,'Tente Sánchez')");
        db.execSQL("insert into sp_team_players(team_ID,player_id,player_name)"+
                "values(302,30211,'Sergio Busquets')");*/
        
    }
    
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        
        db.execSQL("Drop table if exists Egyptianclubs");
        db.execSQL("Drop table if exists PREMIERclubs");
        db.execSQL("Drop table if exists SPAINISHclubs");
        db.execSQL("Drop table if exists egyTeamPlayers");
        //db.execSQL("Drop table if exists plTeamPlayers");
        //db.execSQL("Drop table if exists spTeamPlayers");
        onCreate(db);
    }
    
    public Cursor clubsData(){
        db= getReadableDatabase();
        String[] clubDetails= {"Rank","Name", "MatchesPlayed", "Win", "Draw", "Lose", "Points"};
        Cursor cursor = db.query("Egyptianclubs", clubDetails, null,null, null, null, null);
        if(cursor !=null) {
            cursor.moveToFirst();
        }
        db.close();
        return cursor;
    }
    public Cursor getPlayers(){
        db=getReadableDatabase();
        String[] playersDetails = {"player_name"};
        Cursor c=db.query("egyTeamPlayers", playersDetails,null,null,null,null,null);
        if(c !=null) {
            c.moveToFirst();
        }
        db.close();
        return c;
        
    }
}
