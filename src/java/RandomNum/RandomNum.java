package RandomNum;

import java.io.*;
import java.util.Random;

/**
 * Created by TianFeng on 2018/11/12.
 */
public class RandomNum {
    public static int RamdomP(int min,int max){
        int a = max-min+1;
        return a;
    }
    public static void main(String[] args) {
        Random random = new Random();
        File csv = new File("F:/mysqlNum1.csv");

        for (int i=0;i<300;i++){
            int rannum1 = random.nextInt(RamdomP(8,256))+8;  //key_buffer_size  MB
            int rannum2 = random.nextInt(RamdomP(128,16384))+128;  //record_buffer_size  KB
            int rannum3 = random.nextInt(RamdomP(2,16))+2;          //read_rnd_buffer_size  MB
            int rannum4 = random.nextInt(RamdomP(2,16))+2;  //sort_buffer_size   MB
            int rannum5 = random.nextInt(RamdomP(2,16))+2;  //join_buffer_size   MB
            int rannum6 = random.nextInt(RamdomP(256,384))+256;  // table_cache  MB
            int rannum7 = random.nextInt(RamdomP(80,110))+80;  //thread_cache_size
            int rannum8 = random.nextInt(RamdomP(1,3))+1;   //innodb_buffer_pool_size   GB
            int rannum9 = random.nextInt(RamdomP(1,8))+1;    //innodb_log_buffer_size  MB
            int rannum10 = random.nextInt(RamdomP(64,256))+64;  //tmp_table_size  MB
            int rannum11 = random.nextInt(RamdomP(50,512))+50;  //back_log
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(csv, true));
                bw.write(rannum1+","+rannum2+","+rannum3+","+rannum4+","+rannum5+","+rannum6+","+rannum7+","+rannum8+","+rannum9+","+rannum10+","+rannum11);
                bw.newLine();
                bw.close();
            }catch (FileNotFoundException e){
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
