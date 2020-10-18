package javaTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;

public class Java_Gson_Dom4j_Test {
	public static void main(String[] args){
		/*開關*/
	    boolean mode1 = false, mode2 = false, mode3 = false, mode4 = false, mode5 = false, mode6 = false;

		/*建立Scanner、Gson物件*/
        Scanner scan = new Scanner(System.in);
        Gson gson0 = new Gson();

        String banner = "請選擇欲執行的功能：";
        banner = banner + System.lineSeparator() + "輸入「1」可在工作目錄生成csv檔案、json檔案與xml檔案";
        /*如果ResultCSV存在，才能執行讀取CSV檔案的功能*/
        banner = (File_Conf.checkResultCSV()) ? banner + System.lineSeparator() + "輸入「2」可讀取位於工作目錄的csv檔案，並產生json檔與xml檔案" : banner;
        /*如果ResultJSON存在，才能執行讀取JSON檔案的功能*/
        banner = (File_Conf.checkResultJSON()) ? banner + System.lineSeparator() + "輸入「3」可讀取位於工作目錄的json檔案，並產生cvs檔、xml檔與調整格式的json檔" : banner;
        /*如果ResultXML存在，才能執行讀取XML檔案的功能*/
        banner = (File_Conf.checkResultXML()) ? banner + System.lineSeparator() + "輸入「4」可讀取位於工作目錄的xml檔案，並產生cvs檔、json檔與調整格式的xml檔" : banner;
        /*如果ResultJSON13存在，才能執行讀取調整後的JSON檔案的功能*/
        banner = (File_Conf.checkResultJSON13()) ? banner + System.lineSeparator() + "輸入「5」可讀取位於工作目錄的另一種格式的json檔案" : banner;
        /*如果ResultXML24存在，才能執行讀取調整後的XML檔案的功能*/
        banner = (File_Conf.checkResultXML24()) ? banner + System.lineSeparator() + "輸入「6」可讀取位於工作目錄的另一種格式的xml檔案" : banner;
        banner = banner + System.lineSeparator() + "輸入「exit」可離開本程式";

        while(true) {
            System.out.println(banner);

            String option = scan.nextLine();
            if(option.equals("1")){
                mode1 = true;
            }
            else if(option.equals("2")){
                mode2 = true;
            }
            else if(option.equals("3")){
                mode3 = true;
            }
            else if(option.equals("4")){
                mode4 = true;
            }
            else if(option.equals("5")){
                mode5 = true;
            }
            else if(option.equals("6")){
                mode6 = true;
            }
            else if(option.toLowerCase().equals("exit")){
                break;
            }
            else{
                System.out.println(System.lineSeparator() + "無效的輸入值！請重新輸入一次" + System.lineSeparator());
            }

            if(mode1){
                /*宣告存放資料的陣列*/
                List<HDD_All> hddFullList = new ArrayList<>();

                /*開始放入資料*/
                hddFullList.add(new HDD_All(10001, "WD5000LPCX", "藍標", 2.5, "500 GB", "傳統硬碟", 5400, 16, "CMR", "WD", "筆記型電腦", 3, "可購得"));
                hddFullList.add(new HDD_All(10002, "ST500LM030", "新梭魚", 2.5, "500 GB", "傳統硬碟", 5400, 128, "SMR", "Seagate", "筆記型電腦", 2, "可購得"));
                hddFullList.add(new HDD_All(10003, "MQ01ACF050", "筆電型", 2.5, "500 GB", "傳統硬碟", 7200, 16, "CMR", "Toshiba", "筆記型電腦", 2, "可購得"));
                hddFullList.add(new HDD_All(10004, "WD5000LPLX", "黑標", 2.5, "500 GB", "傳統硬碟", 7200, 32, "CMR", "WD", "筆記型電腦", 5, "可購得"));
                hddFullList.add(new HDD_All(10005, "ST500LM034", "新梭魚 Pro", 2.5, "500 GB", "傳統硬碟", 7200, 128, "SMR", "Seagate", "筆記型電腦", 5, "可購得"));
                hddFullList.add(new HDD_All(10006, "ST500LX025", "火梭魚", 2.5, "500 GB", "固態混合硬碟", 5400, 128, "SMR", "Seagate", "筆記型電腦", 5, "可購得"));

                hddFullList.add(new HDD_All(10101, "WD10SPZX", "藍標", 2.5, "1 TB", "傳統硬碟", 5400, 128, "SMR", "WD", "筆記型電腦", 3, "可購得"));
                hddFullList.add(new HDD_All(10102, "ST1000LM048", "新梭魚", 2.5, "1 TB", "傳統硬碟", 5400, 128, "SMR", "Seagate", "筆記型電腦", 2, "可購得"));
                hddFullList.add(new HDD_All(10103, "MQ04ABF100", "筆電型", 2.5, "1 TB", "傳統硬碟", 5400, 128, "SMR", "Toshiba", "筆記型電腦", 2, "可購得"));
                hddFullList.add(new HDD_All(10104, "WD10J31X", "藍標 SSHD", 2.5, "1 TB", "固態混合硬碟", 5400, 64, "CMR", "WD", "筆記型電腦", 3, "已停產"));
                hddFullList.add(new HDD_All(10105, "WD10JPLX", "黑標", 2.5, "1 TB", "傳統硬碟", 7200, 32, "CMR", "WD", "筆記型電腦", 5, "已停產"));
                hddFullList.add(new HDD_All(10106, "WD10SPSX", "黑標", 2.5, "1 TB", "傳統硬碟", 7200, 64, "SMR", "WD", "筆記型電腦", 5, "可購得"));
                hddFullList.add(new HDD_All(10107, "ST1000LM049", "新梭魚 Pro", 2.5, "1 TB", "傳統硬碟", 7200, 128, "SMR", "Seagate", "筆記型電腦", 5, "可購得"));
                hddFullList.add(new HDD_All(10108, "ST1000LX015", "火梭魚", 2.5, "1 TB", "固態混合硬碟", 5400, 128, "SMR", "Seagate", "筆記型電腦", 5, "可購得"));
                hddFullList.add(new HDD_All(10109, "WD1001X06XDTL", "黑標 2 Dual Drive", 2.5, "128 GB + 1 TB", "混和架構硬碟", 5400, 8, "CMR", "WD", "筆記型電腦", 5, "已停產"));

                hddFullList.add(new HDD_All(10201, "WD20SPZX", "藍標", 2.5, "2 TB", "傳統硬碟", 5400, 128, "SMR", "WD", "筆記型電腦", 3, "可購得"));
                hddFullList.add(new HDD_All(10202, "ST2000LM015", "新梭魚", 2.5, "2 TB", "傳統硬碟", 5400, 128, "SMR", "Seagate", "筆記型電腦", 2, "可購得"));
                hddFullList.add(new HDD_All(10203, "MQ04ABD200", "筆電型", 2.5, "2 TB", "傳統硬碟", 5400, 128, "SMR", "Toshiba", "筆記型電腦", 2, "可購得"));
                hddFullList.add(new HDD_All(10204, "ST2000LX001", "火梭魚", 2.5, "2 TB", "固態混合硬碟", 5400, 128, "SMR", "Seagate", "筆記型電腦", 5, "可購得"));

                hddFullList.add(new HDD_All(20001, "WD5000AZLX", "藍標", 3.5, "500 GB", "傳統硬碟", 7200, 32, "CMR", "WD", "桌上型電腦", 3, "可購得"));
                hddFullList.add(new HDD_All(20002, "ST500DM009", "新梭魚", 3.5, "500 GB", "傳統硬碟", 7200, 32, "CMR", "Seagate", "桌上型電腦", 3, "可購得"));
                hddFullList.add(new HDD_All(20003, "DT01ACA050", "桌上型", 3.5, "500 GB", "傳統硬碟", 7200, 32, "CMR", "Toshiba", "桌上型電腦", 3, "可購得"));
                hddFullList.add(new HDD_All(20004, "WD5003AZEX", "黑標", 3.5, "500 GB", "傳統硬碟", 7200, 64, "CMR", "WD", "桌上型電腦", 5, "可購得"));
                hddFullList.add(new HDD_All(20005, "WD5000HHTZ", "迅猛龍", 3.5, "500 GB", "傳統硬碟", 10000, 64, "CMR", "WD", "桌上型電腦", 5, "已停產"));

                hddFullList.add(new HDD_All(20101, "WD10EZEX", "藍標", 3.5, "1 TB", "傳統硬碟", 7200, 64, "CMR", "WD", "桌上型電腦", 3, "可購得"));
                hddFullList.add(new HDD_All(20102, "ST1000DM010", "新梭魚", 3.5, "1 TB", "傳統硬碟", 7200, 64, "CMR", "Seagate", "桌上型電腦", 3, "可購得"));
                hddFullList.add(new HDD_All(20103, "DT01ACA100", "桌上型", 3.5, "1 TB", "傳統硬碟", 7200, 32, "CMR", "Toshiba", "桌上型電腦", 3, "可購得"));
                hddFullList.add(new HDD_All(20104, "WD1003FZEX", "黑標", 3.5, "1 TB", "傳統硬碟", 7200, 64, "CMR", "WD", "桌上型電腦", 5, "可購得"));
                hddFullList.add(new HDD_All(20105, "ST1000DX002", "火梭魚", 3.5, "1 TB", "固態混合硬碟", 7200, 64, "CMR", "Seagate", "桌上型電腦", 5, "可購得"));
                hddFullList.add(new HDD_All(20106, "WD1000DHTZ", "迅猛龍", 3.5, "1 TB", "傳統硬碟", 10000, 64, "CMR", "WD", "桌上型電腦", 5, "已停產"));

                hddFullList.add(new HDD_All(20201, "WD20EZAZ", "藍標", 3.5, "2 TB", "傳統硬碟", 5400, 256, "SMR", "WD", "桌上型電腦", 3, "可購得"));
                hddFullList.add(new HDD_All(20202, "ST2000DM008", "新梭魚", 3.5, "2 TB", "傳統硬碟", 7200, 256, "SMR", "Seagate", "桌上型電腦", 3, "可購得"));
                hddFullList.add(new HDD_All(20203, "DT01ACA200", "桌上型", 3.5, "2 TB", "傳統硬碟", 7200, 64, "CMR", "Toshiba", "桌上型電腦", 3, "可購得"));
                hddFullList.add(new HDD_All(20204, "WD2003FZEX", "黑標", 3.5, "2 TB", "傳統硬碟", 7200, 64, "CMR", "WD", "桌上型電腦", 5, "可購得"));
                hddFullList.add(new HDD_All(20205, "ST2000DX002", "火梭魚", 3.5, "2 TB", "固態混合硬碟", 7200, 64, "CMR", "Seagate", "桌上型電腦", 5, "可購得"));
                hddFullList.add(new HDD_All(20206, "ST2000DM009", "新梭魚 Pro", 3.5, "2 TB", "傳統硬碟", 7200, 128, "CMR", "Seagate", "桌上型電腦", 5, "可購得"));
                hddFullList.add(new HDD_All(20207, "WD30EZRZ", "藍標", 3.5, "3 TB", "傳統硬碟", 5400, 64, "CMR", "WD", "桌上型電腦", 3, "可購得"));
                hddFullList.add(new HDD_All(20208, "ST3000DM007", "新梭魚", 3.5, "3 TB", "傳統硬碟", 7200, 256, "SMR", "Seagate", "桌上型電腦", 3, "可購得"));
                hddFullList.add(new HDD_All(20209, "DT01ACA300", "桌上型", 3.5, "3 TB", "傳統硬碟", 7200, 128, "CMR", "Toshiba", "桌上型電腦", 3, "可購得"));

                hddFullList.add(new HDD_All(20301, "WD40EZRZ", "藍標", 3.5, "4 TB", "傳統硬碟", 5400, 64, "CMR", "WD", "桌上型電腦", 3, "可購得"));
                hddFullList.add(new HDD_All(20302, "ST4000DM004", "新梭魚", 3.5, "4 TB", "傳統硬碟", 5400, 256, "SMR", "Seagate", "桌上型電腦", 3, "可購得"));
                hddFullList.add(new HDD_All(20303, "MD04ACA400", "桌上型", 3.5, "4 TB", "傳統硬碟", 7200, 128, "CMR", "Toshiba", "桌上型電腦", 3, "可購得"));
                hddFullList.add(new HDD_All(20304, "WD40E31X", "藍標 SSHD", 3.5, "4 TB", "固態混和硬碟", 5400, 64, "CMR", "WD", "桌上型電腦", 3, "已停產"));
                hddFullList.add(new HDD_All(20305, "WD4005FZBX", "黑標", 3.5, "4 TB", "傳統硬碟", 7200, 256, "CMR", "WD", "桌上型電腦", 5, "可購得"));
                hddFullList.add(new HDD_All(20306, "ST4000DM006", "新梭魚 Pro", 3.5, "4 TB", "傳統硬碟", 7200, 128, "CMR", "Seagate", "桌上型電腦", 5, "可購得"));

                hddFullList.add(new HDD_All(20401, "WD60EZAZ", "藍標", 3.5, "6 TB", "傳統硬碟", 5400, 256, "SMR", "WD", "桌上型電腦", 3, "可購得"));
                hddFullList.add(new HDD_All(20402, "ST6000DM003", "新梭魚", 3.5, "6 TB", "傳統硬碟", 5400, 256, "SMR", "Seagate", "桌上型電腦", 3, "可購得"));
                hddFullList.add(new HDD_All(20403, "MD06ACA600", "桌上型", 3.5, "6 TB", "傳統硬碟", 7200, 256, "CMR", "Toshiba", "桌上型電腦", 3, "可購得"));
                hddFullList.add(new HDD_All(20404, "WD6003FZBX", "黑標", 3.5, "6 TB", "傳統硬碟", 7200, 256, "CMR", "WD", "桌上型電腦", 5, "可購得"));
                hddFullList.add(new HDD_All(20405, "ST6000DM004", "新梭魚 Pro", 3.5, "6 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "桌上型電腦", 5, "可購得"));

                hddFullList.add(new HDD_All(20501, "ST8000DM004", "新梭魚", 3.5, "8 TB", "傳統硬碟", 5400, 256, "SMR", "Seagate", "桌上型電腦", 3, "可購得"));
                hddFullList.add(new HDD_All(20502, "MD06ACA800", "桌上型", 3.5, "8 TB", "傳統硬碟", 7200, 256, "CMR", "Toshiba", "桌上型電腦", 3, "可購得"));
                hddFullList.add(new HDD_All(20503, "WD8001FZBX", "黑標", 3.5, "8 TB", "傳統硬碟", 7200, 256, "CMR", "WD", "桌上型電腦", 5, "可購得"));
                hddFullList.add(new HDD_All(20504, "ST8000DM0004", "新梭魚 Pro", 3.5, "8 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "桌上型電腦", 5, "可購得"));

                hddFullList.add(new HDD_All(20601, "MD06ACA10T", "桌上型", 3.5, "10 TB", "傳統硬碟", 7200, 256, "CMR", "Toshiba", "桌上型電腦", 3, "可購得"));
                hddFullList.add(new HDD_All(20602, "WD101FZBX", "黑標", 3.5, "10 TB", "傳統硬碟", 7200, 256, "CMR", "WD", "桌上型電腦", 5, "可購得"));
                hddFullList.add(new HDD_All(20603, "ST10000DM001", "新梭魚 Pro", 3.5, "10 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "桌上型電腦", 5, "可購得"));

                hddFullList.add(new HDD_All(20701, "ST12000DM001", "新梭魚 Pro", 3.5, "12 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "桌上型電腦", 5, "可購得"));

                hddFullList.add(new HDD_All(20801, "ST14000DM001", "新梭魚 Pro", 3.5, "14 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "桌上型電腦", 5, "可購得"));

                hddFullList.add(new HDD_All(30001, "WD1005FBYZ", "金標", 3.5, "1 TB", "傳統硬碟", 7200, 128, "CMR", "WD", "資料中心", 5, "可購得"));
                hddFullList.add(new HDD_All(30002, "ST1000NM008", "企業號 7E2", 3.5, "1 TB", "傳統硬碟", 7200, 128, "CMR", "Seagate", "資料中心", 5, "可購得"));
                hddFullList.add(new HDD_All(30003, "HUS722T1TALA604", "UltraStar DC HA210", 3.5, "1 TB", "傳統硬碟", 7200, 128, "CMR", "WD", "資料中心", 5, "可購得"));
                hddFullList.add(new HDD_All(30004, "MG04ACA100N", "企業碟", 3.5, "1 TB", "傳統硬碟", 7200, 128, "CMR", "Toshiba", "資料中心", 5, "可購得"));

                hddFullList.add(new HDD_All(30101, "WD2005FBYZ", "金標", 3.5, "2 TB", "傳統硬碟", 7200, 128, "CMR", "WD", "資料中心", 5, "可購得"));
                hddFullList.add(new HDD_All(30102, "ST2000NM008", "企業號 7E2", 3.5, "2 TB", "傳統硬碟", 7200, 128, "CMR", "Seagate", "資料中心", 5, "可購得"));
                hddFullList.add(new HDD_All(30103, "HUS722T2TALA604", "UltraStar DC HA210", 3.5, "2 TB", "傳統硬碟", 7200, 128, "CMR", "WD", "資料中心", 5, "可購得"));
                hddFullList.add(new HDD_All(30104, "MG04ACA200E", "企業碟", 3.5, "2 TB", "傳統硬碟", 7200, 128, "CMR", "Toshiba", "資料中心", 5, "可購得"));

                hddFullList.add(new HDD_All(30201, "ST3000NM000A", "企業號 7E8", 3.5, "3 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "資料中心", 5, "可購得"));
                hddFullList.add(new HDD_All(30202, "MG04ACA300E", "企業碟", 3.5, "3 TB", "傳統硬碟", 7200, 128, "CMR", "Toshiba", "資料中心", 5, "可購得"));
                hddFullList.add(new HDD_All(30203, "WD4003FRYZ", "金標", 3.5, "4 TB", "傳統硬碟", 7200, 256, "CMR", "WD", "資料中心", 5, "可購得"));
                hddFullList.add(new HDD_All(30204, "ST4000NM002A", "企業號 7E8", 3.5, "4 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "資料中心", 5, "可購得"));
                hddFullList.add(new HDD_All(30205, "HUS726T4TALA6L4", "UltraStar DC HC310", 3.5, "4 TB", "傳統硬碟", 7200, 256, "CMR", "WD", "資料中心", 5, "可購得"));
                hddFullList.add(new HDD_All(30206, "MG04ACA400E", "企業碟", 3.5, "4 TB", "傳統硬碟", 7200, 128, "CMR", "Toshiba", "資料中心", 5, "可購得"));

                hddFullList.add(new HDD_All(30301, "WD6003FRYZ", "金標", 3.5, "6 TB", "傳統硬碟", 7200, 256, "CMR", "WD", "資料中心", 5, "可購得"));
                hddFullList.add(new HDD_All(30302, "ST6000NM021A", "企業號 7E8", 3.5, "6 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "資料中心", 5, "可購得"));
                hddFullList.add(new HDD_All(30303, "HUS726T6TALE6L4", "UltraStar DC HC310", 3.5, "6 TB", "傳統硬碟", 7200, 256, "CMR", "WD", "資料中心", 5, "可購得"));
                hddFullList.add(new HDD_All(30304, "MG06ACA600E", "企業碟", 3.5, "6 TB", "傳統硬碟", 7200, 256, "CMR", "Toshiba", "資料中心", 5, "可購得"));

                hddFullList.add(new HDD_All(30401, "WD8004FRYZ", "金標", 3.5, "8 TB", "傳統硬碟", 7200, 256, "CMR", "WD", "資料中心", 5, "可購得"));
                hddFullList.add(new HDD_All(30402, "ST8000NM00A", "企業號 7E8", 3.5, "8 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "資料中心", 5, "可購得"));
                hddFullList.add(new HDD_All(30403, "HUS728T8TALE6L4", "UltraStar DC HC320", 3.5, "8 TB", "傳統硬碟", 7200, 256, "CMR", "WD", "資料中心", 5, "可購得"));
                hddFullList.add(new HDD_All(30404, "MG06ACA800E", "企業碟", 3.5, "8 TB", "傳統硬碟", 7200, 256, "CMR", "Toshiba", "資料中心", 5, "可購得"));

                hddFullList.add(new HDD_All(30501, "WD102KRYZ", "金標", 3.5, "10 TB", "傳統硬碟", 7200, 256, "CMR", "WD", "資料中心", 5, "可購得"));
                hddFullList.add(new HDD_All(30502, "ST10000NM001G", "企業號 X10", 3.5, "10 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "資料中心", 5, "可購得"));
                hddFullList.add(new HDD_All(30503, "HUH721010ALE604", "UltraStar DC HC510", 3.5, "10 TB", "傳統硬碟", 7200, 256, "CMR", "WD", "資料中心", 5, "可購得"));
                hddFullList.add(new HDD_All(30504, "MG06ACA10TE", "企業碟", 3.5, "10 TB", "傳統硬碟", 7200, 256, "CMR", "Toshiba", "資料中心", 5, "可購得"));

                hddFullList.add(new HDD_All(30601, "WD121KRYZ", "金標", 3.5, "12 TB", "傳統硬碟", 7200, 256, "CMR", "WD", "資料中心", 5, "可購得"));
                hddFullList.add(new HDD_All(30602, "ST12000NM001G", "企業號 X12", 3.5, "12 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "資料中心", 5, "可購得"));
                hddFullList.add(new HDD_All(30603, "HUH721212ALE604", "UltraStar DC HC520", 3.5, "12 TB", "傳統硬碟", 7200, 256, "CMR", "WD", "資料中心", 5, "可購得"));
                hddFullList.add(new HDD_All(30604, "MG07ACA12TE", "企業碟", 3.5, "12 TB", "傳統硬碟", 7200, 256, "CMR", "Toshiba", "資料中心", 5, "可購得"));

                hddFullList.add(new HDD_All(30701, "WD141KRYZ", "金標", 3.5, "14 TB", "傳統硬碟", 7200, 512, "CMR", "WD", "資料中心", 5, "可購得"));
                hddFullList.add(new HDD_All(30702, "ST14000NM001G", "企業號 X14", 3.5, "14 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "資料中心", 5, "可購得"));
                hddFullList.add(new HDD_All(30703, "WUH721414ALE6L4", "UltraStar DC HC530", 3.5, "14 TB", "傳統硬碟", 7200, 512, "CMR", "WD", "資料中心", 5, "可購得"));
                hddFullList.add(new HDD_All(30704, "MG07ACA14TE", "企業碟", 3.5, "14 TB", "傳統硬碟", 7200, 256, "CMR", "Toshiba", "資料中心", 5, "可購得"));

                hddFullList.add(new HDD_All(30801, "WD161KRYZ", "金標", 3.5, "16 TB", "傳統硬碟", 7200, 512, "CMR", "WD", "資料中心", 5, "可購得"));
                hddFullList.add(new HDD_All(30802, "ST16000NM001G", "企業號 X16", 3.5, "16 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "資料中心", 5, "可購得"));
                hddFullList.add(new HDD_All(30803, "WUH721816ALE6L4", "UltraStar DC HC550", 3.5, "16 TB", "傳統硬碟", 7200, 512, "CMR", "WD", "資料中心", 5, "可購得"));
                hddFullList.add(new HDD_All(30804, "MG08ACA16TE", "企業碟", 3.5, "16 TB", "傳統硬碟", 7200, 512, "CMR", "Toshiba", "資料中心", 5, "可購得"));

                hddFullList.add(new HDD_All(30901, "WD181KRYZ", "金標", 3.5, "18 TB", "傳統硬碟", 7200, 512, "CMR", "WD", "資料中心", 5, "可購得"));
                hddFullList.add(new HDD_All(30902, "ST18000NM000J", "企業號 X18", 3.5, "18 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "資料中心", 5, "可購得"));
                hddFullList.add(new HDD_All(30903, "WUH721818ALE6L4", "UltraStar DC HC550", 3.5, "18 TB", "傳統硬碟", 7200, 512, "CMR", "WD", "資料中心", 5, "可購得"));

                hddFullList.add(new HDD_All(40001, "WD10EFRX", "紅標 Plus", 3.5, "1 TB", "傳統硬碟", 5400, 64, "CMR", "WD", "NAS設備", 3, "可購得"));
                hddFullList.add(new HDD_All(40002, "ST1000VN002", "那嘶狼", 3.5, "1 TB", "傳統硬碟", 5900, 64, "CMR", "Seagate", "NAS設備", 3, "可購得"));

                hddFullList.add(new HDD_All(40101, "WD20EFAX", "紅標", 3.5, "2 TB", "傳統硬碟", 5400, 256, "SMR", "WD", "NAS設備", 3, "可購得"));
                hddFullList.add(new HDD_All(40102, "WD20EFRX", "紅標 Plus", 3.5, "2 TB", "傳統硬碟", 5400, 64, "CMR", "WD", "NAS設備", 3, "可購得"));
                hddFullList.add(new HDD_All(40103, "ST2000VN004", "那嘶狼", 3.5, "2 TB", "傳統硬碟", 5900, 64, "CMR", "Seagate", "NAS設備", 3, "可購得"));
                hddFullList.add(new HDD_All(40104, "WD20FFSX", "旗艦紅標", 3.5, "2 TB", "傳統硬碟", 7200, 64, "CMR", "WD", "NAS設備", 5, "可購得"));
                hddFullList.add(new HDD_All(40105, "ST2000NE0025", "那嘶狼 Pro", 3.5, "2 TB", "傳統硬碟", 7200, 128, "CMR", "Seagate", "NAS設備", 5, "可購得"));

                hddFullList.add(new HDD_All(40201, "WD30EFAX", "紅標", 3.5, "3 TB", "傳統硬碟", 5400, 256, "SMR", "WD", "NAS設備", 3, "可購得"));
                hddFullList.add(new HDD_All(40202, "WD30EFRX", "紅標 Plus", 3.5, "3 TB", "傳統硬碟", 5400, 64, "CMR", "WD", "NAS設備", 3, "可購得"));
                hddFullList.add(new HDD_All(40203, "ST3000VN007", "那嘶狼", 3.5, "3 TB", "傳統硬碟", 5900, 64, "CMR", "Seagate", "NAS設備", 3, "可購得"));

                hddFullList.add(new HDD_All(40301, "WD40EFAX", "紅標", 3.5, "4 TB", "傳統硬碟", 5400, 256, "SMR", "WD", "NAS設備", 3, "可購得"));
                hddFullList.add(new HDD_All(40302, "WD40EFRX", "紅標 Plus", 3.5, "4 TB", "傳統硬碟", 5400, 64, "CMR", "WD", "NAS設備", 3, "可購得"));
                hddFullList.add(new HDD_All(40303, "ST4000VN008", "那嘶狼", 3.5, "4 TB", "傳統硬碟", 5900, 64, "CMR", "Seagate", "NAS設備", 3, "可購得"));
                hddFullList.add(new HDD_All(40304, "HDWQ140AZSTA", "N300", 3.5, "4 TB", "傳統硬碟", 7200, 128, "CMR", "Toshiba", "NAS設備", 3, "可購得"));
                hddFullList.add(new HDD_All(40305, "WD4003FFBX", "旗艦紅標", 3.5, "4 TB", "傳統硬碟", 7200, 256, "CMR", "WD", "NAS設備", 5, "可購得"));
                hddFullList.add(new HDD_All(40306, "ST4000NE001", "那嘶狼 Pro", 3.5, "4 TB", "傳統硬碟", 7200, 128, "CMR", "Seagate", "NAS設備", 5, "可購得"));

                hddFullList.add(new HDD_All(40401, "WD60EFAX", "紅標", 3.5, "6 TB", "傳統硬碟", 5400, 256, "SMR", "WD", "NAS設備", 3, "可購得"));
                hddFullList.add(new HDD_All(40402, "WD60EFRX", "紅標 Plus", 3.5, "6 TB", "傳統硬碟", 5400, 64, "CMR", "WD", "NAS設備", 3, "可購得"));
                hddFullList.add(new HDD_All(40403, "ST6000VN001", "那嘶狼", 3.5, "6 TB", "傳統硬碟", 5400, 256, "CMR", "Seagate", "NAS設備", 3, "可購得"));
                hddFullList.add(new HDD_All(40404, "HDWN160AZSTA", "N300", 3.5, "6 TB", "傳統硬碟", 7200, 128, "CMR", "Toshiba", "NAS設備", 3, "可購得"));
                hddFullList.add(new HDD_All(40405, "WD6003FFBX", "旗艦紅標", 3.5, "6 TB", "傳統硬碟", 7200, 256, "CMR", "WD", "NAS設備", 5, "可購得"));
                hddFullList.add(new HDD_All(40406, "ST6000NE000", "那嘶狼 Pro", 3.5, "6 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "NAS設備", 5, "可購得"));

                hddFullList.add(new HDD_All(40501, "WD80EFAX", "紅標 Plus", 3.5, "8 TB", "傳統硬碟", 5400, 256, "CMR", "WD", "NAS設備", 3, "可購得"));
                hddFullList.add(new HDD_All(40502, "ST8000VN004", "那嘶狼", 3.5, "8 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "NAS設備", 3, "可購得"));
                hddFullList.add(new HDD_All(40503, "HDWN180AZSTA", "N300", 3.5, "8 TB", "傳統硬碟", 7200, 128, "CMR", "Toshiba", "NAS設備", 3, "可購得"));
                hddFullList.add(new HDD_All(40504, "WD8003FFBX", "旗艦紅標", 3.5, "8 TB", "傳統硬碟", 7200, 256, "CMR", "WD", "NAS設備", 5, "可購得"));
                hddFullList.add(new HDD_All(40505, "ST8000NE001", "那嘶狼 Pro", 3.5, "8 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "NAS設備", 5, "可購得"));

                hddFullList.add(new HDD_All(40601, "WD101EFAX", "紅標 Plus", 3.5, "10 TB", "傳統硬碟", 5400, 256, "CMR", "WD", "NAS設備", 3, "可購得"));
                hddFullList.add(new HDD_All(40602, "ST10000VN0008", "那嘶狼", 3.5, "10 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "NAS設備", 3, "可購得"));
                hddFullList.add(new HDD_All(40603, "HDWG11AAZSTA", "N300", 3.5, "10 TB", "傳統硬碟", 7200, 256, "CMR", "Toshiba", "NAS設備", 3, "可購得"));
                hddFullList.add(new HDD_All(40604, "WD102KFBX", "旗艦紅標", 3.5, "10 TB", "傳統硬碟", 7200, 256, "CMR", "WD", "NAS設備", 5, "可購得"));
                hddFullList.add(new HDD_All(40605, "ST10000NE0008", "那嘶狼 Pro", 3.5, "10 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "NAS設備", 5, "可購得"));

                hddFullList.add(new HDD_All(40701, "WD120EFAX", "紅標 Plus", 3.5, "12 TB", "傳統硬碟", 5400, 256, "CMR", "WD", "NAS設備", 3, "可購得"));
                hddFullList.add(new HDD_All(40702, "ST12000VN0008", "那嘶狼", 3.5, "12 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "NAS設備", 3, "可購得"));
                hddFullList.add(new HDD_All(40703, "HDWG21CAZSTA", "N300", 3.5, "12 TB", "傳統硬碟", 7200, 256, "CMR", "Toshiba", "NAS設備", 3, "可購得"));
                hddFullList.add(new HDD_All(40704, "WD121KFBX", "旗艦紅標", 3.5, "12 TB", "傳統硬碟", 7200, 256, "CMR", "WD", "NAS設備", 5, "可購得"));
                hddFullList.add(new HDD_All(40705, "ST12000NE0008", "那嘶狼 Pro", 3.5, "12 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "NAS設備", 5, "可購得"));

                hddFullList.add(new HDD_All(40801, "WD140EFFX", "紅標 Plus", 3.5, "14 TB", "傳統硬碟", 5400, 512, "CMR", "WD", "NAS設備", 3, "可購得"));
                hddFullList.add(new HDD_All(40802, "ST14000VN0008", "那嘶狼", 3.5, "14 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "NAS設備", 3, "可購得"));
                hddFullList.add(new HDD_All(40803, "MN07ACA14T", "N300", 3.5, "14 TB", "傳統硬碟", 7200, 256, "CMR", "Toshiba", "NAS設備", 3, "可購得"));
                hddFullList.add(new HDD_All(40804, "WD141KFBX", "旗艦紅標", 3.5, "14 TB", "傳統硬碟", 7200, 512, "CMR", "WD", "NAS設備", 5, "可購得"));
                hddFullList.add(new HDD_All(40805, "ST14000NE0008", "那嘶狼 Pro", 3.5, "14 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "NAS設備", 5, "可購得"));

                hddFullList.add(new HDD_All(40901, "ST16000VN001", "那嘶狼", 3.5, "16 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "NAS設備", 3, "可購得"));
                hddFullList.add(new HDD_All(40902, "ST16000NE000", "那嘶狼 Pro", 3.5, "16 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "NAS設備", 5, "可購得"));

                hddFullList.add(new HDD_All(41001, "ST18000NE000", "那嘶狼 Pro", 3.5, "18 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "NAS設備", 5, "可購得"));

                hddFullList.add(new HDD_All(50001, "WD10PURZ", "紫標", 3.5, "1 TB", "傳統硬碟", 5400, 64, "CMR", "WD", "監控設備", 3, "可購得"));
                hddFullList.add(new HDD_All(50002, "ST1000VX005", "監控鷹", 3.5, "1 TB", "傳統硬碟", 5900, 64, "CMR", "Seagate", "監控設備", 3, "可購得"));
                hddFullList.add(new HDD_All(50003, "DT01ABA100V", "影音監控碟", 3.5, "1 TB", "傳統硬碟", 5700, 32, "CMR", "Toshiba", "監控設備", 3, "可購得"));

                hddFullList.add(new HDD_All(50101, "WD20PURZ", "紫標", 3.5, "2 TB", "傳統硬碟", 5400, 64, "CMR", "WD", "監控設備", 3, "可購得"));
                hddFullList.add(new HDD_All(50102, "ST2000VX008", "監控鷹", 3.5, "2 TB", "傳統硬碟", 5900, 64, "CMR", "Seagate", "監控設備", 3, "可購得"));
                hddFullList.add(new HDD_All(50103, "DT01ABA200V", "影音監控碟", 3.5, "2 TB", "傳統硬碟", 5700, 32, "CMR", "Toshiba", "監控設備", 3, "可購得"));

                hddFullList.add(new HDD_All(50201, "WD30PURZ", "紫標", 3.5, "3 TB", "傳統硬碟", 5400, 64, "CMR", "WD", "監控設備", 3, "可購得"));
                hddFullList.add(new HDD_All(50202, "ST3000VX009", "監控鷹", 3.5, "3 TB", "傳統硬碟", 5900, 256, "CMR", "Seagate", "監控設備", 3, "可購得"));
                hddFullList.add(new HDD_All(50203, "DT01ABA300V", "影音監控碟", 3.5, "3 TB", "傳統硬碟", 5940, 32, "CMR", "Toshiba", "監控設備", 3, "可購得"));

                hddFullList.add(new HDD_All(50301, "WD40PURZ", "紫標", 3.5, "4 TB", "傳統硬碟", 5400, 64, "CMR", "WD", "監控設備", 3, "可購得"));
                hddFullList.add(new HDD_All(50302, "ST4000VX007", "監控鷹", 3.5, "4 TB", "傳統硬碟", 5900, 256, "CMR", "Seagate", "監控設備", 3, "可購得"));
                hddFullList.add(new HDD_All(50303, "MD04ABA400V", "影音監控碟", 3.5, "4 TB", "傳統硬碟", 5400, 128, "CMR", "Toshiba", "監控設備", 3, "可購得"));

                hddFullList.add(new HDD_All(50401, "WD60PURZ", "紫標", 3.5, "6 TB", "傳統硬碟", 5400, 64, "CMR", "WD", "監控設備", 3, "可購得"));
                hddFullList.add(new HDD_All(50402, "ST6000VX001", "監控鷹", 3.5, "6 TB", "傳統硬碟", 5400, 256, "CMR", "Seagate", "監控設備", 3, "可購得"));
                hddFullList.add(new HDD_All(50403, "MD06ACA600V", "影音監控碟", 3.5, "6 TB", "傳統硬碟", 7200, 256, "CMR", "Toshiba", "監控設備", 3, "可購得"));

                hddFullList.add(new HDD_All(50501, "WD82PURZ", "紫標", 3.5, "8 TB", "傳統硬碟", 7200, 256, "CMR", "WD", "監控設備", 3, "可購得"));
                hddFullList.add(new HDD_All(50502, "ST8000VX004", "監控鷹", 3.5, "8 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "監控設備", 3, "可購得"));
                hddFullList.add(new HDD_All(50503, "ST8000VE001", "監控鷹 AI", 3.5, "8 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "監控設備", 3, "可購得"));
                hddFullList.add(new HDD_All(50504, "MD06ACA800V", "影音監控碟", 3.5, "8 TB", "傳統硬碟", 7200, 256, "CMR", "Toshiba", "監控設備", 3, "可購得"));

                hddFullList.add(new HDD_All(50601, "WD102PURZ", "紫標", 3.5, "10 TB", "傳統硬碟", 7200, 256, "CMR", "WD", "監控設備", 3, "可購得"));
                hddFullList.add(new HDD_All(50602, "ST10000VE0008", "監控鷹 AI", 3.5, "10 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "監控設備", 3, "可購得"));
                hddFullList.add(new HDD_All(50603, "MD06ACA10TV", "影音監控碟", 3.5, "10 TB", "傳統硬碟", 7200, 256, "CMR", "Toshiba", "監控設備", 3, "可購得"));

                hddFullList.add(new HDD_All(50701, "WD121PURZ", "紫標", 3.5, "12 TB", "傳統硬碟", 7200, 256, "CMR", "WD", "監控設備", 3, "可購得"));
                hddFullList.add(new HDD_All(50702, "ST12000VE001", "監控鷹 AI", 3.5, "12 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "監控設備", 3, "可購得"));

                hddFullList.add(new HDD_All(50801, "WD140PURZ", "紫標", 3.5, "14 TB", "傳統硬碟", 7200, 512, "CMR", "WD", "監控設備", 3, "可購得"));
                hddFullList.add(new HDD_All(50802, "ST14000VE0008", "監控鷹 AI", 3.5, "14 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "監控設備", 3, "可購得"));

                hddFullList.add(new HDD_All(50901, "ST16000VE002", "監控鷹 AI", 3.5, "16 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "監控設備", 3, "可購得"));

                hddFullList.add(new HDD_All(51001, "WD180PURZ", "紫標", 3.5, "18 TB", "傳統硬碟", 7200, 512, "CMR", "WD", "監控設備", 3, "可購得"));
                hddFullList.add(new HDD_All(51002, "ST18000VE002", "監控鷹 AI", 3.5, "18 TB", "傳統硬碟", 7200, 256, "CMR", "Seagate", "監控設備", 3, "可購得"));

                hddFullList.add(new HDD_All(60001, "WD10JFCX", "紅標", 2.5, "1 TB", "傳統硬碟", 5400, 16, "CMR", "WD", "NAS設備", 3, "可購得"));

                /*產生JSON字串*/
                String jsonHddFullList = gson0.toJson(hddFullList);

                /*宣告StringBuilder物件*/
                StringBuilder sb0 = new StringBuilder();

                sb0.append("id,productID,productName,size,storage,type,hddRPM,hddCache,diskType,company,usage,warranty,status");
                for(HDD_All hddFullSample: hddFullList){
                    sb0.append(System.lineSeparator());
                    sb0.append(hddFullSample.getId());
                    sb0.append(",");
                    sb0.append(hddFullSample.getProductID());
                    sb0.append(",");
                    sb0.append(hddFullSample.getProductName());
                    sb0.append(",");
                    sb0.append(hddFullSample.getSize());
                    sb0.append(",");
                    sb0.append(hddFullSample.getStorage());
                    sb0.append(",");
                    sb0.append(hddFullSample.getDeviceType());
                    sb0.append(",");
                    sb0.append(hddFullSample.getHddRPM());
                    sb0.append(",");
                    sb0.append(hddFullSample.getHddCache());
                    sb0.append(",");
                    sb0.append(hddFullSample.getDiskType());
                    sb0.append(",");
                    sb0.append(hddFullSample.getCompany());
                    sb0.append(",");
                    sb0.append(hddFullSample.getUsage());
                    sb0.append(",");
                    sb0.append(hddFullSample.getWarranty());
                    sb0.append(",");
                    sb0.append(hddFullSample.getStatus());
                }
                
                String csvData = sb0.toString();
                String [] xmlDataSpace = csvData.split(System.lineSeparator());

                /*即將開始建立檔案*/
                System.out.println();

                boolean keepCreateFiles = false;
                /*檢查目錄是否存在*/
                if(File_Conf.checkDir()){
                    /*檢查特定位置的檔案是否為目錄*/
                    if(File_Conf.checkFileIsDir()){
                        keepCreateFiles = true;
                    }
                    else{
                        System.out.println("檔案存放目錄並非目錄，請退出程式後將該檔案刪除，再次啟動後程式會自動建立所需的目錄");
                        mode1 = false;
                    }
                }
                else{
                    if(File_Conf.createFileDir()){
                        System.out.println("檔案存放目錄成功建立...");
                        keepCreateFiles = true;
                    }
                    else{
                        System.out.println("檔案存放目錄無法建立！");
                        mode1 = false;
                    }
                }

                if(keepCreateFiles){
                    try {
                        File_Conf.writeResultCSV(csvData);
                        System.out.println("指定的工作一已完成...，產生的檔案位於：" + System.lineSeparator() + File_Conf.getResultCSVPath());

                        File_Conf.writeResultJSON(jsonHddFullList);
                        System.out.println("指定的工作二已完成...，產生的檔案位於：" + System.lineSeparator() + File_Conf.getResultJSONPath());

                        Document doc0 = DocumentHelper.createDocument();
                        /*最外層*/
                        Element rt0 = doc0.addElement("HDD");
                        for(int i = 1; i < xmlDataSpace.length; i++) {
                            String [] xmlData = xmlDataSpace[i].split(",");
                            /*個別item*/
                            Element hddItem = rt0.addElement("hddInfos");

                            hddItem.addElement("id").addText(xmlData[0]);
                            hddItem.addElement("productID").addText(xmlData[1]);
                            hddItem.addElement("productName").addText(xmlData[2]);
                            hddItem.addElement("size").addText(xmlData[3]);
                            hddItem.addElement("storage").addText(xmlData[4]);
                            hddItem.addElement("deviceType").addText(xmlData[5]);
                            hddItem.addElement("hddRPM").addText(xmlData[6]);
                            hddItem.addElement("hddCache").addText(xmlData[7]);
                            hddItem.addElement("diskType").addText(xmlData[8]);
                            hddItem.addElement("company").addText(xmlData[9]);
                            hddItem.addElement("usage").addText(xmlData[10]);
                            hddItem.addElement("warranty").addText(xmlData[11]);
                            hddItem.addElement("status").addText(xmlData[12]);
                        }

                        File_Conf.writeResultXML(doc0);
                        System.out.println("指定的工作三已完成...，產生的檔案位於：" + System.lineSeparator() + File_Conf.getResultXMLPath());

                        System.out.println(System.lineSeparator() + "如果想使用因為這些檔案建立而解鎖的功能，請重新啟動本程式");
                    } catch(IOException ioE) {
                        ioE.printStackTrace();
                    } finally {
                        System.out.println();
                        mode1 = false;
                    }
                }
            }

            if(mode2){
                System.out.println(System.lineSeparator() + "讀取結果為：");
                try{
                    /*嘗試讀檔*/
                    String csvDataString = File_Conf.readResultCSV();
                    System.out.println(csvDataString);
                    /*分解String*/
                    String [] csvDataSpace = csvDataString.split(System.lineSeparator());
                    /*宣告存放資料的陣列*/
                    List<HDD_All> hddFullList = new ArrayList<>();
                    /*XML用*/
                    Document doc0 = DocumentHelper.createDocument();
                    Element rt0 = doc0.addElement("HDD");

                    for(int i = 1; i < csvDataSpace.length; i++){
                        String [] csvData = csvDataSpace[i].split(",");
                        HDD_All tmpHddData = new HDD_All(0, "", "", 0.0, "", "", 0, 0, "", "", "", 0, "");

                        tmpHddData.setId(Integer.parseInt(csvData[0]));
                        tmpHddData.setProductID(csvData[1]);
                        tmpHddData.setProductName(csvData[2]);
                        tmpHddData.setSize(Double.parseDouble(csvData[3]));
                        tmpHddData.setStorage(csvData[4]);
                        tmpHddData.setDeviceType(csvData[5]);
                        tmpHddData.setHddRPM(Integer.parseInt(csvData[6]));
                        tmpHddData.setHddCache(Integer.parseInt(csvData[7]));
                        tmpHddData.setDiskType(csvData[8]);
                        tmpHddData.setCompany(csvData[9]);
                        tmpHddData.setUsage(csvData[10]);
                        tmpHddData.setWarranty(Integer.parseInt(csvData[11]));
                        tmpHddData.setStatus(csvData[12]);

                        hddFullList.add(tmpHddData);

                        Element hddItem = rt0.addElement("hddInfos");

                        hddItem.addElement("id").addText(csvData[0]);
                        hddItem.addElement("productID").addText(csvData[1]);
                        hddItem.addElement("productName").addText(csvData[2]);
                        hddItem.addElement("size").addText(csvData[3]);
                        hddItem.addElement("storage").addText(csvData[4]);
                        hddItem.addElement("deviceType").addText(csvData[5]);
                        hddItem.addElement("hddRPM").addText(csvData[6]);
                        hddItem.addElement("hddCache").addText(csvData[7]);
                        hddItem.addElement("diskType").addText(csvData[8]);
                        hddItem.addElement("company").addText(csvData[9]);
                        hddItem.addElement("usage").addText(csvData[10]);
                        hddItem.addElement("warranty").addText(csvData[11]);
                        hddItem.addElement("status").addText(csvData[12]);
                    }

                    /*產生JSON字串*/
                    String jsonHddFullList = gson0.toJson(hddFullList);
                    /*即將開始建立檔案*/
                    System.out.println();

                    boolean keepCreateFiles = false;
                    /*檢查目錄是否存在*/
                    if(File_Conf.checkDir()){
                        /*檢查特定位置的檔案是否為目錄*/
                        if(File_Conf.checkFileIsDir()){
                            keepCreateFiles = true;
                        }
                        else{
                            System.out.println("檔案存放目錄並非目錄，請退出程式後將該檔案刪除，再次啟動後程式會自動建立所需的目錄");
                        }
                    }
                    else{
                        if(File_Conf.createFileDir()){
                            System.out.println("檔案存放目錄成功建立...");
                            keepCreateFiles = true;
                        }
                        else{
                            System.out.println("檔案存放目錄無法建立！");
                        }
                    }

                    if(keepCreateFiles){
                        File_Conf.writeResultJSON01(jsonHddFullList);
                        System.out.println("指定的工作一已完成...，產生的檔案位於：" + System.lineSeparator() + File_Conf.getResultJSON01Path());

                        File_Conf.writeResultXML02(doc0);
                        System.out.println("指定的工作二已完成...，產生的檔案位於：" + System.lineSeparator() + File_Conf.getResultXML02Path());
                    }
                } catch(IOException ioE) {
                    ioE.printStackTrace();
                } finally {
                    System.out.println();
                    mode2 = false;
                }
            }

            if(mode3){
                System.out.println(System.lineSeparator() + "讀取結果為：");
                try{
                    /*嘗試讀檔*/
                    String jsonDataString = File_Conf.readResultJSON();
                    /*XML用*/
                    Document doc0 = DocumentHelper.createDocument();
                    Element rt0 = doc0.addElement("HDD");
                    /*宣告存放資料的陣列，來接反序列化後的資料*/
                    List<HDD_All> hddFullList = gson0.fromJson(jsonDataString, new TypeToken<List<HDD_All>>() {}.getType());
                    /*宣告用來產生不同格式json的陣列*/
                    List<HDD_Part> hddPartList0 = new ArrayList<>();
                    List<HDD_Part> hddPartList1 = new ArrayList<>();
                    List<HDD_Part> hddPartList2 = new ArrayList<>();
                    List<HDD_Part> hddPartList3 = new ArrayList<>();
                    List<HDD_Part> hddPartList4 = new ArrayList<>();

                    /*宣告StringBuilder物件*/
                    StringBuilder sb0 = new StringBuilder();

                    System.out.println("[");
                    sb0.append("id,productID,productName,size,storage,type,hddRPM,hddCache,diskType,company,usage,warranty,status");
                    for(HDD_All hddFullSample: hddFullList){
                        sb0.append(System.lineSeparator());
                        sb0.append(hddFullSample.getId());
                        sb0.append(",");
                        sb0.append(hddFullSample.getProductID());
                        sb0.append(",");
                        sb0.append(hddFullSample.getProductName());
                        sb0.append(",");
                        sb0.append(hddFullSample.getSize());
                        sb0.append(",");
                        sb0.append(hddFullSample.getStorage());
                        sb0.append(",");
                        sb0.append(hddFullSample.getDeviceType());
                        sb0.append(",");
                        sb0.append(hddFullSample.getHddRPM());
                        sb0.append(",");
                        sb0.append(hddFullSample.getHddCache());
                        sb0.append(",");
                        sb0.append(hddFullSample.getDiskType());
                        sb0.append(",");
                        sb0.append(hddFullSample.getCompany());
                        sb0.append(",");
                        sb0.append(hddFullSample.getUsage());
                        sb0.append(",");
                        sb0.append(hddFullSample.getWarranty());
                        sb0.append(",");
                        sb0.append(hddFullSample.getStatus());

                        System.out.println("  {");
                        System.out.println("    " + hddFullSample.toNormalString());
                        System.out.println("  }");

                        Element hddItem = rt0.addElement("hddInfos");

                        hddItem.addElement("id").addText(String.valueOf(hddFullSample.getId()));
                        hddItem.addElement("productID").addText(hddFullSample.getProductID());
                        hddItem.addElement("productName").addText(hddFullSample.getProductName());
                        hddItem.addElement("size").addText(String.valueOf(hddFullSample.getSize()));
                        hddItem.addElement("storage").addText(hddFullSample.getStorage());
                        hddItem.addElement("deviceType").addText(hddFullSample.getDeviceType());
                        hddItem.addElement("hddRPM").addText(String.valueOf(hddFullSample.getHddRPM()));
                        hddItem.addElement("hddCache").addText(String.valueOf(hddFullSample.getHddCache()));
                        hddItem.addElement("diskType").addText(hddFullSample.getDiskType());
                        hddItem.addElement("company").addText(hddFullSample.getCompany());
                        hddItem.addElement("usage").addText(hddFullSample.getUsage());
                        hddItem.addElement("warranty").addText(String.valueOf(hddFullSample.getWarranty()));
                        hddItem.addElement("status").addText(hddFullSample.getStatus());

                        HDD_Part hddPartSample = new HDD_Part(0, "", "", 0.0, "", "", 0, 0, "", "", 0, "");

                        hddPartSample.setId(hddFullSample.getId());
                        hddPartSample.setProductID(hddFullSample.getProductID());
                        hddPartSample.setProductName(hddFullSample.getProductName());
                        hddPartSample.setSize(hddFullSample.getSize());
                        hddPartSample.setStorage(hddFullSample.getStorage());
                        hddPartSample.setDeviceType(hddFullSample.getDeviceType());
                        hddPartSample.setHddRPM(hddFullSample.getHddRPM());
                        hddPartSample.setHddCache(hddFullSample.getHddCache());
                        hddPartSample.setDiskType(hddFullSample.getDiskType());
                        hddPartSample.setCompany(hddFullSample.getCompany());
                        hddPartSample.setWarranty(hddFullSample.getWarranty());
                        hddPartSample.setStatus(hddFullSample.getStatus());

                        switch(hddFullSample.getUsage()){
                            case "筆記型電腦":
                                hddPartList0.add(hddPartSample);
                                break;
                            case "桌上型電腦":
                                hddPartList1.add(hddPartSample);
                                break;
                            case "資料中心":
                                hddPartList2.add(hddPartSample);
                                break;
                            case "NAS設備":
                                hddPartList3.add(hddPartSample);
                                break;
                            case "監控設備":
                                hddPartList4.add(hddPartSample);
                                break;
                        }
                    }

                    System.out.println("]");
                    /*即將開始建立檔案*/
                    System.out.println();
                    /*產生輸出用json字串*/
                    List<HDD_Output> hddOutputList = new ArrayList<>();

                    hddOutputList.add(new HDD_Output("筆記型電腦", hddPartList0));
                    hddOutputList.add(new HDD_Output("桌上型電腦", hddPartList1));
                    hddOutputList.add(new HDD_Output("資料中心", hddPartList2));
                    hddOutputList.add(new HDD_Output("NAS設備", hddPartList3));
                    hddOutputList.add(new HDD_Output("監控設備", hddPartList4));

                    String jsonHddOutputList = gson0.toJson(hddOutputList);

                    boolean keepCreateFiles = false;
                    /*檢查目錄是否存在*/
                    if(File_Conf.checkDir()){
                        /*檢查特定位置的檔案是否為目錄*/
                        if(File_Conf.checkFileIsDir()){
                            keepCreateFiles = true;
                        }
                        else{
                            System.out.println("檔案存放目錄並非目錄，請退出程式後將該檔案刪除，再次啟動後程式會自動建立所需的目錄");
                        }
                    }
                    else{
                        if(File_Conf.createFileDir()){
                            System.out.println("檔案存放目錄成功建立...");
                            keepCreateFiles = true;
                        }
                        else{
                            System.out.println("檔案存放目錄無法建立！");
                        }
                    }

                    if(keepCreateFiles){
                        File_Conf.writeResultCSV10(sb0.toString());
                        System.out.println("指定的工作一已完成...，產生的檔案位於：" + System.lineSeparator() + File_Conf.getResultCSV10Path());

                        File_Conf.writeResultXML12(doc0);
                        System.out.println("指定的工作二已完成...，產生的檔案位於：" + System.lineSeparator() + File_Conf.getResultXML12Path());

                        File_Conf.writeResultJSON13(jsonHddOutputList);
                        System.out.println("指定的工作三已完成...，產生的檔案位於：" + System.lineSeparator() + File_Conf.getResultJSON13Path());
                    }
                } catch(IOException ioE) {
                    ioE.printStackTrace();
                } finally {
                    System.out.println();
                    mode3 = false;
                }
            }

            if(mode4){
                System.out.println(System.lineSeparator() + "讀取結果為：");
                try{
                    /*嘗試讀檔*/
                    Document doc0 = File_Conf.readResultXML();
                    /*取得最外層*/
                    Element rt0 = doc0.getRootElement();
                    System.out.println("<" + rt0.getName() + ">");

                    /*取得更內層的資料，用陣列接*/
                    List<Node> hddNode0 = doc0.selectNodes("/HDD/hddInfos" );
                    /*宣告存放資料的陣列*/
                    List<HDD_All> hddFullList = new ArrayList<>();
                    /*宣告StringBuilder物件*/
                    StringBuilder sb0 = new StringBuilder();

                    sb0.append("id,productID,productName,size,storage,type,hddRPM,hddCache,diskType,company,usage,warranty,status");

                    for(Node hddItem: hddNode0){
                        System.out.println("  <" + hddItem.getName() + ">");
                        System.out.println("    <id>" + hddItem.selectSingleNode("id").getText() + "</id>");
                        System.out.println("    <productID>" + hddItem.selectSingleNode("productID").getText() + "</productID>");
                        System.out.println("    <productName>" + hddItem.selectSingleNode("productName").getText() + "</productName>");
                        System.out.println("    <size>" + hddItem.selectSingleNode("size").getText() + "</size>");
                        System.out.println("    <storage>" + hddItem.selectSingleNode("storage").getText() + "</storage>");
                        System.out.println("    <deviceType>" + hddItem.selectSingleNode("deviceType").getText() + "</deviceType>");
                        System.out.println("    <hddRPM>" + hddItem.selectSingleNode("hddRPM").getText() + "</hddRPM>");
                        System.out.println("    <hddCache>" + hddItem.selectSingleNode("hddCache").getText() + "</hddCache>");
                        System.out.println("    <diskType>" + hddItem.selectSingleNode("diskType").getText() + "</diskType>");
                        System.out.println("    <company>" + hddItem.selectSingleNode("company").getText() + "</company>");
                        System.out.println("    <usage>" + hddItem.selectSingleNode("usage").getText() + "</usage>");
                        System.out.println("    <warranty>" + hddItem.selectSingleNode("warranty").getText() + "</warranty>");
                        System.out.println("    <status>" + hddItem.selectSingleNode("status").getText() + "</status>");
                        System.out.println("  </" + hddItem.getName() + ">");

                        sb0.append(System.lineSeparator());
                        sb0.append(hddItem.selectSingleNode("id").getText());
                        sb0.append(",");
                        sb0.append(hddItem.selectSingleNode("productID").getText());
                        sb0.append(",");
                        sb0.append(hddItem.selectSingleNode("productName").getText());
                        sb0.append(",");
                        sb0.append(hddItem.selectSingleNode("size").getText());
                        sb0.append(",");
                        sb0.append(hddItem.selectSingleNode("storage").getText());
                        sb0.append(",");
                        sb0.append(hddItem.selectSingleNode("deviceType").getText());
                        sb0.append(",");
                        sb0.append(hddItem.selectSingleNode("hddRPM").getText());
                        sb0.append(",");
                        sb0.append(hddItem.selectSingleNode("hddCache").getText());
                        sb0.append(",");
                        sb0.append(hddItem.selectSingleNode("diskType").getText());
                        sb0.append(",");
                        sb0.append(hddItem.selectSingleNode("company").getText());
                        sb0.append(",");
                        sb0.append(hddItem.selectSingleNode("usage").getText());
                        sb0.append(",");
                        sb0.append(hddItem.selectSingleNode("warranty").getText());
                        sb0.append(",");
                        sb0.append(hddItem.selectSingleNode("status").getText());

                        HDD_All tmpHddData = new HDD_All(0, "", "", 0.0, "", "", 0, 0, "", "", "", 0, "");

                        tmpHddData.setId(Integer.parseInt(hddItem.selectSingleNode("id").getText()));
                        tmpHddData.setProductID(hddItem.selectSingleNode("productID").getText());
                        tmpHddData.setProductName(hddItem.selectSingleNode("productName").getText());
                        tmpHddData.setSize(Double.parseDouble(hddItem.selectSingleNode("size").getText()));
                        tmpHddData.setStorage(hddItem.selectSingleNode("storage").getText());
                        tmpHddData.setDeviceType(hddItem.selectSingleNode("deviceType").getText());
                        tmpHddData.setHddRPM(Integer.parseInt(hddItem.selectSingleNode("hddRPM").getText()));
                        tmpHddData.setHddCache(Integer.parseInt(hddItem.selectSingleNode("hddCache").getText()));
                        tmpHddData.setDiskType(hddItem.selectSingleNode("diskType").getText());
                        tmpHddData.setCompany(hddItem.selectSingleNode("company").getText());
                        tmpHddData.setUsage(hddItem.selectSingleNode("usage").getText());
                        tmpHddData.setWarranty(Integer.parseInt(hddItem.selectSingleNode("warranty").getText()));
                        tmpHddData.setStatus(hddItem.selectSingleNode("status").getText());

                        hddFullList.add(tmpHddData);
                    }

                    System.out.println("</" + rt0.getName() + ">");

                    /*產生JSON字串*/
                    String jsonHddFullList = gson0.toJson(hddFullList);
                    /*即將開始建立檔案*/
                    System.out.println();

                    boolean keepCreateFiles = false;
                    /*檢查目錄是否存在*/
                    if(File_Conf.checkDir()){
                        /*檢查特定位置的檔案是否為目錄*/
                        if(File_Conf.checkFileIsDir()){
                            keepCreateFiles = true;
                        }
                        else{
                            System.out.println("檔案存放目錄並非目錄，請退出程式後將該檔案刪除，再次啟動後程式會自動建立所需的目錄");
                        }
                    }
                    else{
                        if(File_Conf.createFileDir()){
                            System.out.println("檔案存放目錄成功建立...");
                            keepCreateFiles = true;
                        }
                        else{
                            System.out.println("檔案存放目錄無法建立！");
                        }
                    }

                    if(keepCreateFiles){
                        File_Conf.writeResultCSV20(sb0.toString());
                        System.out.println("指定的工作一已完成...，產生的檔案位於：" + System.lineSeparator() + File_Conf.getResultCSV20Path());

                        File_Conf.writeResultJSON21(jsonHddFullList);
                        System.out.println("指定的工作二已完成...，產生的檔案位於：" + System.lineSeparator() + File_Conf.getResultJSON21Path());
                    }
                } catch(IOException | DocumentException ioE){
                    ioE.printStackTrace();
                } finally {
                    System.out.println();
                    mode4 = false;
                }
            }

            if(mode5){
                System.out.println(System.lineSeparator() + "讀取結果為：");
                try{
                    /*嘗試讀檔*/
                    String jsonDataString = File_Conf.readResultJSON13();
                    /*宣告存放資料的陣列，來接反序列化後的資料*/
                    List<HDD_Output> hddDataList = gson0.fromJson(jsonDataString, new TypeToken<List<HDD_Output>>() {}.getType());

                    System.out.println("[");
                    for(HDD_Output hddData: hddDataList){
                        System.out.println("  {");
                        System.out.println("    usage:" + hddData.getUsage());
                        System.out.println("    hddPartList:[");

                        for(HDD_Part hddItem: hddData.getHddPartList()){
                            System.out.println("                   {");
                            System.out.println("                     " + hddItem.toNormalString());
                            System.out.println("                   }");
                        }

                        System.out.println("                ]");
                        System.out.println("  }");
                    }
                    System.out.println("]");
                } catch(IOException ioE){
                    ioE.printStackTrace();
                } finally {
                    System.out.println();
                    mode5 = false;
                }
            }

            if(mode6){
                System.out.println(System.lineSeparator() + "讀取結果為：");
            }
        }

        System.out.println(System.lineSeparator() + "程式已結束...");
        /*關閉Scanner*/
        scan.close();
    }
}
