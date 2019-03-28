package com.virtusai.clickhouseclient.produer;

import com.virtusai.clickhouseclient.ClickHouseClient;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.math3.random.RandomDataGenerator;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import static com.virtusai.clickhouseclient.utils.DataUtils.*;

public class ProduerData {

    public static final String allChar = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String letterChar = "abcdefghijkmnopqrstuvwxyzABCDEFGHJKLMNOPQRSTUVWXYZ";
    public static final String numberChar = "023456789";
    public static void main(String[] args) throws InterruptedException {


        int fieldNumber = 420;

        String fieldsType = "String, String, String, String, String, String, String, String, String, " +
                "String, String, String, String, String, String, String, String, String, String, String, String, " +
                "String, String, String, String, String, String, String, String, String, String, String, String, " +
                "String, String, String, String, String, String, String, String, String, String, String, String, " +
                "String, String, String, String, String, String, String, String, String, String, String, String, " +
                "String, String, String, String, String, String, String, String, String, String, String, String, " +
                "String, String, String, String, String, String, String, String, String, String, String, String, " +
                "String, String, String, String, String, String, String, String, String, String, String, String, " +
                "String, String, String, String, String, String, String, String, String, String, String, String, " +
                "String, String, String, String, String, String, String, String, String, String, String, String, " +
                "String, String, String, String, String, String, String, String, String, String, String, String, " +
                "String, String, String, String, String, String, String, String, String, String, String, String, " +
                "String, String, String, String, String, String, String, String, String, String, String, String, " +
                "String, String, String, String, String, String, String, String, String, String, String, String, " +
                "String, String, String, String, String, String, String, String, String, String, String, String, " +
                "String, String, String, String, String, String, String, String, String, String, String, String, " +
                "String, String, String, String, String, String, String, String, String, String, String, String, " +
                "String, String, String, String, String, String, String, String, String, String, String, String, " +
                "String, String, String, String, String, String, String, String, String, String, String, String, " +
                "String, String, String, String, String, String, String, String, String, String, String, String, " +
                "String, String, String, String, String, String, String, String, String, String, String, String, " +
                "String, String, String, String, String, String, String, String, String, String, Int, Int, Int, " +
                "Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, " +
                "Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, " +
                "Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, " +
                "Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, " +
                "Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, " +
                "Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, " +
                "Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, " +
                "Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Long, Long, Long, Long, " +
                "Long, Double, Double";
        String[] partner= {"YNYDZX","YNYDHW","JS_CMCC_CP","JS_CMCC_CP_ZX","HNYD","SD_CMCC_JN","LNYD","SAXYD"};
        // Initialize client (endpoint, username, password)
        ClickHouseClient client = new ClickHouseClient("http://10.10.121.213:8123", "default", "");

        String table=args[0];
        Long item=Long.parseLong(args[1]);
        System.out.println(item);
// Insert data
        List<Object[]> rows = new ArrayList<Object[]>();

//        rows.add(generateRow(1,fieldsType,fieldNumber,partner));
//        rows.add(generateRow());
        long start = System.currentTimeMillis();
        for (int i=0;i<item;i++){
            long start1 = System.currentTimeMillis();
            rows.add(generateRow(i,fieldsType,fieldNumber,partner));
            long end1 = System.currentTimeMillis();
           // System.out.println("一条生成的时间"+(end1-start1));

        }
        long end = System.currentTimeMillis();
        System.out.println("生成数据花费时长："+(end-start));
        System.out.println(rows.size());
        System.out.println(rows.size());
        long startInsertTime = System.currentTimeMillis();
        //client.post("INSERT INTO "+table, rows);
        long endInsertTime = System.currentTimeMillis();
        System.out.println("插入时长："+(endInsertTime-startInsertTime));
//        Thread.sleep(2000);
        client.close();
    }

    public static Object[] generateRow(int id,String fieldsType, int fieldNumber,String[] partner) {

         Object[] data=new Object[fieldNumber];
        data[0]=id;
        data[1]=partner[new Random().nextInt(8)];
        data[2]=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(nextTime());
        data[3]=getRandomIp();
        String[] fieldsTypeList = fieldsType.split(",");
        for(int i=4;i<fieldNumber;i++){


//            switch(fieldsTypeList[i-4].trim()){
////                case "String":data[i]="abcdefg";
//                case "String":data[i]=RandomStringUtils.randomAlphanumeric(new Random().nextInt(12)+1);
//                    break;
//                case "Int":data[i]= ThreadLocalRandom.current().nextInt(10000);
//                    break;
//                case "Long":data[i]=ThreadLocalRandom.current().nextLong(1000000);
//                    break;
//                case "Double":data[i]= ThreadLocalRandom.current().nextDouble(500);
//                    break;
//                default:
//                    data[i]=1;
//                    break;
//            }

            switch(fieldsTypeList[i-4].trim()){
//                case "String":data[i]= generateString(new Random().nextInt(12));
                case "String":data[i]= RandomStringUtils.randomAlphanumeric(new Random().nextInt(12));
                    break;
                case "Int":data[i]=new Double( Math.random() * 10000).intValue();
                    break;
                case "Long":data[i]=new Double( Math.random() * 1000000).longValue();
                    break;
                case "Double":data[i]= (Math.random()*100);
                    break;
                default:
                    data[i]=1;
                    break;
            }
//            switch(fieldsTypeList[i-4]){
//                case "Int":data[i]=new Random().nextInt();
//                    break;
//                case "Long":data[i]=new Random().longs();
//                    break;
//                case "Short":data[i]=1;
//                    break;
//                case "Byte":data[i]=1;
//                    break;
//                case "String":data[i]= RandomStringUtils.randomAlphanumeric(new Random().nextInt(100));
//                    break;
//                case "Float":data[i]=1.0;
//                    break;
//                case "Double":data[i]=new Random().nextDouble();
//                    break;
//                default:
//                    data[i]=1;
//                    break;
//            }

        }

        return data;
    }

    public static String generateString(int length){  //参数为返回随机数的长度
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(allChar.charAt(random.nextInt(allChar.length())));
        }
        return sb.toString();
    }
}
