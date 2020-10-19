package javaTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.IOException;

import java.nio.charset.StandardCharsets;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class File_Conf {
    /*將程式中的資料輸出成csv檔*/
    private final static File resultF0 = new File("data/HDD_Data_csv_File.csv");
    /*將程式中的資料輸出成json檔*/
    private final static File resultF1 = new File("data/HDD_Data_json_File.json");
    /*將程式中的資料輸出成xml檔*/
    private final static File resultF2 = new File("data/HDD_Data_xml_File.xml");
    /*由csv檔所產生的json檔*/
    private final static File resultF01 = new File("data/HDD_Data_csv2json.json");
    /*由csv檔所產生的xml檔*/
    private final static File resultF02 = new File("data/HDD_Data_csv2xml.xml");
    /*由json檔所產生的csv檔*/
    private final static File resultF10 = new File("data/HDD_Data_json2csv.csv");
    /*由json檔所產生的xml檔*/
    private final static File resultF12 = new File("data/HDD_Data_json2xml.xml");
    /*由xml檔所產生的csv檔*/
    private final static File resultF20 = new File("data/HDD_Data_xml2csv.csv");
    /*由xml檔所產生的json檔*/
    private final static File resultF21 = new File("data/HDD_Data_xml2json.json");
    /*由json產生的調整版json*/
    private final static File resultF3 = new File("data/HDD_Data_json_File2.json");
    /*由xml產生的調整版xml*/
    private final static File resultF4 = new File("data/HDD_Data_xml_File2.xml");

    /*存放檔案的目錄*/
    private final static File dir0 = new File("data");

    /**
     * 建立存放檔案的目錄
     *
     * @return 回傳目錄是否成功建立，true代表成功
     */
    /*建立存放檔案的目錄*/
    protected static boolean createFileDir(){
        return dir0.mkdir();
    }

    /**
     * 寫入輸出csv檔
     *
     * @param Data 產生的csv資訊(String)
     *
     * @throws IOException 拋出IO類的異常到呼叫處處理
     */
    /*寫入輸出csv檔*/
    protected static void writeResultCSV(String Data) throws IOException{
        FileOutputStream fos0;
        OutputStreamWriter osw0;

        fos0 = new FileOutputStream(resultF0);
        osw0 = new OutputStreamWriter(fos0, StandardCharsets.UTF_8);

        osw0.write(Data);
        osw0.flush();
        fos0.close();
        osw0.close();
    }

    /**
     * 寫入輸出json檔
     *
     * @param Data 產生的json資訊(String)
     *
     * @throws IOException 拋出IO類的異常到呼叫處處理
     */
    /*寫入輸出json檔*/
    protected static void writeResultJSON(String Data) throws IOException{
        FileOutputStream fos0;
        OutputStreamWriter osw0;

        fos0 = new FileOutputStream(resultF1);
        osw0 = new OutputStreamWriter(fos0, StandardCharsets.UTF_8);

        osw0.write(Data);
        osw0.flush();
        fos0.close();
        osw0.close();
    }

    /**
     * 寫入輸出xml檔
     *
     * @param Doc 產生的xml資訊(Document)
     *
     * @throws IOException 拋出IO類的異常到呼叫處處理
     */
    /*寫入輸出xml檔*/
    protected static void writeResultXML(Document Doc) throws IOException{
    	OutputFormat of0 = OutputFormat.createPrettyPrint();
    	FileOutputStream fos0;
        XMLWriter xmlW0;

        fos0 = new FileOutputStream(resultF2);
        of0.setEncoding("UTF-8");
        xmlW0 = new XMLWriter(new OutputStreamWriter(fos0), of0);

        xmlW0.write(Doc);
        xmlW0.flush();
        fos0.close();
        xmlW0.close();
    }

    /**
     * 寫入來自csv檔的內容，輸出成json檔
     *
     * @param Data 產生的json資訊(String)
     *
     * @throws IOException 拋出IO類的異常到呼叫處處理
     */
    /*寫入來自csv檔的內容，輸出成json檔*/
    protected static void writeResultJSON01(String Data) throws IOException{
        FileOutputStream fos0;
        OutputStreamWriter osw0;

        fos0 = new FileOutputStream(resultF01);
        osw0 = new OutputStreamWriter(fos0, StandardCharsets.UTF_8);

        osw0.write(Data);
        osw0.flush();
        fos0.close();
        osw0.close();
    }

    /**
     * 寫入來自csv檔的內容，輸出成xml檔
     *
     * @param Doc 產生的xml資訊(Document)
     *
     * @throws IOException 拋出IO類的異常到呼叫處處理
     */
    /*寫入來自csv檔的內容，輸出成xml檔*/
    protected static void writeResultXML02(Document Doc) throws IOException{
        OutputFormat of0 = OutputFormat.createPrettyPrint();
        FileOutputStream fos0;
        XMLWriter xmlW0;

        fos0 = new FileOutputStream(resultF02);
        of0.setEncoding("UTF-8");
        xmlW0 = new XMLWriter(new OutputStreamWriter(fos0), of0);

        xmlW0.write(Doc);
        xmlW0.flush();
        fos0.close();
        xmlW0.close();
    }

    /**
     * 寫入來自json檔的內容，輸出成csv檔
     *
     * @param Data 產生的csv資訊(String)
     *
     * @throws IOException 拋出IO類的異常到呼叫處處理
     */
    /*寫入來自json檔的內容，輸出成csv檔*/
    protected static void writeResultCSV10(String Data) throws IOException{
        FileOutputStream fos0;
        OutputStreamWriter osw0;

        fos0 = new FileOutputStream(resultF10);
        osw0 = new OutputStreamWriter(fos0, StandardCharsets.UTF_8);

        osw0.write(Data);
        osw0.flush();
        fos0.close();
        osw0.close();
    }

    /**
     * 寫入來自json檔的內容，輸出成xml檔
     *
     * @param Doc 產生的xml資訊(Document)
     *
     * @throws IOException 拋出IO類的異常到呼叫處處理
     */
    /*寫入來自json檔的內容，輸出成xml檔*/
    protected static void writeResultXML12(Document Doc) throws IOException{
        OutputFormat of0 = OutputFormat.createPrettyPrint();
        FileOutputStream fos0;
        XMLWriter xmlW0;

        fos0 = new FileOutputStream(resultF12);
        of0.setEncoding("UTF-8");
        xmlW0 = new XMLWriter(new OutputStreamWriter(fos0), of0);

        xmlW0.write(Doc);
        xmlW0.flush();
        fos0.close();
        xmlW0.close();
    }

    /**
     * 寫入來自xml檔的內容，輸出成csv檔
     *
     * @param Data 產生的csv資訊(String)
     *
     * @throws IOException 拋出IO類的異常到呼叫處處理
     */
    /*寫入來自xml檔的內容，輸出成csv檔*/
    protected static void writeResultCSV20(String Data) throws IOException{
        FileOutputStream fos0;
        OutputStreamWriter osw0;

        fos0 = new FileOutputStream(resultF20);
        osw0 = new OutputStreamWriter(fos0, StandardCharsets.UTF_8);

        osw0.write(Data);
        osw0.flush();
        fos0.close();
        osw0.close();
    }

    /**
     * 寫入來自xml檔的內容，輸出成json檔
     *
     * @param Data 產生的json資訊(String)
     *
     * @throws IOException 拋出IO類的異常到呼叫處處理
     */
    /*寫入來自xml檔的內容，輸出成json檔*/
    protected static void writeResultJSON21(String Data) throws IOException{
        FileOutputStream fos0;
        OutputStreamWriter osw0;

        fos0 = new FileOutputStream(resultF21);
        osw0 = new OutputStreamWriter(fos0, StandardCharsets.UTF_8);

        osw0.write(Data);
        osw0.flush();
        fos0.close();
        osw0.close();
    }

    /**
     * 寫入來自json檔的內容，輸出成不同格式的json檔
     *
     * @param Data 產生的json資訊(String)
     *
     * @throws IOException 拋出IO類的異常到呼叫處處理
     */
    /*寫入來自json檔的內容，輸出成不同格式的json檔*/
    protected static void writeResultJSON13(String Data) throws IOException{
        FileOutputStream fos0;
        OutputStreamWriter osw0;

        fos0 = new FileOutputStream(resultF3);
        osw0 = new OutputStreamWriter(fos0, StandardCharsets.UTF_8);

        osw0.write(Data);
        osw0.flush();
        fos0.close();
        osw0.close();
    }

    /**
     * 寫入來自xml檔的內容，輸出成不同格式的xml檔
     *
     * @param Doc 產生的xml資訊(Document)
     *
     * @throws IOException 拋出IO類的異常到呼叫處處理
     */
    /*寫入來自xml檔的內容，輸出成不同格式的xml檔*/
    protected static void writeResultXML24(Document Doc) throws IOException{
        OutputFormat of0 = OutputFormat.createPrettyPrint();
        FileOutputStream fos0;
        XMLWriter xmlW0;

        fos0 = new FileOutputStream(resultF4);
        of0.setEncoding("UTF-8");
        xmlW0 = new XMLWriter(new OutputStreamWriter(fos0), of0);

        xmlW0.write(Doc);
        xmlW0.flush();
        fos0.close();
        xmlW0.close();
    }

    /**
     * 讀取csv檔
     *
     * @return 回傳檔案內容(String)
     *
     * @throws IOException 拋出IO類的異常到呼叫處處理
     */
    /*讀取csv檔*/
    protected static String readResultCSV() throws IOException{
        FileInputStream fis0;
        InputStreamReader isr0;
        int count;

        fis0 = new FileInputStream(resultF0);
        isr0 = new InputStreamReader(fis0, StandardCharsets.UTF_8);
        StringBuilder sb0 = new StringBuilder();

        while((count = isr0.read()) != -1){
            char inputChar = (char)count;
            sb0.append(inputChar);
        }

        fis0.close();
        isr0.close();

        return sb0.toString();
    }

    /**
     * 讀取json檔
     *
     * @return 回傳檔案內容(String)
     *
     * @throws IOException 拋出IO類的異常到呼叫處處理
     */
    /*讀取json檔*/
    protected static String readResultJSON() throws IOException{
        FileInputStream fis0;
        InputStreamReader isr0;
        int count;

        fis0 = new FileInputStream(resultF1);
        isr0 = new InputStreamReader(fis0, StandardCharsets.UTF_8);
        StringBuilder sb0 = new StringBuilder();

        while((count = isr0.read()) != -1){
            char inputChar = (char)count;
            sb0.append(inputChar);
        }

        fis0.close();
        isr0.close();

        return sb0.toString();
    }

    /**
     * 讀取xml檔
     *
     * @return 回傳檔案內容(Document)
     *
     * @throws IOException 拋出IO類的異常到呼叫處處理
     */
    /*讀取xml檔*/
    protected static Document readResultXML() throws IOException, DocumentException {
        FileInputStream fis0;
        InputStreamReader isr0;
        SAXReader saxR0;
        Document doc0;

        fis0 = new FileInputStream(resultF2);
        isr0 = new InputStreamReader(fis0, StandardCharsets.UTF_8);
        saxR0 = new SAXReader();
        doc0 = saxR0.read(isr0);

        fis0.close();
        isr0.close();

        return doc0;
    }

    /**
     * 讀取不同格式的json檔
     *
     * @return 回傳檔案內容(String)
     *
     * @throws IOException 拋出IO類的異常到呼叫處處理
     */
    /*讀取不同格式的json檔*/
    protected static String readResultJSON13() throws IOException{
        FileInputStream fis0;
        InputStreamReader isr0;
        int count;

        fis0 = new FileInputStream(resultF3);
        isr0 = new InputStreamReader(fis0, StandardCharsets.UTF_8);
        StringBuilder sb0 = new StringBuilder();

        while((count = isr0.read()) != -1){
            char inputChar = (char)count;
            sb0.append(inputChar);
        }

        fis0.close();
        isr0.close();

        return sb0.toString();
    }

    /**
     * 讀取xml檔
     *
     * @return 回傳檔案內容(Document)
     *
     * @throws IOException 拋出IO類的異常到呼叫處處理
     */
    /*讀取xml檔*/
    protected static Document readResultXML24() throws IOException, DocumentException {
        FileInputStream fis0;
        InputStreamReader isr0;
        SAXReader saxR0;
        Document doc0;

        fis0 = new FileInputStream(resultF4);
        isr0 = new InputStreamReader(fis0, StandardCharsets.UTF_8);
        saxR0 = new SAXReader();
        doc0 = saxR0.read(isr0);

        fis0.close();
        isr0.close();

        return doc0;
    }

    /**
     * 確認輸出csv檔、json檔、xml檔所需的目錄是否存在
     *
     * @return 回傳true代表目錄已存在
     */
    /*確認輸出csv檔、json檔、xml檔所需的目錄是否存在*/
    protected static boolean checkDir(){
        return dir0.exists();
    }

    /**
     * 確認這個檔案是否為目錄
     *
     * @return 回傳true代表工作目錄/data為目錄
     */
    /*確認這個檔案是否為目錄*/
    protected static boolean checkFileIsDir(){
        return dir0.isDirectory();
    }

    /**
     * 確認輸出csv檔是否存在
     *
     * @return true代表輸出檔案存在
     */
    /*確認輸出csv檔是否存在*/
    protected static boolean checkResultCSV() {
        return resultF0.exists();
    }

    /**
     * 確認輸出json檔是否存在
     *
     * @return true代表來源檔案存在
     */
    /*確認輸出json檔是否存在*/
    protected static boolean checkResultJSON() {
        return resultF1.exists();
    }
    
    /**
     * 確認輸出xml檔是否存在
     *
     * @return true代表來源檔案存在
     */
    /*確認輸出xml檔是否存在*/
    protected static boolean checkResultXML() {
        return resultF2.exists();
    }

    /**
     * 確認輸出不同格式的json檔是否存在
     *
     * @return true代表來源檔案存在
     */
    /*確認輸出不同格式的json檔是否存在*/
    protected static boolean checkResultJSON13() {
        return resultF3.exists();
    }

    /**
     * 確認輸出不同格式的xml檔是否存在
     *
     * @return true代表來源檔案存在
     */
    /*確認輸出不同格式的xml檔是否存在*/
    protected static boolean checkResultXML24() {
        return resultF4.exists();
    }

    /**
     * 取得csv檔案的路徑
     *
     * @return csv檔案的絕對路徑
     */
    /*取得csv檔案的路徑*/
    protected static String getResultCSVPath(){
        return resultF0.getAbsolutePath();
    }

    /**
     * 取得json檔案的路徑
     *
     * @return json檔案的絕對路徑
     */
    /*取得json檔案的路徑*/
    protected static String getResultJSONPath(){
        return resultF1.getAbsolutePath();
    }

    /**
     * 取得xml檔案的路徑
     *
     * @return xml檔案的絕對路徑
     */
    /*取得xml檔案的路徑*/
    protected static String getResultXMLPath(){
        return resultF2.getAbsolutePath();
    }

    /**
     * 取得由csv檔所產生的json檔的路徑
     *
     * @return 由csv檔所產生的json檔的絕對路徑
     */
    /*取得由csv檔所產生的json檔的路徑*/
    protected static String getResultJSON01Path(){
        return resultF01.getAbsolutePath();
    }

    /**
     * 取得由csv檔所產生的xml檔的路徑
     *
     * @return 由csv檔所產生的xml檔的絕對路徑
     */
    /*取得由csv檔所產生的xml檔的路徑*/
    protected static String getResultXML02Path(){
        return resultF02.getAbsolutePath();
    }

    /**
     * 取得由json檔所產生的csv檔的路徑
     *
     * @return 由json檔所產生的csv檔的絕對路徑
     */
    /*取得由json檔所產生的csv檔的路徑*/
    protected static String getResultCSV10Path(){
        return resultF10.getAbsolutePath();
    }

    /**
     * 取得由json檔所產生的xml檔的路徑
     *
     * @return 由json檔所產生的xml檔的絕對路徑
     */
    /*取得由json檔所產生的xml檔的路徑*/
    protected static String getResultXML12Path(){
        return resultF12.getAbsolutePath();
    }

    /**
     * 取得由xml檔所產生的csv檔的路徑
     *
     * @return 由xml檔所產生的csv檔的絕對路徑
     */
    /*取得由xml檔所產生的csv檔的路徑*/
    protected static String getResultCSV20Path(){
        return resultF20.getAbsolutePath();
    }

    /**
     * 取得由xml檔所產生的json檔的路徑
     *
     * @return 由xml檔所產生的json檔的絕對路徑
     */
    /*取得由xml檔所產生的json檔的路徑*/
    protected static String getResultJSON21Path(){
        return resultF21.getAbsolutePath();
    }

    /**
     * 取得由json檔所產生的不同格式json檔的路徑
     *
     * @return 由json檔所產生的不同格式json檔的絕對路徑
     */
    /*取得由json檔所產生的不同格式json檔的路徑*/
    protected static String getResultJSON13Path(){
        return resultF3.getAbsolutePath();
    }

    /**
     * 取得由xml檔所產生的不同格式xml檔的路徑
     *
     * @return 由xml檔所產生的不同格式xml檔的絕對路徑
     */
    /*取得由json檔所產生的不同格式json檔的路徑*/
    protected static String getResultXML24Path(){
        return resultF4.getAbsolutePath();
    }
}
